
public class QueueArray <T>
{
	Object []arrayqueue;
	int size;
    int front;
    int rear;
	
	public QueueArray(int size) 
	{
		this.size = size;
		arrayqueue=new Object[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isfull()
	{
		return (rear==size-1);
		
	}
	
	public boolean isempty()
	{
		return (front==-1 || front>rear);
	}
	
	public void queue(Object newitem)
	{
		
		if(isfull())
		{
			System.out.println("queue is full");
			return;
		}
		rear=rear+1;
		arrayqueue[rear]=newitem;
		if(front==-1)
			front=0;	
		
	}
	
	public T dqueue()
	{
		if(isempty()) 
		{
			System.out.println("queue is empty");
			return null;
		}
		T item=(T) arrayqueue[front];
		front=front+1;
		return item;
	}
	
	

}
