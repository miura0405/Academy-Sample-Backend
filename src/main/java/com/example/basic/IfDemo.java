package com.example.basic;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("年齢を入力してください: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("あなたは成人です。");
        } else {
            System.out.println("あなたは未成年です。");
        }

        scanner.close();
    }
}