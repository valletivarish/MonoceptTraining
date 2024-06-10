package com.monocept.model;

public class Audio extends Playable {

	private String title;
	
	public Audio(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Audio() {
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
