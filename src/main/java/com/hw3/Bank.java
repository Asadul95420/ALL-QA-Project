package com.hw3;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

    int pass=4545;
    int password,totalbalance,deposit,withdraw,currentbalence;


        System.out.println("Enter Your Password : ");
        Scanner scan = new Scanner(System.in);
        password = scan.nextInt();
       // System.out.println(+password);

if (password==pass){
    System.out.println("Your Enterd Correct Password : ");

    System.out.println("Enter your total Balance : ");
    totalbalance= scan.nextInt();
    System.out.println("Total Balance: "+totalbalance);

    System.out.println("Enter Your Deposit : ");
    deposit= scan.nextInt();
    totalbalance=totalbalance+deposit;
    System.out.println("After Deposit Your Total Balence: "+totalbalance);

    System.out.println("Enter Your Withdrow Ammount : ");
    withdraw= scan.nextInt();
    totalbalance=totalbalance-withdraw;
    System.out.println("After Withdraw Your Total Balence: "+totalbalance);
}

else{
    System.out.println("Wrong Password : ");
}


    }
}
