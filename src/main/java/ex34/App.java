package ex34;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */
import java.util.Scanner;
import java.lang.*;

public class App {

    static String[] deleteName(String[] array, int n, String name) {
        String[] newArray = new String[array.length-1];

        for(int i = 0, j = 0; i < n; i++){
            if(array[i].equals(name)) continue;

            newArray[j] = array[i];
            j++;
        }

        return newArray;
    }

    static void printArray (String[] array, int n){
        for(int i = 0; i< n; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] array = new String[5];

        array[0] = "Caitlin Fabian";
        array[1] = "Ana Cohen";
        array[2] = "Emily Ross";
        array[3] = "Ellen Tyson";
        array[4] = "Amber Smith";
        System.out.println("These are the 5 employees:");
        printArray(array, array.length);

        System.out.print("Enter the name of the employee you want to remove: ");
        String name = input.nextLine();

        String[] newArray = new String[array.length-1];
        newArray = deleteName(array, array.length, name);

        System.out.println("These are the 4 employees:");
        printArray(newArray, newArray.length);
        }
    }

