package com.search;

import java.util.Scanner;

public class BinarySearch 
{

	public static void main(String []args) 
	{
      int size=1000000;
      int []barray=new int[size];
      for(int i=0;i<barray.length;i++)
    	 barray[i]=i+1; 
      
      Scanner input=new Scanner(System.in);
      System.out.println("enter searchnumber: ");
      int searchnumber=input.nextInt();
      int high=barray.length-1;
      int low=0;
      int mid=0;
      boolean isfound=false;
      int trys = 0;
      while(!isfound)
      {
    	  if(low>high)
    	  {
    		  System.out.println("not found");
    		  break;
    	  }
    	   ++trys;
    	  mid=(high+low)/2;
    	  
    	  if(barray[mid]==searchnumber)
    	  {
    		  System.out.println("founded !");
    		  System.out.println("trys: "+trys);
    		  break;
    	  }
    	  
    	  if(barray[mid]<searchnumber)
    	  {
    		  low=mid+1;
    	  }
    	  
    	  if(barray[mid]>searchnumber)
    	  {
    		  high=mid-1;
    	  }
   
      }
	
	}

}
