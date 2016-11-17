package com.company;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // READING A FILE

        Scanner sc = new Scanner(new File("MyData.txt")); //Opens file.
        int maxIndex = -1;
        String text[] = new String[1000];

        while (sc.hasNext()) {
            maxIndex++;
            text[maxIndex] = sc.nextLine();
        }

        sc.close(); //Closes file.

        for (int j = 0; j <= maxIndex; j++) {
            System.out.println(text[j]);
        }

        // CREATING FILES

        FileWriter fw = new FileWriter("Output.txt", true);
        /*
        Second parameter appends information.
        Appending adds information to a file.
         */
        PrintWriter pw = new PrintWriter(fw);

        pw.println("Oh yeah.");
        pw.println(3);

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your password.");
        String password = kb.nextLine();

        pw.println(password);

        pw.close();
        fw.close();

    }
}
