
public class QueueLinkedListMain 
{

	public static void main(String[] args) 
	{
		QueueLinkedList<String>  ql=new QueueLinkedList<String>(new NodeDouble<String>(null,"sherif", null));
		ql.queue(new NodeDouble<String>(null, "tesla",null));
		ql.queue(new NodeDouble<String>(null, "Space x",null));
		ql.queue(new NodeDouble<String>(null, "elon musk",null));
		
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());		
		}

}
