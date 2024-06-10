package com.monocept.test;

import java.util.Scanner;
import com.monocept.model.Audio;
import com.monocept.model.Playable;
import com.monocept.model.Video;

public class PlayableTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playable[] audioLibrary = new Audio[1];
        Playable[] videoLibrary = new Video[1];

        System.out.println("Enter the details of audio and video to create your library: \n");

        initializeLibrary(scanner, audioLibrary, "audio");
        initializeLibrary(scanner, videoLibrary, "video");

        boolean exit = false;
        while (!exit) {
            System.out.println("Choose type of playable: \n1. Audio \n2. Video \n3. Exit");
            int typeOfPlayable = scanner.nextInt();
            switch (typeOfPlayable) {
                case 1:
                    System.out.println("You chose audio");
                    choosePlayable(scanner, audioLibrary);
                    break;
                case 2:
                    System.out.println("You chose video");
                    choosePlayable(scanner, videoLibrary);
                    break;
                case 3:
                    System.out.println("Thank you for visiting for more entertainment");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option! Please choose again.");
                    break;
            }
        }

        scanner.close();
    }

    private static void initializeLibrary(Scanner scanner, Playable[] library, String type) {
        for (int i = 0; i < library.length; i++) {
            System.out.print("Enter the title for " + type + " " + (i + 1) + " : ");
            String title = scanner.next();
            if (type.equals("video")) {
                System.out.print("Enter the resolution for video " + (i + 1) + " : ");
                int resolution = scanner.nextInt();
                library[i] = new Video(title, resolution);
            } else {
                library[i] = new Audio(title);
            }
        }
        System.out.println();
    }

    private static void choosePlayable(Scanner scanner, Playable[] library) {
        System.out.println("Choose a playable from available options: ");
        for (int i = 0; i < library.length; i++) {
            if (library[i] instanceof Audio) {
                System.out.println((i + 1) + ". " + ((Audio) library[i]).getTitle());
            } else if (library[i] instanceof Video) {
                System.out.println((i + 1) + ". " + ((Video) library[i]).getTitle());
            }
        }
        int choice = scanner.nextInt();
        if (choice < 1 || choice > library.length) {
            System.out.println("Invalid choice! Please choose a valid option.");
            return;
        }
        Playable chosenPlayable = library[choice - 1];
        interactWithPlayable(scanner, chosenPlayable);
    }

    private static void interactWithPlayable(Scanner scanner, Playable playable) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Choose operation: \n1. Play \n2. Pause \n3. Stop \n4. Exit");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    System.out.println(playable.getClass().getSimpleName() + " " + ((Audio) playable).getTitle());
                    playable.play();
                    break;
                case 2:
                    System.out.println(playable.getClass().getSimpleName() + " " + ((Audio) playable).getTitle());
                    playable.pause();
                    break;
                case 3:
                    System.out.println(playable.getClass().getSimpleName() + " " + ((Audio) playable).getTitle());
                    playable.stop();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid operation! Please choose a valid option.");
                    break;
            }
        }
    }
}
