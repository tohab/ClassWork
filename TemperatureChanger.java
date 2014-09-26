/*
*  Convert user input in the format xxxF or yyyC from Celsius to Farenheit
*
*  @author Kent Collins
*  @version 25 September, 2014
**/

import java.util.Scanner;

public class TemperatureChanger {

  public static void main (String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter a number immediately followed by a C or F, to indicate the temperature.");
    String input = scanner.next();
    // TODO - scan for input in the format 175F or 18C 
    // TODO - perform correct conversion
    if (input.charAt(input.length()-1) == 'C') {
       double temp = Double.parseDouble(input.substring(0,input.length()-1));
       System.out.println("That temperature in Fahrenheit is " +  (temp * 1.8 + 32));
    }
    if (input.charAt(input.length()-1) == 'F') {
       double temp = Double.parseDouble(input.substring(0,input.length()-1));
       System.out.println("That temperature in Celsius is " + (temp - 32) / 1.8);
    }

    // TODO - print out results to the screen
  }
  
}


