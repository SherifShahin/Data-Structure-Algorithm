package com.graph;

public class DFSGraphMain 
{

	public static void main(String[] args)
	{
		DFSGraph p=new DFSGraph(6);
		p.addnode(0,2);
		p.addnode(0,1);
		p.addnode(1,4);
		p.addnode(1,3);
		p.addnode(1,0);
		p.addnode(2,5);
		p.addnode(2,0);
		p.addnode(3,1);
		p.addnode(4,1);
		p.addnode(5,2);
		
		p.DFSsearch(0,6);
		
		

	}

}
