
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashmap2
{

	public static void main(String[] args) 
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("sherif","shahin");
		hm.put("elon","musk");
		hm.put("steve","jobs");
		
		Set<String> key=hm.keySet();
		Iterator<String> ite=key.iterator();
		while(ite.hasNext())
		{
			String S=ite.next();
			System.out.println("key: "+S+" => value:"+hm.get(S));
		}
	}

}
