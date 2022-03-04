package com.company;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number between 1to30");
        int GeneratedNum= (int)(Math.random()*50);
        System.out.println(GeneratedNum);

        System.out.println("guess my number:");
        do {
            int userInput=sc.nextInt();
            if(userInput==GeneratedNum)
            {
                System.out.println("you won ");
                break;
            }
            System.out.println("sorry the guess was wrong");
        }while(true);
    }
}
