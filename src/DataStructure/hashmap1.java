import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
public class hashmap1
{

	public static void main(String[]args) throws IOException
	{
		ArrayList<String> elonmusk =new ArrayList<String>();
		elonmusk.add("tesla");
		elonmusk.add("Space X");
		
		ArrayList<String> stevejobs =new ArrayList<String>();
		stevejobs.add("apple");
		stevejobs.add("pixar");
		stevejobs.add("Next");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("search: ");
		String search=br.readLine().toLowerCase();	
	
		HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
		hm.put("elon",elonmusk);
		hm.put("steve",stevejobs);
		
		System.out.println(hm.get(search));
	}

}
