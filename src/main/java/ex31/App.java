package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */
import java.util.Scanner;
import java.lang.*;

public class App {

    static int heartRateCalc(int pulse, int age, int intensity){
        int targetHeartRate = ((((220-age)-pulse) * intensity/100 ) + pulse);
        //System.out.println(targetHeartRate);
        return targetHeartRate;
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = input.nextInt();
        System.out.print("What is your resting heart rate? ");
        int pulse = input.nextInt();

        int[] array = new int[9];
        int j = 55;

        for(int i= 0; i< 9; i++){
            array[i] = heartRateCalc(pulse, age, j);
            j += 5;
        }
        System.out.println("Resting pulse: "+ pulse+ "             "+ "Age: "+ age);

        System.out.println("Intensity        |   Rate");
        System.out.println("----------------|-----------");
        j = 55;
        for(int i = 0; i< 9; i++){
            System.out.println(j+"%             |   "+ array[i] + "bpm");
            j+=5;
        }
    }
}
