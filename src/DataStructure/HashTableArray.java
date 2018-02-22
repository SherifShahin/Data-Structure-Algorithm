
public class HashTableArray <T>
{
    Entry[] arrayhash;      
	int Size;
	public HashTableArray(int Size) 
	{
		this.Size=Size;
		arrayhash=new Entry[this.Size];
		for(int i=0;i<arrayhash.length;i++)
		arrayhash[i]=new Entry<T>();	
	}
	
	int gethash(int key)
	{
		return key%Size;
	}
	
	public void put(int key,T value)
	{
		int index=gethash(key);
		Entry arrayvalue= arrayhash[index];
		Entry newitem = new Entry<T>(key,value);
		newitem.next=arrayvalue.next;
		arrayvalue.next=newitem;
	}
	
	public T get(int key)
	{
		T value=null;
		int index=gethash(key);
		Entry arrayvalue=arrayhash[index];
		while(arrayvalue!=null)
		{
			if(arrayvalue.getkey()==key)
			{
				value=(T)arrayvalue.getvalue();
				break;
			}
			arrayvalue=(Entry)arrayvalue.next;
		}
		return value;
	}

}
