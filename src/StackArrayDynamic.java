import java.util.Arrays;

public class StackArrayDynamic<T> 
{

	int size;
	Object []arraystack;
    int top;
    
	public StackArrayDynamic(int size) 
	{
		this.size=size;
		arraystack=new Object[this.size];
		top=-1;
	}
	
	public void push(Object newitem)
	{
		ensurecapacity(top+2);
		
		 top=top+1;
		 arraystack[top]=newitem;
		
	}
	
	public T pop()
	{
		ensurecapacitypop(top+1);
		
		T item=(T)arraystack[top];
		top=top-1;
		return item;
	}
	
	public boolean isfull()
	{
		return(top==size-1);
	}
	
	public boolean isempty()
	{
		return(top==-1);
	}
	
	public void ensurecapacity(int mincapacity)
	{
		int oldcapacity=arraystack.length;
		
		if(mincapacity>oldcapacity)
		{
			int newcapacity=oldcapacity*2;
			if(newcapacity<oldcapacity)
			newcapacity=oldcapacity;
			
			arraystack=Arrays.copyOf(arraystack,newcapacity);
		}	
		
	}
	
	public void ensurecapacitypop(int mincapacity)
	{
		int oldcapacity=arraystack.length;
		
		if(mincapacity<oldcapacity)
		{
			int newcapacity=oldcapacity-(oldcapacity-mincapacity);
			if(newcapacity>oldcapacity)
			newcapacity=oldcapacity;
			
			arraystack=Arrays.copyOf(arraystack,newcapacity);
		}	
		
	}

}



