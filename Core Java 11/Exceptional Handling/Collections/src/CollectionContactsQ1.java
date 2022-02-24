import java.util.TreeMap;
public class CollectionContactsQ1 {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 944006068, "Sesh");
		contact.put((long) 984902331, "Shiva");
		contact.put((long) 82145924, "Keerthi");
		contact.put((long) 801475961, "Hari");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}