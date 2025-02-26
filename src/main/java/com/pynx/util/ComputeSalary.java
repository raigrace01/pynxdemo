package com.pynx.util;

import java.util.Scanner;

public class ComputeSalary {
    /*
    declare variables
     */
    double dailyRate;
    int numDays;
    Scanner s;

    /*
    This method is for reading user input
     */
    private void getUserInput(){
        System.out.print("What is your daily rate:");
        s = new Scanner(System.in);
        dailyRate = s.nextDouble();
        System.out.print("How many days are you in ? ");
        s = new Scanner(System.in);
        numDays = s.nextInt(); // ? whole day?
    }

    /*
     this method do the actual computation
     */

    public double getTotalSalary(double dailyRate, int numDays){
        return dailyRate*numDays;
    }
    // print
    public static void main(String[] args){
        ComputeSalary compute = new ComputeSalary();
        compute.getUserInput(); // call for user input
        double salaryTotal = compute.getTotalSalary(compute.dailyRate,
                compute.numDays);
        System.out.print(salaryTotal);


    }


}




