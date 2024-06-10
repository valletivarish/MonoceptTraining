package com.monocept.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.monocept.exceptions.CapacityFullException;
import com.monocept.exceptions.NoSuchMovieFoundException;
import com.monocept.model.Movie;

public class MovieDeserializable {

	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Movie> movies=new ArrayList<Movie>(5);
		FileInputStream inputStream=new FileInputStream("D:\\Monocept\\18-exceptionhandling-app\\src\\com\\monocept\\test\\MoviesList.txt");
		ObjectInputStream MovieList=new ObjectInputStream(inputStream);
		movies=(ArrayList<Movie>) MovieList.readObject();
		boolean exit=false;
		while(!exit) {
			System.out.println("Choose the option from menu : \n1. Display Movies \n2. Add movie \n3. Display a particular movie \n4. Exit");
			int option=scanner.nextInt();
			switch(option) {
			case 1:
					displayAllMovies(movies);
				break;
			case 2:
				try {
					addMovie(movies,scanner);
					System.out.println("Movie added successfully.....");
				}
				catch(CapacityFullException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					displayAMovie(movies,scanner);
				}
				catch(NoSuchMovieFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Thank you User");
				exit=true;
			}
			
		}

	}

	private static void displayAMovie(ArrayList<Movie> movies, Scanner scanner) {
		System.out.println("Enter movie id for searching the movie : ");
		int movieID=scanner.nextInt();
		boolean notFound=true;
		for(Movie movie:movies) {
			if(movie.getMovieId()==movieID) {
				notFound=false;
				System.out.println("Movie Id : "+movie.getMovieId());
				System.out.println("Movie Name : "+movie.getMovieName());
				System.out.println("Movie Genre :"+movie.getGenre());
				System.out.println("Movie Year : "+movie.getYear());
				System.out.println();
			}
		}
		if(notFound) {
			throw new NoSuchMovieFoundException();
		}
		
	}

	private static void addMovie(ArrayList<Movie> movies, Scanner scanner) {
		Movie movie=new Movie();
		if(movies.size()==5) {
			throw new CapacityFullException();
		}
		System.out.println("Enter the details of movie");
		System.out.print("Enter the movie id :");
		movie.setMovieId(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Enter the movie name : ");
		movie.setMovieName(scanner.nextLine());
		System.out.print("Enter the movie genre : ");;
		movie.setGenre(scanner.next());
		System.out.print("Enter the movie year : ");
		movie.setYear(scanner.nextInt());
		movies.add(movie);
	}

	private static void displayAllMovies(ArrayList<Movie> movies) {
		int i=1;
		for(Movie movie:movies) {
			System.out.println("Movie "+i);
			System.out.println("Movie Id : "+movie.getMovieId());
			System.out.println("Movie Name : "+movie.getMovieName());
			System.out.println("Movie Genre :"+movie.getGenre());
			System.out.println("Movie Year : "+movie.getYear());
			System.out.println();
			i++;
		}
		
	}

}
