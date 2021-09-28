package ex36;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static int[] printArray(String[] array){

        int[] numbers = new int[array.length];

        for(int i = 0; i< array.length; i++){
            numbers[i] = Integer.parseInt(array[i]);
            System.out.println(numbers[i]);
        }
        return numbers;
    }

    static float average(int[] numbers){
        float total = 0;
        for(int i = 0; i< numbers.length; i++){
            total = total + numbers[i];
        }

        float average = total/ numbers.length;
        return average;
    }
    static int minimum(int[] numbers){
        int temp = 0;
        int min = 10000;
        for(int i = 1; i< numbers.length; i++){
            temp = numbers[0];
            if(temp > numbers[i])
                temp = numbers[i];
            if(temp<min)
                min = temp;
        }
        return min;
    }
    static int maximum(int[] numbers){

        int temp = 0;
        int max = 0;
        for(int i = 1; i< numbers.length; i++){
                temp = numbers[0];
                if(temp < numbers[i])
                    temp = numbers[i];
                if(temp>max)
                    max = temp;
            }
        return max;
    }
    static double standardDev(int[] numbers){
        double sum = 0.0, standardDeviation = 0.0;
        int length = numbers.length;

        for(int i = 0; i< length; i++) {
            sum += numbers[i];
        }

        double mean = sum/length;

        for(int i = 0; i< length; i++) {
            standardDeviation += Math.pow(numbers[i] - mean, 2);
        }
        return (Math.sqrt(standardDeviation/length));
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter in a number: ");
        String number = input.nextLine();
        ArrayList<String> list = new ArrayList<>();

        while(!number.equals("Done")){
            list.add(number);
            System.out.print("Enter in a number: ");
            number = input.nextLine();
        }

        String array[] = new String[list.size()];
        for(int j =0;j<list.size();j++) {
            array[j] = list.get(j);
        }

        int[] numbers = printArray(array);

        float avg = average(numbers);
        int min = minimum(numbers);
        int max = maximum(numbers);
        double stdDev = standardDev(numbers);

        System.out.print("Average: "+ avg + "\nMinimum: "+ min+ "\nMaximum: "+ max);
        System.out.printf("\nStandard Deviation: %.2f", stdDev);
    }
}



