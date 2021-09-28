package ex24;


import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */
public class App {

    static boolean isAnagram(String first, String second){

        if(first.length() == second.length()){
            {
                char[] firstChar = first.toCharArray();
                char[] secondChar = second.toCharArray();
                Arrays.sort(firstChar);
                Arrays.sort(secondChar);

                return Arrays.equals(firstChar,secondChar);
            }
        }
        else
        return false;

    }
    public static void main( String[] args )
    {
        System.out.println( "Enter in two strings and I will see if they are anagrams:" );
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in the first string: ");
        String first = input.next();
        System.out.print("Enter in the second string: ");
        String second = input.next();
        boolean yes = isAnagram(first, second);

        if(yes == true){
            System.out.println(first + "and" + second + " are anagrams");
        }
        else
            System.out.println(first + " and " + second + " are not anagrams");

    }

}
