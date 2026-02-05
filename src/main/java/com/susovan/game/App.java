package com.susovan.game;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int secret = (int)(Math.random()*10)+1;
        Scanner sc = new Scanner(System.in);

        System.out.println("🎯 Guess The Number Game");
        System.out.println("Enter number (1-10):");

        int guess = sc.nextInt();

        if(guess == secret)
            System.out.println("✅ Correct!");
        else
            System.out.println("❌ Wrong — number was " + secret);

        sc.close();
    }
}
