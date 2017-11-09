package com.sort;

import java.util.Scanner;

public class QuickSort 
{
   static void quicksort(int []arr,int low,int high)
	{
		if(low>=high)return;
		int middle=high+low/2;
		int pivot=arr[middle];
		int i=low;
		int j=high;
		
		while(i<=j)
		{
			while(arr[i]<pivot)
			{
				i++;
			}
			
			while(arr[j]>pivot)
			{
				j--;
			}
			
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			if(low<j)
			quicksort(arr,low, j);

			
			if(high>i)
			quicksort(arr,i, high);
		}
		
		
	}
	
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("enter number of integers: ");
		int n=input.nextInt();
		int qarr[]=new int[n];
		
		System.out.println("enter "+n+" integers:");
		for(int i=0;i<n;i++)
		{
			qarr[i]=input.nextInt();
		}
		
		quicksort(qarr,0, qarr.length-1);
		
		System.out.println("after sort");
		for(int i=0;i<n;i++)
		{
			System.out.print("\t"+qarr[i]);
		}
		input.close();
	}
}
