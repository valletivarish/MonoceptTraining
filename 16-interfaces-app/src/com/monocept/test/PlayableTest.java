package com.monocept.test;

import com.monocept.model.Audio;
import com.monocept.model.Playable;
import com.monocept.model.Video;

public class PlayableTest {

	public static void main(String[] args) {
		Playable type;
		type=new Audio("song");
		type.play();
		type.pause();
		type.stop();
		type=new Video("movie",1080);
		System.out.println();
		type.play();
		type.pause();
		type.stop();
		
	}

}
