package com.uraroji.garage.android.mp3recvoice;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	// エミュレータではマイクからの入力サンプリングレートは8KHzしかサポートしていない模様
	private RecMicToMp3 mRecMicToMp3 = new RecMicToMp3(
			Environment.getExternalStorageDirectory() + "/mezzo.mp3", 8000);

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final TextView statusTextView = (TextView) findViewById(R.id.StatusTextView);

		mRecMicToMp3.setHandle(new Handler() {
			@Override
			public void handleMessage(Message msg) {
				switch (msg.what) {
				case RecMicToMp3.MSG_REC_STARTED:
					statusTextView.setText("録音中");
					break;
				case RecMicToMp3.MSG_REC_STOPPED:
					statusTextView.setText("");
					break;
				case RecMicToMp3.MSG_ERROR_GET_MIN_BUFFERSIZE:
					statusTextView.setText("");
					Toast.makeText(MainActivity.this,
							"録音が開始できませんでした。この端末が録音をサポートしていない可能性があります。",
							Toast.LENGTH_LONG).show();
					break;
				case RecMicToMp3.MSG_ERROR_CREATE_FILE:
					statusTextView.setText("");
					Toast.makeText(MainActivity.this, "ファイルが生成できませんでした",
							Toast.LENGTH_LONG).show();
					break;
				case RecMicToMp3.MSG_ERROR_AUDIO_RECORD:
					statusTextView.setText("");
					Toast.makeText(MainActivity.this, "録音ができませんでした",
							Toast.LENGTH_LONG).show();
					break;
				case RecMicToMp3.MSG_ERROR_AUDIO_ENCODE:
					statusTextView.setText("");
					Toast.makeText(MainActivity.this, "エンコードに失敗しました",
							Toast.LENGTH_LONG).show();
					break;
				case RecMicToMp3.MSG_ERROR_WRITE_FILE:
					statusTextView.setText("");
					Toast.makeText(MainActivity.this, "ファイルの書き込みに失敗しました",
							Toast.LENGTH_LONG).show();
					break;
				case RecMicToMp3.MSG_ERROR_CLOSE_FILE:
					statusTextView.setText("");
					Toast.makeText(MainActivity.this, "ファイルの書き込みに失敗しました",
							Toast.LENGTH_LONG).show();
					break;
				default:
					break;
				}
			}
		});

		Button startButton = (Button) findViewById(R.id.StartButton);
		startButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mRecMicToMp3.start();
			}
		});
		Button stopButton = (Button) findViewById(R.id.StopButton);
		stopButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mRecMicToMp3.stop();
			}
		});
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		mRecMicToMp3.stop();
	}
}
