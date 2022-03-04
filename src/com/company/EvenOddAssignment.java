package com.company;
public class EvenOddAssignment {
    public static void main(String[] args)
            //even  numbers
    {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }


        }

//odd numbers
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
