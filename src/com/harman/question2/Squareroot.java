package com.harman.question2;

import java.util.Scanner;


public class Squareroot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer a;
        double sqrt;
        System.out.println("Enter a number");
        a= input.nextInt();

        Root obj = new Root();
        sqrt = obj.rootnumber(a);
        System.out.println(sqrt);

    }
}
