package com.manisha;
 import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
        //Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);
//        byte a = 30;
//        byte b = 56;
//        byte c = 12;
//        int d = a * b / c;
//        System.out.println(d);

//        int number = ('A');
//        System.out.println("బాగున్నారా?");
        byte b = 29;
        char c ='a';
        short a = 1234;
        int i = 23344;
        float f = 7.95f;
        double d = 1.23456;
        double result = (f * b) + (i /c ) - (d * a);
        System.out.println((f * b) + " " + (i / c) + " " + (d * a));
        System.out.println(result);


    }


}
