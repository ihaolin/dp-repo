package me.hao0.design.pattern.gof.structure.adapter;

/**
 * 音频播放器，只能播放mp3
 * 现在通过适配模式(MediaAdapter)，使其可以模仿mp4, vic
 */
public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {

		// inbuilt support to play mp3 music files
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		// mediaAdapter is providing support to play other file formats
		else if (audioType.equalsIgnoreCase("vlc")
				|| audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. " + audioType
					+ " format not supported");
		}
	}
}