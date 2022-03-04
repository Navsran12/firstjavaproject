
//CALCULATOR USING SWITCH
package com.company;
import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of i" );
        int i= sc.nextInt();
        System.out.println("Enter the value of j" );
        int j=sc.nextInt();
        System.out.println("Type any number where 1.ADD,2.subract,3.Multiply,4.Divide");
        int UserInput = sc.nextInt();
        int result;
        switch(UserInput)
        {
            case 1:
                result= i+j;
                System.out.println("Addition is " +result);
                break;

            case 2:
                result= i-j;
                System.out.println("Subtraction is " +result);
                break;

            case 3:
                result= i*j;
                System.out.println("Multiplication is " +result);
                break;

            case 4:
                result= i/j;
                System.out.println("division is " +result);
                break;
        }
        System.out.println("Please enter a valid operation");
    }



}
