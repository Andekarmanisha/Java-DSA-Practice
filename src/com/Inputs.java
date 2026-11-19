package com;
import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Inputs {
    ;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter a valid Number");
//        int rollno = input.nextInt();
//        System.out.println("Your roll no is " + rollno);
//        float marks = input.nextInt();
//        System.out.println(marks);;
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}

