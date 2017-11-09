package com.graph;

import java.util.Scanner;

public class BinaryTreeMain {

	public static void main(String[] args) 
	{
        NodeTree root=new NodeTree(null,11, null);
        BinaryTree br=new BinaryTree(root);
        for(int i=1;i<10;i++)
        {
        	NodeTree newnode = new NodeTree(null,i,null);
        	br.addnode(newnode,br.root);
        }
        
        br.search(7,br.root);
        br.search(11,br.root);
        br.search(15,br.root);
	}

}
