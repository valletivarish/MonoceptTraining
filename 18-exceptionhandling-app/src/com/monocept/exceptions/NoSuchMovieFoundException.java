package com.monocept.exceptions;

public class NoSuchMovieFoundException extends RuntimeException{
	
	public String getMessage() {
		return "Whoops! Couldn't find the movie you're looking for. Double-check the movie ID and try again!";
	}
}
