package com.graph;

import java.util.Stack;

public class DFSGraph 
{
int size;
adjlist array[]; 
	
	public DFSGraph(int size)
	{
	   this.size=size;
	   array=new adjlist[this.size];
	   for(int i=0;i<this.size;i++)
	   {
		   array[i]=new adjlist();
		   array[i].head=null;
	   }
	}
	
	public void addnode(int src,int dest)
	{
		Node n=new Node(dest, null);
		n.next=array[src].head;
		array[src].head=n;
	}
	
	public void DFSExplore(int startvertex)
	{
		boolean[]visited=new boolean[size];
		for(int i=0;i<size;i++)
		{
			visited[i]=false;
		}
		Stack<Integer> s=new Stack<Integer>();
		s.push(startvertex);
		while(!s.isEmpty())
		{
			int n=s.pop();
			s.push(n);
			visited[n]=true;
			Node head=array[n].head;
			boolean isdone=true;
			
			while(head!=null)
			{
				if(visited[head.dest]==false)
				{
					s.push(head.dest);
					visited[head.dest]=true;
					isdone=false;
					break;
				}
				else
				{
					head=head.next;
				}
			}
			if(isdone==true)
			{
				int out=s.pop();
				System.out.println("visited node: "+out);
			}
		}
	}
	
	public void DFSsearch(int startvertex,int search)
	{
		boolean[]visited=new boolean[size];
		boolean isfounded=false;
		for(int i=0;i<size;i++)
		{
			visited[i]=false;
		}
		Stack<Integer> s=new Stack<Integer>();
		s.push(startvertex);
		while(!s.isEmpty())
		{
			int n=s.pop();
			s.push(n);
			visited[n]=true;
			Node head=array[n].head;
			boolean isdone=true;
			while(head!=null)
			{
				if(search==head.dest)
				{
					System.out.println("node is founded");
					isfounded=true;
					break;
				}
				if(visited[head.dest]==false)
				{
					s.push(head.dest);
					visited[head.dest]=true;
					isdone=false;
					break;
				}
				else
				{
					head=head.next;
				}
			}
			
			if(isdone==true)
			{
				int out=s.pop();
				System.out.println("visited node: "+out);
			}
			
		}
		
		if(isfounded=false)
		{
			System.out.println("node cannot founded");
		}		
	}
}
