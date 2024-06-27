package com.monocept.model;

public class AudioPlayer implements MediaPlayer{

	@Override
	public void start() {
		System.out.println("Audio is started");
		
	}

	@Override
	public void stop() {
		System.out.println("Audio is stopped");
		
	}

	public void supportedfiles() {
		System.out.println("supported file : mp3, mp4");
		
	}

}
