package com.bridgelabz.basics;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int x = n.nextInt();
        if (x % 2 == 0) {
            System.out.println("It is a Even Number ");
        } else {
            System.out.println("It is a Odd Number ");
        }
    }
}
