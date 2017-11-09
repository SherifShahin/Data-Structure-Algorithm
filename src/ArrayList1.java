import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 
{
	public static void main(String[]args)
	{
		ArrayList<String> stevejobs =new ArrayList<String>();
		stevejobs.add("apple");
		stevejobs.add("pixar");
		stevejobs.add("Next");
		System.out.println(stevejobs);
		System.out.println("-----------------------");
		ListIterator<String> listlterator=stevejobs.listIterator();
		while(listlterator.hasNext())
		{
			String value =listlterator.next();
			System.out.println(value);
		}
	}
}
