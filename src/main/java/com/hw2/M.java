package com.hw2;

public class M {
    public static void main(String[] args) {

        System.out.println("**Non Static Method");

        //Non Static Method
        A sum=new A();
        sum.sum();


        A sub=new A();
        sub.sub();

        A div=new A();
        div.div();


        A mul=new A();
        mul.mul();

        //Static Method
        System.out.println("**Static Method");

        B.sum();
        B.sub();
        B.div();
        B.mul();

        //Paramiterizes Method
        System.out.println("**Paramiterizes Method");
        C.sum(100,200);
        C.sub(100,200);
        C.div(100,200);
        C.mul(100,200);
    }
}
