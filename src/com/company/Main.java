package com.company;

/*Rylee Charlton, 2/4/2019, exercise 3 */

import java.util.Scanner;



public class Main {


    public static void main(String[] args) {
        double usersInput = 0;

        while (usersInput >= -460){
            usersInput = input();
            double sendToOutput = cToF(usersInput);
            output(sendToOutput);
        }



    }


    static double input() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a temperature in fahrenheit.");
        double tempInFahr = myObj.nextDouble();
        return tempInFahr;

    }

    static double cToF(double c) {
        c = c - 32 * 5 / 9;
        return c;
    }

    static void output(double Out) {
        System.out.println(cToF(Out));
    }


}
