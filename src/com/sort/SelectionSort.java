package com.sort;

public class SelectionSort 
{

	public static void main(String [] args)
	{
		int [] A={8,15,1,4,64,83,97,196,28,16,62,86,82,21,22,5,6,7,8,61,4,37,3,2,5,9,100,12,65,24,32,105,8,63,32};
		
		int j=0;
		int key;
		int x;
		
		System.out.println("before sorting:");
		for(int c=0;c<A.length;c++)
		{
			System.out.print(A[c]+" ");
	    } 
		
		for(int n=0;n < (A.length -1); n++)
		{	
		 key=n;
		 
		 for(int i=n;i< (A.length-1); i++)
		 {
			j=i+1;
			
			if(j==A.length) break;
			
			if(A[i] <= A[j] && A[i] <= A[key] )
			{
				key=i;
			}
			
			if(A[i] >= A[j] && A[j] <= A[key] )
			{
				key=j;
			}
		 } 
		 x=A[n];
		 A[n]=A[key];
		 A[key]=x;
		}
		System.out.println("\nafter sorting:");
		for(int c=0;c<A.length;c++)
		{
			System.out.print(A[c]+" ");
	    } 
	}
}
