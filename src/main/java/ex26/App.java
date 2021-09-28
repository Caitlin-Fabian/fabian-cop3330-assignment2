package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Caitlin Fabian
 */
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.lang.*;

class PaymentCalculator {
    int calculateMonthsUntilPaidOff(float balance,float apr, float monthlyPayment) {
            //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        double i = apr/(100*365);
        double temp = balance/monthlyPayment;
        double temp1 = Math.pow((1+i),30);
        double temp2 = Math.log(1+i);
        double temp3 = Math.log(1+temp*(1-temp1));
        int n = (int) Math.ceil((-1*temp3) / (temp2*30));

        return n;
    }
}
public class App {

        public static void main(String[] args) {
            PaymentCalculator outer = new PaymentCalculator();

            Scanner input = new Scanner(System.in);
            System.out.print("What is your balance: ");
            float balance = input.nextInt();
            System.out.print("What is the APR on the card (as a percent): ");
            float apr = input.nextInt();
            System.out.print("What is the monthly payment you can make: ");
            float monthlyPayment = input.nextInt();
            int months= outer.calculateMonthsUntilPaidOff(balance, apr, monthlyPayment);
            System.out.println("It will take you "+ months+"months to pay off this card.");

        }
    }


