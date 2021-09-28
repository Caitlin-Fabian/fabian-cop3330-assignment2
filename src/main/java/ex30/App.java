package ex30;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */
import java.util.Scanner;

public class App {

    public static void main(String[] args){

        int[][] list = new int[12][12];

        for(int i = 0;i< 12; i++){
            for(int j= 0; j<12; j++){
                list[i][j] = (i+1)*(j+1);
                System.out.printf("%6d",list[i][j]);
            }
            System.out.print("\n");
        }

    }
}
