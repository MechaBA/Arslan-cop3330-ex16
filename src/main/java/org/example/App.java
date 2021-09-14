/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Berkay Arslan
 */

package org.example;
import java.util.Scanner;
public class App
{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = n.nextInt();
        if(age<0)
            System.out.println("Enter valid age: ");
        else
        {
            String country[]={"Bahamas", "Egypt"};
            int valid_age[]= {16,18};
            for(int i=0;i<5;i++)
                System.out.println( age>=valid_age[i] ? "You are old enough to legally drive in " + country[i] : "You are not old enough to legally drive." +country[i]);
        }
    }
}
