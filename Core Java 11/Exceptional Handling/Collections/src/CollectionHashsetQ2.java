import java.util.HashSet;

public class CollectionHashsetQ2 {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("Pink");
		hs.add("Blue");
		hs.add("Green");
		hs.add("White");
		hs.add("Black");
		
		System.out.println("Original");
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.add("Gold");
		hs.add("Silver");
		
		System.out.println("After adding duplicate elements");
		System.out.println(hs);
		System.out.println(hs.size());
	}

}