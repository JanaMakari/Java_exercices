/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static double validScore(String s)
    {
       if(s == null || s.isEmpty())
       {
           throw new IllegalArgumentException("Error01 : Invalid String as input");
       }
       Scanner input = new Scanner(System.in);
       System.out.print(s.toUpperCase() + " : ");
        while (true)
        {
            if (input.hasNextDouble())
            {
                double score = input.nextDouble();
                if (score >= 0 && score <= 100) 
                {
                    return score;
                } 
                else 
                {
                    System.out.print("Please enter a valid score between 0 and 100: ");
                }
            }
            else
            {
                System.out.print("Please enter a valid score! : ");
                input.nextLine();
            }
        }
    }    
    public static double calculatePercentageScore(int percentage,double score)
    {
        if(percentage <= 0 || percentage > 100)
        {
            throw new IllegalArgumentException("Error02 : Invalid Percentage as input");
        }
        
        return ((score*percentage)/100.0);
    }
    
    public static void calculateFinalGrade(double[]array)
    {
        if(array == null)
        {
            throw new IllegalArgumentException("Error03 : Invalid Integer as input");
        }
        double sum = 0;
        for(int i = 0 ; i < array.length ; i++)
        {
            sum += array[i];
        }
        char letter ;
        if(sum>= 90)
        {
            letter = 'A';
        }
        else if(sum>= 80)
        {
            letter = 'B';
        }
        else if(sum>= 70)
        {
            letter = 'C';
        }
        else if(sum>= 60)
        {
            letter = 'D';
        }
        else
        {
            letter = 'F';
        }
        printTheFinalGrade(sum, letter);
    }
    
    public static void printTheFinalGrade(double sum, char lettergrade)
    {
        System.out.println();
        System.out.println("========== Result ==========");
        System.out.printf("Total Score: %.2f%n", sum);
        System.out.println("Final Grade: " + lettergrade);
        System.out.println("============================");
        System.out.println();
    }
    
    public static void main(String[] args) {
        //Print a welcome message and instructions for the user
        System.out.println("Welcome to the Student Grade Calculator!\nThis program calculates your grade based on TMA(25%), MTA(35%), and Final Exam Score(40%)");
        System.out.println("Please follow the prompts to enter the scores.");
        Scanner input = new Scanner(System.in);
        //
        
        //Prompt the user to enter scores and validate the input
        double tma = validScore("TMA");
        double mta = validScore("MTA");
        double finalexam = validScore("Final Exam");
        //
        
        //Calculate the percentage score
        double[] scores = {calculatePercentageScore(25,tma),calculatePercentageScore(35,mta),calculatePercentageScore(40,finalexam)};
        //
        
        //Calculate the final grade based on the array scores
        calculateFinalGrade(scores);
        //
        
    }
    
}
