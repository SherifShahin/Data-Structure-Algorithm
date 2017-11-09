package com.sort;

import java.io.IOException;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		int []ar={12,4,15,3};
		
		System.out.print("before Sorting \n");
		for(int i=0;i<ar.length;i++)
			System.out.print("\t"+ar[i]);
		
		bubbleSorting(ar);
		
		System.out.println("\n after Sorting \n");
		for(int i=0;i<ar.length;i++)
			System.out.print("\t"+ar[i]);
	}
	
	public static void bubbleSorting(int []arr)
	{
		int temp=0;
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}		
			}
		}	
	}
	
}
