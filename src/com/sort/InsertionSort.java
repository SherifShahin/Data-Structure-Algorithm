package com.sort;

import java.util.Scanner;

public class InsertionSort 
{
	public static void main(String [] args)
	{
		
		int [] A={5,2,4,6,1,3,7,8,2,2,18,36,7,8,6,4,3,2,10,1,9,100,12,65,24,32,8};
		
		int i=0;
		int key=0;
		
		for(int j=1;j<A.length; j++)
		{
			key=A[j];
			i=j-1;
			
			while(i>=0 && A[i] > key)
			{
				A[i+1]=A[i];
				i--;
			}
			
			A[i+1]=key;
		}
		
		System.out.println("after sorting:");
		for(int c=0;c<A.length;c++)
		{
			System.out.print(A[c]+" ");
	    }
		Scanner input=new Scanner(System.in);
		int x=0;
		System.out.println("\n x=");
		x=input.nextInt();
		
		System.out.println("x founded in position: "+binarysearch(A.length-1,((A.length-1)+0)/2,0,x,A));	
	}
	
	public static int binarysearch(int high,int mid,int low,int x,int A[])
	{
		mid=(high+low)/2;
		boolean c=false;
		while(!c)
		{
		 if(low>high)
   	  {
   		  System.out.println("not found");
   		  break;
   	  }
		
		if(x>A[mid])
		{
			low=mid+1;
			mid=(low+high)/2;
			return binarysearch(high, mid, low, x,A);
		}
		
		if(x<A[mid])
			{
				high=mid-1;
				mid=(low+high)/2;
			return	binarysearch(high, mid, low, x,A);
			}	
		
		if(A[mid] == x)
			return mid+1;
		}		
		
		return 0;
		
	}

}
