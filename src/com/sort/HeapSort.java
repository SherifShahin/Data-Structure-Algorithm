package com.sort;

import java.util.Scanner;

public class HeapSort 
{
	private static int total;
	
	public static void heapify(int []arr,int parentindex)
	{
		
		int leftnodeindex=parentindex*2;
		int rightnodeindex=parentindex*2+1;
		int newindex=parentindex;
		
		if(leftnodeindex<=total && arr[leftnodeindex]>arr[parentindex])
			newindex=leftnodeindex;
		
		if(rightnodeindex<=total &&arr[rightnodeindex]>arr[newindex])
			newindex=rightnodeindex;
		
		if(newindex!=parentindex)
		{
			swap(arr,parentindex,newindex);
			heapify(arr,newindex);
		}
		
	}
	
	public static void swap(int []arr,int parentindex,int newindex)
	{
		int temp=arr[parentindex];
		arr[parentindex]=arr[newindex];
		arr[newindex]=temp;
	}
	
	public static void presort(int arr[])
	{
		total=arr.length-1;
		for(int i=total/2;i>=0;i--)
			heapify(arr,i);

		
		for(int i = total; i > 0;i--)	
		{
			swap(arr,0,i);
			total=total-1;
			heapify(arr,0);
		}
			
	}
	
	
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("enter number of integer elements: ");
		int n=input.nextInt();
		int harray[]=new int [n];
		System.out.println("enter your "+n+" integers:");
		for(int i=0;i<n;i++)
		{
			harray[i]=input.nextInt();
		}
		
		/**System.out.println("before sort");
		for(int i=0;i<n;i++)
		System.out.print("\t"+harray[i]);**/
					
		presort(harray);
		
		System.out.println("\n after sort");
		for(int i=0;i<n;i++)
		System.out.print("\t"+harray[i]);
	}

	
}
