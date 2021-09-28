package ex27;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class App {

    static boolean validateZip(int zip){
        String zipCode = String.valueOf(zip);
        if(zipCode.length() < 5|| zipCode.length()> 5){
            return false;
        }
        else return true;

    }

    static boolean validateID(String id){
        String pattern = ("[A-Z][A-Z]\\-\\d\\d\\d\\d");
        boolean match = matches(pattern, id);

        boolean failed = false;
        boolean passed = true;

        if(match){
            return passed;
        }
        else return failed;

    }

    static boolean validateName(String name){
        boolean failed = false;
        boolean passed = true;
        if(name == null || name.length() < 2){
            return failed;
        }
        else return passed;
    }
    static void validInput(String first, String last, int zip, String employee){
        boolean check1 = validateName(first);
        boolean check2 = validateName(last);
        boolean check3 = validateZip(zip);
        boolean check4 = validateID(employee);
        String require1 = " ", require2 =" ", require3= " ", require4= " " , passed = " ";
        boolean flag = true;
        if(flag){
            if (!check1)
                require1 = "The first name must be at least 2 characters long.";

            if (!check2)
                require2 = "The last name must be at least 2 characters long.";

            if (!check3)
                require3 = "The zipcode must be a 5 digit number.";

            if (!check4)
                require4 = "The employee ID must be in the format of AA-1234.";
            else
                passed = "There were no errors found.";
        }
        System.out.println(passed + require1+"\n" + require2 +"\n"+require3+"\n"+ require4 +"\n");
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String first = input.next();
        System.out.print("Enter the last name: ");
        String last = input.next();
        System.out.print("Enter the ZIP code");
        int zip = input.nextInt();
        System.out.print("Enter the employee ID: ");
        String employeeID = input.next();

        validInput(first, last, zip,employeeID);




    }
}
