package com.pynx.util;

/*
This program is to compute
the area and perimeter of a circle
given a radius which comes from user input
 */

import java.util.Scanner;

public class AreaPerimeterCircle {
    public static void main(String[] args){
        System.out.print("Enter radius:");
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        AreaPerimeterCircle util = new AreaPerimeterCircle();
        System.out.println("Perimeter: "
                +util.computePerimeter(radius));
        System.out.println("Area: "
                +util.computeArea(radius));
    }
    public double computePerimeter(double radius){
        return 2 * Math.PI * radius;
    }
    public double computeArea(double radius){
        return Math.PI*Math.pow(radius,2);
    }
}
