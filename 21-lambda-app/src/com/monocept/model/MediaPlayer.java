package com.monocept.model;

public interface MediaPlayer {
	void start();
	void stop();
	default void supportedfiles() {
		System.out.println("supported file : mp3, mp4");
	}
}
