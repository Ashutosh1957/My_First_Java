package com.nagarro.java.assignment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    double  fatGram,fatCalPercent;
		    int cal;
		    Scanner sc=new Scanner(System.in);
		    System.out.print ("Enter the name of a food item: ");
		    String name =sc.nextLine(); 
		    System.out.print ("Enter the grams of fat: ");  
		    fatGram =sc.nextFloat();
		    System.out.print ("Enter the number of calories: ");
		    cal =sc.nextInt(); 
		    System.out.println ();
		    fatCalPercent = ((9 * fatGram)/ (float)(cal)) * 100; 
		    System.out.println ("Percentage of fat calories in " + name + " : " +fatCalPercent);  
		 
		    if (fatCalPercent <= 30)
		       System.out.println ("This item is Heart Healthy!"); 
		    else
		       System.out.println ("This item is NOT Heart Healthy!");
		   } 
	}		
