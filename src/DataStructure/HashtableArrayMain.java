
public class HashtableArrayMain 
{
	public static void main(String[]args)
	{
		HashTableArray<String> hash=new HashTableArray<String>(5);
		hash.put(10,"elon musk");
		hash.put(10,"tesla");
		hash.put(10,"space X");
		
		hash.put(11,"Steve jobs");
		hash.put(11,"apple");
		hash.put(11,"pixar");
		hash.put(11,"Next");
		
		System.out.println(hash.get(10));

		HashTableArray<Integer> hash2=new HashTableArray<Integer>(5);
		hash2.put(16,11);
		hash2.put(16,27);
		hash2.put(16,35);

		System.out.println(hash2.get(16));
		
	}

}
