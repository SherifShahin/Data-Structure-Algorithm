
public class StackArrayMain {

	public static void main(String []args)
	{
		StackArray<Integer> sa=new StackArray<Integer>(10);
		sa.push(10);
		sa.push(15);
		sa.push(7);
		sa.push(48);
		System.out.println("top: "+sa.top);
		System.out.println(sa.pop());
		System.out.println("top: "+sa.top);
		
	}

}
