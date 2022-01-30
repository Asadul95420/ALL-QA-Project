package com.hw3;

import java.util.Scanner;

public class Celcias {

        public static void main(String[] args) {
            float fahrenheit,celsius;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the fahrenheit temperature :");
            fahrenheit = scan.nextFloat();
            celsius = (fahrenheit-32)*5/9;
            System.out.println("Celsius temperature: "+celsius);
            System.out.println( );
            scan.close();
        }



}
