package com.monocept.model;

public class Video extends Playable {

	private String title;
	private int resolution;
	
	public Video(String title, int resolution) {
		super();
		this.title = title;
		this.resolution = resolution;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public Video() {
		super();
	}

	@Override
	public void play() {
		System.out.println("is playing");
	}

	@Override
	public void pause() {
		System.out.println("is paused");
	}

	@Override
	public void stop() {
		System.out.println("is stopped");
	}

}
