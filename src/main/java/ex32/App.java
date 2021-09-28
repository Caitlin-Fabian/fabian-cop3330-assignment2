package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */
import java.util.Scanner;
import java.lang.*;

public class App {

    static void hardMode(){
        Scanner input = new Scanner(System.in);
        int min = 1, max = 1000 ;
        int randInt = (int)Math.floor(Math.random()*(max-min+1)+min);

        int[] array;
        array = new int[1000];

        int guess;
        System.out.print("I have got my answer. What is your guess? ");
        int count = 1;
        guess = input.nextInt();
        int end = array.length;
        int start = 0;

        while(guess > 0 && guess < 1000){

            if(guess == randInt){
                break;
            }
            if(guess < randInt){
                System.out.print("This is too low. What is your next guess? ");
                start = guess;
            }
            else if(guess > randInt){
                System.out.print("This is too high. What is your next guess? ");
                end = guess;
            }
            count++;
            guess = input.nextInt();
        }

        System.out.printf("You guessed the right answer in %d guesses!", count);
    }

    static void mediumMode(){
        Scanner input = new Scanner(System.in);
        int min = 1, max = 100 ;
        int randInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        int array[];
        array = new int[100];

        int guess;
        System.out.print("I have got my answer. What is your guess? ");
        int count = 1;
        guess = input.nextInt();
        int end = array.length;
        int start = 0;

        while(guess > 0 && guess < 100){

            if(guess == randInt){
                break;
            }
            if(guess < randInt){
                System.out.print("This is too low. What is your next guess? ");
                start = guess;
            }
            else if(guess > randInt){
                System.out.print("This is too high. What is your next guess? ");
                end = guess;
            }
            count++;
            guess = input.nextInt();
        }

        System.out.printf("You guessed the right answer in %d guesses!", count);
    }

    static void easyMode()
    {
        Scanner input = new Scanner(System.in);
        int min = 1, max = 10 ;
        int randInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        int array[];
        array = new int[10];

        int guess;
        System.out.print("I have got my answer. What is your guess? ");
        int count = 1;
        guess = input.nextInt();
        int end = array.length;
        int start = 0;

        while(guess > 0 && guess < 10){

            if(guess == randInt){
                break;
            }
            if(guess < randInt){
                System.out.print("This is too low. What is your next guess? ");
                start = guess;
            }
            else if(guess > randInt){
                System.out.print("This is too high. What is your next guess? ");
                end = guess;
            }
            count++;
            guess = input.nextInt();
        }

        System.out.printf("You guessed the right answer in %d guesses!", count);
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Lets play Guess the Number!");

        char answer = 'Y';
        int i;
        System.out.print("Enter the difficulty level: ");
        while(answer== 'Y' || answer =='y'){
            int difficulty = input.nextInt();
            switch(difficulty) {
                case 1: easyMode();
                break;
                case 2: mediumMode();
                break;
                case 3: hardMode();


            }
        }
    }
}
