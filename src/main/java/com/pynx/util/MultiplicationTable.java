package com.pynx.util;

import java.util.Scanner;

/*
Take a number as user input
and print the multiplication table
up to 10
 */
public class MultiplicationTable {
    public static void main(String[] args){
        System.out.print("Enter a number:");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        for(int i=1; i<=10;i++){
            System.out.println(
                    input + " * " + i +" = " + input*i
            );
        }
    }
}
