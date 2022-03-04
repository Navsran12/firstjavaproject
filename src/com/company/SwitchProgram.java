package com.company;

public class SwitchProgram {
    public static void main(String[] args) {
        int month=9;
        switch(month)
        {
            case 1:
                System.out.println("31");
                break;

            case 2:
                System.out.println("35");
                break;

            case 3:
                System.out.println("32");
                break;

            case 4:
                System.out.println("28");
                break;

            case 5:
                System.out.println("22");
                break;
            default:
                System.out.println("wrong input");
        }
        System.out.println("done");
    }
}
