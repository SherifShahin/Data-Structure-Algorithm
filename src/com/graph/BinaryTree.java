package com.graph;

public class BinaryTree 
{
	NodeTree root;
	public BinaryTree(NodeTree root) 
	{
		this.root=root;
	}
	public void addnode(NodeTree newnode,NodeTree rootexplore)
	{
		if(rootexplore==null)
		{
			return;
		}
		
		if(newnode.value>rootexplore.value)
		{
			if(rootexplore.right==null)
			{
				rootexplore.right=newnode;
			}
			
			else
			{
				addnode(newnode,rootexplore.right);
			}
		}	
			if(newnode.value<rootexplore.value)
			{
				if(rootexplore.left==null)
				{
					rootexplore.left=newnode;
				}
				
				else
				{
					addnode(newnode,rootexplore.left);
				}
				
				
			}
	}
	
	public void search(int value,NodeTree rootexplore)
	{
		if(rootexplore==null)
		{
			System.out.println("not founded !");
			return;
		}
		
		if(value==rootexplore.value)
		{
			System.out.println("founded !");
			return;
		}
		
		if(value>rootexplore.value)
		{
			search(value,rootexplore.right);
		}
		

		if(value<rootexplore.value)
		{
			search(value,rootexplore.left);
		}
	}

}
