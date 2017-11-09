
public class NodeDouble<T> 
{

	Object value;
	NodeDouble next;
	NodeDouble previous;
	
	public NodeDouble(NodeDouble previous,Object value,NodeDouble next)
	{
		this.value=value;
		this.next=next;
		this.previous=previous;
	}
}



