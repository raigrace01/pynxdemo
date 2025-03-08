package com.pynx.util;

/*
Java program that takes 2 user input
and display different arithmetic operations
 */

import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        //take the first input
        System.out.print("Enter first number: ");
        int num1 = s.nextInt();

        // take the 2nd input
        System.out.print("Enter 2nd number: ");
        int num2 = s.nextInt();

        // addition
        System.out.println(num1 + " + "
            + num2 + " = "+ (num1+num2));

        //subtraction
        System.out.println(num1 + " - "
                + num2 + " = "+ (num1-num2));

        //division
        System.out.println(num1 + " / "
                + num2 + " = "+ (num1/num2));

        //multiplication
        System.out.println(num1 + " * "
                + num2 + " = "+ (num1*num2));

        //modulo
        System.out.println(num1 + " % "
                + num2 + " = "+ (num1%num2));

    }
}
