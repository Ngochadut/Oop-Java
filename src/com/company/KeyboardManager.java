package com.company;

import java.util.Scanner;

public class KeyboardManager {
    public int inputInt(){
        Scanner scanner = new java.util.Scanner(System.in);
        int x;
        x = scanner.nextInt();
        return x;
    }

    public String inputString(){
        Scanner scanner = new java.util.Scanner(System.in);
        String x;
        x = scanner.nextLine();
        return x;
    }

    public double inputDouble(){
        Scanner scanner = new java.util.Scanner(System.in);
        double x;
        x = scanner.nextDouble();
        return x;
    }
}
