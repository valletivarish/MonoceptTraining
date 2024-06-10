package com.monocept.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import com.monocept.model.Movie;

public class MovieSerializableTest {

	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Movie> movies= new ArrayList<Movie>(5);
		boolean exit=false;
		while(!exit) {
			System.out.println("choose a option : \n1. Add a movie \n2. Display \n3. Exit");
			int option = scanner.nextInt();
			switch(option) {
			case 1:
				addMovie(movies,scanner);
				break;
			case 2:
				displayMovie(movies);
				break;
			case 3:
				System.out.println("Thank you for visting!!!");
				exit=true;
			}
		}
		FileOutputStream outputFile=new FileOutputStream("D:\\Monocept\\18-exceptionhandling-app\\src\\com\\monocept\\test\\MoviesList.txt"); 
		ObjectOutputStream movieList=new ObjectOutputStream(outputFile);
		movieList.writeObject(movies);
		
	}

	private static void displayMovie(ArrayList<Movie> movies) {
		for(Movie movie : movies) {
			System.out.println("Movie Id : "+movie.getMovieId());
			System.out.println("Movie Name : "+movie.getMovieName());
			System.out.println("Movie genre : "+movie.getGenre());
			System.out.println("Movie year : "+movie.getYear());
		}
		
	}

	private static void addMovie(ArrayList<Movie> movies, Scanner scanner) {
		Movie movie=new Movie();
		System.out.println("Enter the details of the movie : ");
		System.out.print("Enter the movie id :");
		movie.setMovieId(scanner.nextInt());
		System.out.print("Enter the movie name : ");
		movie.setMovieName(scanner.next());
		System.out.print("Enter the movie genre : ");;
		movie.setGenre(scanner.next());
		System.out.print("Enter the movie year : ");
		movie.setYear(scanner.nextInt());
		movies.add(movie);
	}
}
