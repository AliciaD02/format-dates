package com.pluralsight;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class FormattingDates {
 // always start with a public static void main method
  public static void main(String[] args) {
      // because it is asking for the current date and time, we will use the LocalDateTime
      //.now means it is for current time and date.

    LocalDateTime date = LocalDateTime.now();

    //we need to format the current date ("MM/dd/yyyy")
      // after doing that we need to store the formatted date .
      // currentDate is our variable name
    DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    // we need to store the data in a string variable because its returning a date.
      String formattedDate = date.format(currentDate);
    //print out the formatted date
    System.out.println("Today is" + " " + formattedDate);
      //we need to format the current date in this method ("yyyy-MM-dd")
      DateTimeFormatter currentDate2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

      //add a String variable to store the formatted date ("yyyy-MM-dd")
      String currentFormatter = date.format(currentDate2);
      //print out the formatted date
      System.out.println("Today is" + " " + currentFormatter);


      //we need to format the current date in this method ("EEEE dd, yyyy")
      DateTimeFormatter currentDate3 = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
      //add a String variable to store it
      String currentFormatter3 = date.format(currentDate3);
      //print date
      System.out.println("Today is" + " " + currentFormatter3);

       //format ("EEEE, MMM  dd, yyyy hh:mm  ")
      DateTimeFormatter currentDate4 = DateTimeFormatter.ofPattern("EEEE, MMM  dd, yyyy hh:mm  ");
      //add the string variable to store it
      String currentFormatter4 = date.format(currentDate4);
              //print date
      System.out.println("Today is" + " " + currentFormatter4);

  }


    }

