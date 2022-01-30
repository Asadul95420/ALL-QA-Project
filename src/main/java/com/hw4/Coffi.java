package com.hw4;

import java.util.Scanner;

public class Coffi {

    public static void main(String[] args) {
        System.out.println("Press 1 for Small. ");
        System.out.println("Press 2 for Medium.");
        System.out.println("Press 3 for Large.");

        Scanner scan = new Scanner(System.in);
        System.out.println("So, What Kind Of Coffee Do You Want : ");
        int size =scan.nextInt();

if(size==1){
    System.out.println("Great. You Choose small Coffee 3$ each.");
    System.out.println("How Many Coffee Do You Want: ");

    int count= scan.nextInt();
    int price=3;
    int totalbill=count*price;
    System.out.println("Your Total Bill: "+totalbill);

}


     else if(size==2){
    System.out.println("Great. You Choose Medium Coffee 5$ each.");
            System.out.println("How Many Coffee Do You Want: ");
            int count= scan.nextInt();
            int price=5;
            int totalbill=count*price;
            System.out.println("Your Total Bill: "+totalbill);

        }


        else if(size==3){
    System.out.println("Great. You Choose Large Coffee 7$ each.");
            System.out.println("How Many Coffee Do You Want: ");
            int count= scan.nextInt();
            int price=7;
            int totalbill=count*price;
            System.out.println("Your Total Bill: "+totalbill);

        }


else{
    System.out.println("Invalid SIze : ");
}





    }
}
