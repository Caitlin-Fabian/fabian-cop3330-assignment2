package ex25;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class App {

    static int passwordValidator(String word) {
        int veryWeak, weak, strong, veryStrong;

        int letter= 0, number = 0, special = 0;

        char[] password = word.toCharArray();

        StringBuilder temp = new StringBuilder();
        //This is to check if there is just integers

            for (char c : password) {
                if (Character.isDigit(c)) {
                    number++;
                }
                else if(Character.isLetter(c)) {
                    letter++;
                }
                else {
                    if (!Character.isLetter(c) && !Character.isDigit(c)) {
                        special++;
                    }
                }
            }

            if(number > 0 && letter > 0 && special > 0){
                veryStrong = 3;
                return veryStrong;
            }
            else if(number > 0 && letter > 0 && special == 0){
                strong = 2;
                return strong;
            }
            else if(letter > 0 && number == 0 && special == 0) {
                weak = 1;
                return weak;
            }
            else if(number > 0 && letter == 0 && special == 0){
                veryWeak = 0;
                return veryWeak;
        }
        return 5;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String word;
        System.out.print("Enter in your desired password:");
        String password = input.next();
        int check = passwordValidator(password);
            switch(check){
                case 0 : word = "very weak";
                break;
                case 1 : word = "weak";
                break;
                case 2 : word = "strong";
                break;
                case 3 : word = "very strong";
                break;
                default : word = "invalid";
            }
        System.out.println("The password '" + password + "' is a " + word + " password.");
    }
}
