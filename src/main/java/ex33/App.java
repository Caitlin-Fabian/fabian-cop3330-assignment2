package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */
import java.util.Scanner;
import java.lang.*;

public class App {

    static int randomNumber() {
        int min = 0;
        int max = 2;
        int randInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return randInt;
    }
    static String answer(int randInt){
        String[] array;
        array = new String[3];

        array[0] = "Yes";
        array[1] = "No";
        array[2] = "Ask again later";
        return array[randInt];
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("What is your question?");
        String question = input.nextLine();
        int randInt = randomNumber();
        String answered = answer(randInt);

        System.out.println(answered);

    }
}
