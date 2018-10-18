package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temp");
        int userInput = sc.nextInt();

        System.out.print("The temperature in Celsius is : ");
        System.out.printf("%.2f", celsius(userInput));
    }

    public static double celsius(int userInput) {
        double cl = ((userInput - 32f) * 5) / 9;

        return cl;
    }
}
