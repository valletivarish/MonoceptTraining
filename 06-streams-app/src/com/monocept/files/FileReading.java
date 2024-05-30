package com.monocept.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReading {

    public static void main(String[] args) {
        FileReader fileReader=null;
        FileWriter fileWriter=null;
        try {
            fileReader = new FileReader("D:\\Monocept\\06-streams-app\\src\\com\\monocept\\files\\demo.txt");
            fileWriter = new FileWriter("D:\\Monocept\\06-streams-app\\src\\com\\monocept\\files\\copy.txt");

            int characterCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            int ch;

            while ((ch = fileReader.read()) != -1) {
                char currentChar = (char) ch;

                if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z')) {
                    characterCount++;
                } else if (currentChar == ' ' || currentChar == '\n') {
                    wordCount++;
                }
                if (currentChar == '\n') {
                    lineCount++;
                }
                fileWriter.write(currentChar);
            }
            if (characterCount > 0) {
                wordCount++;
            }
            if (characterCount > 0 || wordCount > 0) {
                lineCount++;
            }
            
            System.out.println("Total character count: " + characterCount);
            
            System.out.println("Total word count: " + wordCount);
            
            System.out.println("Total line count: " + lineCount);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
