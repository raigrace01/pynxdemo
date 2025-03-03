package com.pynx.util;

import java.util.Scanner;

public class MaxThreeNum {
    Scanner s;
    private int getUserInput(){
        System.out.print("Input a number:");
        s = new Scanner(System.in);
        return s.nextInt();
    }

    public int getMax(int num1, int num2, int num3){
        return Math.max(Math.max(num1, num2),num3);
    }

    public static void main(String[] args){
        MaxThreeNum util = new MaxThreeNum();

        // repeat
        boolean repeat = true;
        while (repeat){
            int max = util.getMax(util.getUserInput(), (util.getUserInput()),
                    util.getUserInput());
            System.out.println("max number: "+max);
            System.out.print("Try another y/n?");
            util.s = new Scanner(System.in);
            repeat = util.s.nextLine().equalsIgnoreCase("y");
        }
        util.s.close();



    }
}
