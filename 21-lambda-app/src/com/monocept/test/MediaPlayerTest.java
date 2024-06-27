package com.monocept.test;

import com.monocept.model.AudioPlayer;
import com.monocept.model.MediaPlayer;
import com.monocept.model.PodcastPlayer;
import com.monocept.model.VideoPlayer;

public class MediaPlayerTest {

	public static void main(String[] args) {
		MediaPlayer mediaPlayer=new AudioPlayer();
		mediaPlayer.supportedfiles();
		mediaPlayer.start();
		mediaPlayer.stop();
		System.out.println();
		mediaPlayer=new VideoPlayer();
		mediaPlayer.supportedfiles();
		mediaPlayer.start();
		mediaPlayer.stop();
		System.out.println();
		mediaPlayer=new PodcastPlayer();
		mediaPlayer.supportedfiles();
		mediaPlayer.start();
		mediaPlayer.stop();
	}

}
