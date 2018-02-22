
public class StackArrayDynamicMain 
{
	public static void main(String[]args)
	{
		StackArrayDynamic<Integer> sd=new StackArrayDynamic<Integer>(2);
		sd.push(17);
		sd.push(165);
		System.out.println("size: "+sd.arraystack.length);
		sd.push(67);
		sd.push(77);
		System.out.println("size: "+sd.arraystack.length);
		System.out.println("top: "+sd.top);
    	System.out.println(sd.pop());
		System.out.println("size: "+sd.arraystack.length);
		System.out.println("top: "+sd.top);
		System.out.println(sd.pop());
		System.out.println("size: "+sd.arraystack.length);
		System.out.println(sd.pop());
		System.out.println("top: "+sd.top);
		System.out.println("size: "+sd.arraystack.length);
		
	}
	
}
