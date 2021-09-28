package ex35;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */
import java.util.ArrayList;
import java.util.Scanner;
public class App {

    static int randomizer(int min, int max){
        int randInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        return randInt;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter in a name: ");
        String name = input.nextLine();
        ArrayList<String> list = new ArrayList<String>();

        while(!name.isEmpty()){

            list.add(name);
            System.out.print("Enter in a name: ");
            name = input.nextLine();
        }
        int min = 0;
        int max = list.size();

        System.out.println("The winner is ... " + list.get(randomizer(min, max)));

    }
}
