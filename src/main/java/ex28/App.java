package ex28;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */
import java.util.Scanner;
import java.lang.*;

public class App {

    static int adding(int num1, int num2, int num3, int num4, int num5){
        int total = 0;
        total = num1 + num2 + num3 + num4 + num5;
        return total;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int total = adding(num1,num2,num3,num4,num5);
        System.out.println("The total is "+total);
    }
}
