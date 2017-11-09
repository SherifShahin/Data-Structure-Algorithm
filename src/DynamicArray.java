import java.util.Arrays;

public class DynamicArray <T>
{
	Object data[];
	int size;
	public DynamicArray()
	{
		size=0;		
		data=new Object[1];
	}
	
	public int getsize()
	{
		return data.length;
	}
	
	public T get(int index)
	{
		return (T)data[index];
	}
	
	public void put(int element)
	{
		encurecapacity(size+1);
		 data[size++]=element;
	}
	
	public void encurecapacity(int mincapacity)
	{
		int oldcapacity=data.length;
		if(mincapacity>oldcapacity)
		{
			int newcapacity=oldcapacity*2;
			
			if(newcapacity<mincapacity)
				newcapacity=mincapacity;
			data=Arrays.copyOf(data, newcapacity);
		}
	}

}
