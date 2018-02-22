package com.graph;

public class NodeTree 
{
	 int value;
	 NodeTree right;
	 NodeTree left;
	
	public NodeTree( NodeTree left,int value ,NodeTree right) 
	{
		this.value = value;
		this.right = right;
		this.left = left;
	}

	

}
