package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int zahl = input.nextInt();
        if(zahl % 2 == 0) {
            System.out.print(zahl + " ist gerade");
        } else {
            System.out.println(zahl + " ist ungerade");
        }
    }
}