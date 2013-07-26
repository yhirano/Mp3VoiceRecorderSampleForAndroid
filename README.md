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
### LAME

LAME source code licensed under the LGPL.

### Mp3VoiceRecorderSampleForAndroid

MIT License

Copyright (c) 2011-2012 Yuichi Hirano

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.

## Others
* Work Galaxy Tab and Nexus One.
* Not work on the Android emulator.
