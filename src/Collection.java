import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collection 
{

    public static void main(String[]args)
    {
    	HashMap<Integer,String> mp=new HashMap<Integer,String>();
    	mp.put(2,"elon musk");
    	mp.put(1,"tesla");
    	mp.put(4,"Space X");
    	
    	System.out.println(mp.get(1));
    	
    	Queue<String> q=new LinkedList<String>();
    	q.add("elon musk");
    	System.out.println(q.poll());
    	
    	Stack<String> st=new Stack<String>();
    	st.push("Space x");
    	System.out.println(st.pop());
    	
    	LinkedList<String> li=new LinkedList<String>();
    	li.add("pixar");
    	System.out.println(li.poll());
    	
    	ArrayList<String> da=new ArrayList<String>();
    	da.add("NEXT");
    	da.add("apple");
    	da.add("google");
    	System.out.println(da.get(0));
    	System.out.println(da.size());
    	System.out.println(da);
    	da.remove(1);
    	System.out.println(da);
    	System.out.println(da.contains("google"));
    	
    }
	

}
