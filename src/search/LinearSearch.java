package com.search;

import java.util.Scanner;

public class LinearSearch 
{

	public static void main(String []args) 
	{
		int size=100000;
		int []Barray=new int[size];
		for(int i=0;i<Barray.length;i++)
			Barray[i]=i+1;
		
		
		System.out.print("enter the search number: ");
		Scanner input=new Scanner(System.in);
		int searchnumber=input.nextInt();
		
		for(int j=0;j<Barray.length;j++)
		{
			if(Barray[j]==searchnumber)
			{
				System.out.println("number is found");
				System.out.println("trys: "+(j+1));
				break;
			}
		}
		
		input.close();
	}

}
