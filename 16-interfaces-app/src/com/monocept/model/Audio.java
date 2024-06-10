package com.monocept.model;

public class Audio implements Playable{
	private String title;
	
	public Audio(String title) {
		super();
		this.title = title;
	}

	@Override
	public void play() {
		System.out.println(title+" is playing");
		
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
