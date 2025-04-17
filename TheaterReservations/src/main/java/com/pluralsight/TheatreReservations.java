package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheatreReservations {


    public static void main(String[] args) {
        Scanner movieDate = new Scanner(System.in);

        //ask fpr full name

        System.out.print("Enter your full name please");
        String fullName = movieDate.nextLine().trim();

        //split the full name into first and last
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        //what date do they want
        System.out.print("What date will you be coming (MM/dd/yyyy):");
        String date = movieDate.nextLine().trim();

        DateTimeFormatter newWayFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate newDate = LocalDate.parse(date, newWayFormatter);
        System.out.print(newDate);

        //ask how many tickets do they need

        System.out.print("How many tickets do you need?");
        int ticketAmount = movieDate.nextInt();

        //ensure the ticket text is accurate
        String ticketText = ticketAmount == 1 ? "ticket" : "tickets";

        //show the display with and without the s
        if (ticketAmount > 1) {
            System.out.println(ticketAmount + " Tickets reserved for " + newDate + " under " + lastName + firstName);
        } else {
            System.out.println(ticketAmount + " Ticket reserved for " + newDate + " under " + lastName + firstName);
        }

    }






        //how many tickets do they want






    }




