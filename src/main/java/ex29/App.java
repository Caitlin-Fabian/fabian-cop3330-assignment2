package ex29;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */
import java.util.Scanner;
import java.lang.*;

public class App {

    static int calculateYears(String rate){
        int years = 0;
        boolean flag = false;
        while(!flag){
            if (rate.matches(".*[a-zA-Z].*")|| rate.equals("0")) {
                System.out.print("Sorry. That's not a valid input. Try again: ");
            } else {
                int newRate = Integer.parseInt(rate);
                years = 72 / newRate;
                break;
            }
            Scanner input = new Scanner(System.in);
            rate = input.nextLine();
        }
        return years;
    }

    public static void main(String[]args){
        System.out.print("Enter in the rate of return:");
        Scanner input = new Scanner(System.in);
        String rate = input.next();
        int years = calculateYears(rate);
        System.out.println("It will take "+years+" years to double your initial investment.");

    }
}

