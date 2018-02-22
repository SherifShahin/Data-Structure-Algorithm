
public class LinkedList 
{
	node head;

	public LinkedList(node head) 
	{
		this.head = head;
	}
	
	public void add(node newnode)
	{
		newnode.next=head;
		head=newnode;
	}
	
	public void delete()
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
