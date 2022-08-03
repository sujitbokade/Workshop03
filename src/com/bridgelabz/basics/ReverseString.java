package com.bridgelabz.basics;

import java.util.Scanner;

public class ReverseString {
      String reverse(String name){
         String revString=" ";
       for(int i=name.length()-1;i>=0;i--){
           revString=revString+name.charAt(i);
       }
       return revString;
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String name = sc.nextLine();

        ReverseString r=new ReverseString();
        r.reverse(name);
        System.out.println(r.reverse(name));


      }
}