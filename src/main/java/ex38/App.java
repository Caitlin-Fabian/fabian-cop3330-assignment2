package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class App {
    static int[]  filterEvenNumbers(int[] numbers){

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i< numbers.length; i++){
            if(numbers[i]%2 == 0) {
                list.add(numbers[i]);
            }
        }

        int[] evenNumbers = new int[list.size()];
        for(int i = 0; i< list.size(); i++){
            evenNumbers[i] = list.get(i);
        }

        return evenNumbers;
    }

    static int[] splitToArray(String number){
        String[] stringNumbers = number.split(" ");

        int[] array = new int[stringNumbers.length];

        for(int i = 0; i< stringNumbers.length;i++){
            array[i] = Integer.parseInt(stringNumbers[i]);
        }
        return array;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: " );
        String number = input.nextLine();

        int[] array = splitToArray(number);
        int[] evenNumbers = filterEvenNumbers(array);

        System.out.print("The even numbers are ");
        for(int i=0 ; i<evenNumbers.length; i++)
        System.out.print(evenNumbers[i] + " ");
    }
}
