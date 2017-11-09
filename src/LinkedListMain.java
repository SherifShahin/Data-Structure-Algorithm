
public class LinkedListMain 
{
	public static void main(String[]args)
	{
		LinkedList ls=new LinkedList(new <String>node("ELON MUSK",null));
		ls.add(new node("tesla",null));
		ls.add(new node("space X",null));
		ls.display();
		ls.delete();
		System.out.println("after delete");
		ls.display();
	}

}
