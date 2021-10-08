package com.apsucodes.datastructures;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter age");
        int age = scanner.nextInt();

        System.out.println(name);
        System.out.println(age);


        int x = scanner.nextInt();
    }
}
