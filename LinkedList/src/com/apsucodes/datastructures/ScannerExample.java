package com.apsucodes.datastructures;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x value: ");
        int x = scanner.nextInt();

        System.out.println("Enter y value");
        int y = scanner.nextInt();

        if (x > y){
            System.out.println("X is greater than Y");
        }else{

            System.out.println("Y is greater than X");
        }
    }
}
