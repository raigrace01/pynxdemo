package com.pynx.util;
/*
Display the character asterisk
to form a heart pattern
 */

public class PatternDisplayHeart {
    public static void main(String[] args) {
        for(int counter1=0;counter1<=5;counter1++){
            for(int counter2=0;counter2<=6;counter2++){
                if((counter1==0&&counter2%3!=0) ||
                        (counter1==1&&counter2%3==0) ||
                        counter1-counter2==2 ||
                        counter1+counter2==8){
                            System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
