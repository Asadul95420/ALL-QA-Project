package com.hw3;

import java.util.Scanner;

public class Gradiing {
    public static void main(String[] args) {

        int result;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Number : ");

        result = scan.nextInt();
        if (result>=90){

            System.out.println("Your Grade: A");
        }

        else if(result>=80){
            System.out.println("Grade: B");
        }

        else if(result>=70){
            System.out.println("Grade: C");
        }


        else if(result>=60){
            System.out.println("Grade: D");
        }

        else{
            System.out.println("Grade: F");
        }

    }

}
