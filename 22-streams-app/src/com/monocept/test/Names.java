package com.monocept.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Names {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of names:");
        int numberOfNames = scanner.nextInt();
        scanner.nextLine();

        List<String> names = new ArrayList<>();
        String filePath = "D:\\Monocept\\22-streams-app\\src\\com\\monocept\\test\\names.txt";

        for (int i = 0; i < numberOfNames; i++) {
            System.out.println("Enter the name of person " + (i + 1) + ":");
            String name = scanner.nextLine();
            names.add(name);
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
            for (String name : names) {
                fileOutputStream.write((name + "\n").getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("1. Reading the names from the provided text file and storing them in a List of Strings.");
        List<String> readNames = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                readNames.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Read the following names from the file:");
        readNames.forEach(name -> System.out.println(name));

        System.out.println("Press Enter to continue to the next step.");
        scanner.nextLine();

        System.out.println("2. Filtering the names to include only those that start with a specific letter.");
        System.out.println("Enter the letter you want to filter by:");
        String filterLetter = scanner.next();
        readNames.stream()
                 .filter(name -> name.startsWith(filterLetter))
                 .forEach(name -> System.out.println(name));

        System.out.println("Press Enter to continue to the next step.");
        scanner.nextLine();
        scanner.nextLine();

        System.out.println("3. Converting all names to uppercase.");
        readNames.stream()
                 .map(name -> name.toUpperCase())
                 .forEach(name -> System.out.println(name));

        System.out.println("Press Enter to continue to the next step.");
        scanner.nextLine();

        System.out.println("4. Sorting the names alphabetically.");
        readNames.stream()
                 .sorted()
                 .forEach(name -> System.out.println(name));

        System.out.println("Press Enter to continue to the next step.");
        scanner.nextLine();

        System.out.println("5. Removing duplicate names from the list.");
        readNames.stream()
                 .distinct()
                 .forEach(name -> System.out.println(name));

        System.out.println("Press Enter to continue to the next step.");
        scanner.nextLine();

        System.out.println("6. Collecting the names into a new list.");
        List<String> uniqueNames = readNames.stream().distinct().collect(Collectors.toList());
        uniqueNames.forEach(name -> System.out.println(name));

        System.out.println("Press Enter to continue to the next step.");
        scanner.nextLine();

        System.out.println("7. Counting the number of names that do not contain a certain letter.");
        System.out.println("Enter the letter you want to exclude:");
        String excludeLetter = scanner.next();
        long countNamesWithoutLetter = uniqueNames.stream().filter(name -> !name.contains(excludeLetter)).count();
        System.out.println("Count: " + countNamesWithoutLetter);

        System.out.println("Press Enter to continue to the next step.");
        scanner.nextLine();
        scanner.nextLine();

        System.out.println("8. Concatenating all the names into a single string separated by commas.");
        String concatenatedNames = uniqueNames.stream().collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);

        System.out.println("Press Enter to continue to the next step.");
        scanner.nextLine();

        System.out.println("9. Filtering names that start with 'J', converting them to uppercase, sorting them, and collecting them into a list.");
        List<String> filteredNames = uniqueNames.stream()
                                                .filter(name -> name.startsWith("J"))
                                                .map(name -> name.toUpperCase())
                                                .sorted()
                                                .collect(Collectors.toList());
        System.out.println("Filtered and Sorted List:");
        filteredNames.forEach(name -> System.out.println(name));

        System.out.println("Program completed.");
    }
}
