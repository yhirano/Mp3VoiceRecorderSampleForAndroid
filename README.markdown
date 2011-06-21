# Mp3VoiceRecorderSampleForAndroid

MP3 voice recorder sample for Android.

## Function

* Press the "Start" to start recording, then press the stop button to stop recording.
* Recorded content is saved mezzo.mp3 on the SD card root directory(/sdcard or /mnt/sdcard).

## Technical term

* [LAME MP3 encoder](http://lame.sourceforge.net/) is used.
* LAME is builded Android NDK and called JNI from Application.
* See [https://github.com/yhirano/Mp3VoiceRecorderSampleForAndroid/blob/master/jni/Note.txt](https://github.com/yhirano/Mp3VoiceRecorderSampleForAndroid/blob/master/jni/Note.txt) about the build way.
* A voice input the microphone, and real-time MP3 encoding.
  
## Others

* LAME is LGPL.
* The source code is free and no warranty expect LAME.
* Work Galaxy Tab and Nexus One.
* Not work on the Android emulator.