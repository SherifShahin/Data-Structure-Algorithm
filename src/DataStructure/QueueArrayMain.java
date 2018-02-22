
public class QueueArrayMain {

	public static void main(String[] args)
	{
	  QueueArray<String> qa=new QueueArray<String>(4);
	  qa.queue("elon musk");
	  qa.queue("Space X");
	  qa.queue("tesla");
	  qa.queue("wall E");
	  System.out.println(qa.dqueue());
	  System.out.println(qa.dqueue());
	  System.out.println(qa.dqueue());
	  System.out.println(qa.dqueue());
	  System.out.println(qa.front);	  
	  qa.queue("google");
	  System.out.println(qa.front);
	  

	}

}
