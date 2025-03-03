package com.pynx.util;
/*
Take two user input
and print the sum of the input
 */
import java.util.Scanner;

public class SumTwoNumbers {
    Scanner s = new Scanner(System.in);
    private double getUserInput(){
        System.out.print("Enter a number: ");
        return s.nextDouble();
    }
    public double getSum(double num1, double num2){
        return num1+num2;
    }
    public static void main(String[] args){
        boolean repeat = true;
        SumTwoNumbers util = new SumTwoNumbers();
        while(repeat){
            double result = util.getSum(
                    util.getUserInput(),
                    util.getUserInput()
            );
            System.out.println("result:"+result);
            System.out.print("try another y/n? ");
            util.s = new Scanner(System.in);
            repeat = util.s.nextLine()
                    .equalsIgnoreCase("y");
        }
        util.s.close();




    }

}
