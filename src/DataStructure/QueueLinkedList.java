
public class QueueLinkedList<T> 
{

	NodeDouble<T> rear=null;
	NodeDouble<T> front=null;

	public QueueLinkedList(NodeDouble newnode) 
	{
		this.rear=newnode;
		this.front=newnode;
		
	}
	
	public void queue(NodeDouble newnode)
	{
        newnode.next=null;
        newnode.previous=rear;
        rear.next=newnode;
		rear=newnode;
	}
	
	public boolean isempty()
	{
		return (front==null);
	}
	
	public T dequeue()
	{
		if(isempty())
		{
			System.out.println("queue is empty");
			return null;
		}
		
		T deleteditem=(T)front.value;
		front=front.next;
	//	front.previous=null;
		
		return deleteditem;	
	}
	
	}
	





