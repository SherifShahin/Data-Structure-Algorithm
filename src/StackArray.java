
public class StackArray<T> 
{
	int size;
	Object []arraystack;
    int top;
	public StackArray(int size) 
	{
		this.size=size;
		arraystack=new Object[this.size];
		top=-1;
	}
	
	public void push(Object newitem)
	{
		if(isfull())
		{
			System.out.println("stack is full");
		}
		
		 top=top+1;
		 arraystack[top]=newitem;
		
	}
	
	public T pop()
	{
		if(isempty())
		{
			System.out.println("stack is empty");
			return null;
		}
		
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

}
