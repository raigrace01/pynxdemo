package com.pynx.util;
/*
Take two user input of type int
and print the division of the input
 */
import java.util.Scanner;

public class DivisionTwoNumbers {
    Scanner s = new Scanner(System.in);
    private int getUserInput(String textString){
        System.out.print("Enter the "+textString+":");
        return s.nextInt();
    }
    public int getQuotient(int dividend, int divisor){
        return dividend/divisor;
    }
    public static void main(String[] args){
        boolean repeat = true;
        DivisionTwoNumbers util = new DivisionTwoNumbers();
        while(repeat){
            int result = util.getQuotient(
                    util.getUserInput("dividend"),
                    util.getUserInput("divisor")
            );
            System.out.println("quotient:"+result);
            System.out.print("try another y/n? ");
            util.s = new Scanner(System.in);
            repeat = util.s.nextLine()
                    .equalsIgnoreCase("y");
        }
        util.s.close();




    }

}
