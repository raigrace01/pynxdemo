package com.pynx.util;
/*
Take two user input of type int
and print the product of the input
 */
import java.util.Scanner;

public class ProductTwoNumbers {
    Scanner s = new Scanner(System.in);
    private int getUserInput(){
        System.out.print("Enter a number: ");
        return s.nextInt();
    }
    public int getProduct(int num1, int num2){
        return num1*num2;
    }
    public static void main(String[] args){
        boolean repeat = true;
        ProductTwoNumbers util = new ProductTwoNumbers();
        while(repeat){
            int result = util.getProduct(
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
