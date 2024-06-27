package com.monocept.model;

public class PodcastPlayer implements MediaPlayer{
	@Override
	public void start() {
		System.out.println("Podcast is started");
		
	}
	@Override
	public void stop() {
		System.out.println("Podcast is stopped");
		
	}
	public void supportedfiles() {
		System.out.println("supported file : mp3, mp4");
		
	}
}
