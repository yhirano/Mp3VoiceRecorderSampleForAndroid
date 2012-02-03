# Mp3VoiceRecorderSampleForAndroid
MP3 voice recorder sample for Android.

## Usage
* Press the "Start" button to start recording, then press the "Stop" button to stop recording.
* Recorded content is saved mezzo.mp3 on the SD card root directory(/sdcard or /mnt/sdcard).

## Technical term
* Mp3VoiceRecorderSampleForAndroid use [LAME MP3 encoder](http://lame.sourceforge.net/).
* LAME is builded Android NDK and called JNI from the application.
* See [https://github.com/yhirano/Mp3VoiceRecorderSampleForAndroid/blob/master/jni/Note.txt](https://github.com/yhirano/Mp3VoiceRecorderSampleForAndroid/blob/master/jni/Note.txt) about the build way.
* A voice input the microphone, and real-time MP3 encoding.
 
## License
* LAME source code licensed under the LGPL.
* The source code is free and no warranty except for LAME.

## Others
* Work Galaxy Tab and Nexus One.
* Not work on the Android emulator.
