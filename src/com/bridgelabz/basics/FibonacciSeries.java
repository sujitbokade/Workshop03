package com.bridgelabz.basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
         int n=10;
        int x = 0, y = 1, z = 0, count = 1;
            while (count <= n) {
                System.out.println(z + "   ");
                z = x + y;
                y = x;
                x = z;
                count++;

            }

        }

}

