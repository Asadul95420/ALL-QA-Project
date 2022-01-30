package com.hw4;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {


        System.out.print("Enter First name: ");
        Scanner scan = new Scanner(System.in);
        String fname = scan.nextLine();

        System.out.print("Enter Middle name: ");
        Scanner scan2 = new Scanner(System.in);
        String mname = scan2.nextLine();

        System.out.print("Enter Last name: ");
        Scanner scan3 = new Scanner(System.in);
        String lname =scan3.nextLine();
        String fullname=(fname+" "+mname+" "+lname);
        System.out.println("Your full name is: "+fullname.toUpperCase());
        System.out.println("Total Carecter: "+fullname.length());

        String name="MD Asadul Islam";


        if(fullname.equalsIgnoreCase(name)){
            System.out.println("*****Correct Name.*****");

        }
        else{
            System.out.println("*****Incorrect Name.*****");

        }







    }



}
