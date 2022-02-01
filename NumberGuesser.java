package com.techlab.numberguesser;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag;
		
		Random rm=new Random();
		int computerNumber=rm.nextInt(11);
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To Number Guesser Game : ");
		
		System.out.println("Enter 1 to Play and 0 to exit : ");
		int choice=sc.nextInt();
		
		while(choice==1)
		{
			System.out.println();
			System.out.println("Enter Your Number Netween 1 To 10 : ");
			int userNumber=sc.nextInt();
			if(userNumber==computerNumber)
			{
				System.out.println("You Won !!");
			}
			else
			{
				System.out.println("You Loose");
				System.out.println("Press 1 to try again or 0 to exit");
				int c=sc.nextInt();
				c=choice;
				
			}
			
			

		}
		
		
	}

}
