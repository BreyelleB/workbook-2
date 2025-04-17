package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        Scanner namesScanner= new Scanner(System.in);

        ArrayList<String> wholeName = new ArrayList<String>();

        //ask the user to enter the parts of their name
        //trim any leading or trailing spaces after scanner
        System.out.println("enter your first name");
        String firstName = namesScanner.nextLine().trim();



        //second line will be middle name if any
        System.out.println("enter your middle name");
        String middleName = namesScanner.nextLine().trim();

        //third line will be last name
        System.out.println("enter your last name");
        String lastName = namesScanner.nextLine().trim();

        //fourth line will be suffix if any
        System.out.println("add suffix");
        String suffix = namesScanner.nextLine().trim();


        //if statements for middle name and suffix

        if(middleName.isEmpty()) {
            wholeName.add(1, middleName);

        }
       if(suffix.isEmpty()) {
           wholeName.set(2,lastName +"," );

       }
       else(suffix.has)
           wholeName.add(suffix);




    }
}
