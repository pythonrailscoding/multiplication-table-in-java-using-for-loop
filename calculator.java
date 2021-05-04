package com.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!\nType 1 for Addition,\nType 2 for Divisions,\nType 3 for Subtraction\n" +
                "Type 4 for Multiplication\n" +
                "Type 5 for Multiplication Table\n" +
                "Type 6 for Square and Cube Roots\n" +
                "Type any other number to Exit");
        int res = scan.nextInt();
        switch (res){
            case 1:
                System.out.println("Enter the First Number!");
                int num1 = scan.nextInt();
                System.out.println("Enter another Number!");
                int num2 = scan.nextInt();
                System.out.println("The sum of " + num1 + " and " + num2  + " is " + (num1 + num2));
                break;
            case 2:
                System.out.println("Enter the Dividend!");
                double num_div1 = scan.nextDouble();
                System.out.println("Enter another Divisor!");
                double num_div2 = scan.nextDouble();
                System.out.println("The Quotient of " + num_div1 + " and " + num_div2  + " is " + (num_div1 / num_div2));
                System.out.println("Remainder is " + (int)(num_div1 % num_div2));
                break;
            case 3:
                System.out.println("Enter the First Number!");
                int num_sub1 = scan.nextInt();
                System.out.println("Enter another Number!");
                int num_sub2 = scan.nextInt();
                System.out.println("The difference of " + num_sub1 + " and " + num_sub2  + " is " + (num_sub1 - num_sub2));
                break;
            case 4:
                System.out.println("Enter the First Number!");
                int num_mul1 = scan.nextInt();
                System.out.println("Enter another Number!");
                int num_mul2 = scan.nextInt();
                System.out.println("The Product of " + num_mul1 + " and " + num_mul2  + " is " + (num_mul1 * num_mul2));
                break;
            case 5:
                System.out.println("Enter the number of which You Want Multiplication Table of!");
                int input = scan.nextInt();
                int digit = 1, test;
                for (test=input; test<=input*10; test+=input){
                    System.out.println(input + " x " + digit + " = " + test);
                    digit = digit + 1;
                }
                break;
            case 6:
                System.out.println("Type 1 for Square Root and 2 for Cube Root; any other number to exit!");
                int store = scan.nextInt();
                switch (store){
                    case 1:
                        System.out.println("Enter the Number!");
                        int num = scan.nextInt();
                        System.out.println("Square root of " + num + " is: " + (double) Math.sqrt(num));
                        break;
                    case 2:
                        System.out.println("Enter the Number!");
                        int num_root = scan.nextInt();
                        System.out.println("Cube root of " + num_root + " is: " + (double) Math.cbrt(num_root));
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
    }
}
