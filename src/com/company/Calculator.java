package com.company;

import java.sql.SQLOutput;

public class Calculator {

    public static void main(String[] args) {
        sum(7,7);
        System.out.println(multiply(3.0f,4.2f));
        System.out.println(divide(6,3));
        System.out.println(square(4));
        System.out.println(areaofRectangle(5,9));
    }


    public static void sum(int a, int b) {
        System.out.println(a+b);
    }

    public static float multiply(float a, float b) {
        return(a*b);
    }

    public static int divide(int a, int b) {
        return(a/b);
    }

    public static int square(int a) {
       return(a*a);
    }

    public static float areaofRectangle(int length , int breadth) {
        return(length*breadth);
    }
}
