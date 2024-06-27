package com.monocept.model;

public class VideoPlayer implements MediaPlayer{
	@Override
	public void start() {
		System.out.println("video is started");
		
	}
	@Override
	public void stop() {
		System.out.println("Video is stopped");
		
	}
	public void supportedfiles() {
		System.out.println("supported file : mp3, mp4");
		
	}
}
