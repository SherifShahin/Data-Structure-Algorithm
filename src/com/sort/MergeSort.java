package com.sort;
public class MergeSort 
{
    int array[];
	int temparray[];
	
	public static void main(String[] args) 
	{
		int []ar={12,4,15,3};
		
		System.out.print("before Sorting \n");
		for(int i=0;i<ar.length;i++)
			System.out.print("\t"+ar[i]);
		
		new MergeSort().prepareforSort(ar);
		
		System.out.println("\n after Sorting \n");
		for(int i=0;i<ar.length;i++)
			System.out.print("\t"+ar[i]);
	}
	
	void prepareforSort(int []arr)
	{
		this.array=arr;
		this.temparray=new int[arr.length];
		domergesort(0,arr.length-1);
	}

	void domergesort(int Lowerindex,int Higherindex)
	{
		if(Lowerindex<Higherindex)
		{
		int middle=Lowerindex+(Higherindex-Lowerindex)/2;
		domergesort(Lowerindex,middle);
		domergesort(middle+1,Higherindex);
		mergepart(Lowerindex,middle,Higherindex);
		}
	}
	
	void mergepart(int Lowerindex,int middle,int Higherindex)
	{
		for(int i=Lowerindex;i<=Higherindex;i++)
			temparray[i]=array[i];

		int i=Lowerindex;
		int j=middle+1;
		int k=Lowerindex;
		
		while(i<=middle && j<=Higherindex)
		{
			if(temparray[i]<=temparray[j])
			{
				array[k]=temparray[i];
				i++;
			}
			else
			{
				array[k]=temparray[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			array[k]=temparray[i];
			k++;
			i++;
		}
	}
}
