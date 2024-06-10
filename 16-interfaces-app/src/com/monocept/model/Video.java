package com.monocept.model;

public class Video implements Playable{
	private String title;
	private int resolution;
	public Video(String title, int resolution) {
		super();
		this.title = title;
		this.resolution = resolution;
	}

	@Override
	public void play() {
		System.out.println(title+" is playing with the resolution "+resolution);
		
	}

	@Override
	public void pause() {
		System.out.println(title+" is paused");
		
	}

	@Override
	public void stop() {
		System.out.println(title+" is stopped");
		
	}



}
