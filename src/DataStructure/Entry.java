
public class Entry <T>
{
	int key;
	T value;
	T next;
	
	public Entry(int key, T value) 
	{
		this.key = key;
		this.value = value;
		this.next =null;
	}
	
	public Entry()
	{
		this.next=null;
	}
	
	public int getkey()
	{
		return key;
	}
	
	public T getvalue()
	{
		return value;
	}

	
}
