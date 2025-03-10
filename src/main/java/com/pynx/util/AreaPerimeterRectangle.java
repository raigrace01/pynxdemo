package com.pynx.util;

/*
This program is to compute
the area and perimeter of a rectangle
given a radius which comes from user input
 */

import java.util.Scanner;

public class AreaPerimeterRectangle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //get the length
        System.out.print("Enter length:");

        double length = s.nextDouble();

        // get the width
        System.out.print("Enter width:");
        double width = s.nextDouble();

        AreaPerimeterRectangle util = new AreaPerimeterRectangle();
        System.out.println("Perimeter: "
                +util.computePerimeter(radius));
        System.out.println("Area: "
                +util.computeArea(radius));
        s.close();
    }
    public double computePerimeter(double radius){
        return 2 * Math.PI * radius;
    }
    public double computeArea(double radius){
        return Math.PI*Math.pow(radius,2);
    }
}
