
public class stacklinkedlist 
{

	node head;

	public stacklinkedlist(node head) 
	{
		this.head = head;
	}
	
	public void push(node newnode)
	{
		newnode.next=head;
		head=newnode;
	}
	
	public void pop()
	{
		head=head.next;
	}
	
	public void display()
	{
		node n=head;
		
		while(n !=null)
		{
		System.out.println(n.value);
		n=n.next;
		}
	}
}
