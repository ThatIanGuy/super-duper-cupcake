package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int test;
        System.out.println("Input an integer!");
        test = keyboard.nextInt();

        if(test == 1){
            System.out.println("Hello, world!");
        }
        else{
            System.out.println("That's not the right number!");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("This is confusing, and yet awesome!");
   }
}
