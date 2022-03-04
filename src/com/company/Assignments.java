package com.company;
import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of i");
        int i=sc.nextInt();
        System.out.println("enter the value of j");
        int j= sc.nextInt();
        System.out.println("enter the value of k");
        int k= sc.nextInt();

        if (i==j && j==k)
        {
            System.out.println("numbers are equal");
        }
        else
        {
            System.out.println("Numbers are not equal");
        }
    }
}


