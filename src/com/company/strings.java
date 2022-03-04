package com.company;
import java.lang.String;
public class strings {
    public static void main(String[] args) {
        String s1 = "navjot";
        String s2 = "sran";
        System.out.println(s1.equals(s2));
//To find length of string
       String name="   navjot";
       int len= name.length();
       System.out.println("the length is " +len);
       char cha = name.charAt(1);//find character at specific index
       System.out.println("the index of character is "+cha );
       String upcs= name.toUpperCase();//turn string to uppercase
       System.out.println("the uppercase is "+upcs );
       String s3= name.replace('n' , 'N');//replace the character
        System.out.println("After replacing a character"  +s3);
        String s4=name.trim();
        System.out.println("After trim " +s4);
        String s5=name.contains(av);
        System.out.println(+av);
    }



}
