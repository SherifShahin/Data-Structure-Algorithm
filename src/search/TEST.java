package com.search;

import java.util.Scanner;

public class TEST 
{
	
	public static void main(String[]args)
	{
		String []barray={"steve","elon musk","tesla","Space X","pixar","Next","google","Amazon","apple"};
		
		Scanner input=new Scanner(System.in);
		System.out.println("search: ");
		String search=input.nextLine();
		
		new TEST().linear(barray, search);
	}
	
	public void linear(String []arr,String search)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equalsIgnoreCase(search))
			{
				System.out.println("is found in index: ["+i+"]");
				break;
			}		
			
			if(i==(arr.length-1) && !arr[i].equalsIgnoreCase(search))
			{
				System.out.println("not found!");
				break;
			}
	}

	}
}
