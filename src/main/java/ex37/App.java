package ex37;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class App {

    static String passwordRandomizer(int length, int special, int numbers){

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialChar = "!@#$%&*";
        String number = "0123456789";
        Random random = new Random();
        ArrayList<Character> password = new ArrayList<Character>();

        for(int i = 0; i< numbers; i++){
            password.add(number.charAt(random.nextInt(number.length())));
        }
        for(int i = 0; i< special; i++){
            password.add(specialChar.charAt(random.nextInt(specialChar.length())));
        }
        for(int i = password.size()-1;i<length; i++){
            password.add(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        Collections.shuffle(password);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < password.size(); i++){
            sb.append(password.get(i));
        }

        String word = sb.toString();

        return word;
    }
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("What is the minimum length? ");
        int length = Integer.parseInt(input.nextLine());
        System.out.println("How many special characters?");
        int special = Integer.parseInt(input.nextLine());
        System.out.println("How many numbers?");
        int numbers = Integer.parseInt(input.nextLine());

        System.out.println("Your password is "+ passwordRandomizer(length, special, numbers));

    }
}