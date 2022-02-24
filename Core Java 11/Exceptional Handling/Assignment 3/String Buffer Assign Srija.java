public class StringBufferAssignment 
{
	 public static void main(String[] args)
	 {
	 StringBuffer s = new StringBuffer("");
	  System.out.println(s);
	  s.append("StringBuffer");
	  s.append(" is a peer class of String");
	  s.append(" that provides much of");
	  s.append(" the functionality of strings");
	  System.out.println(s);
	  StringBuffer str = new StringBuffer("It is used to at the specified index position");
      str.insert(14, "insert text ");
      System.out.println(str);
      StringBuffer sbf = new StringBuffer("This method returns the reversed object on which it was called");
      sbf.reverse();
      System.out.println(sbf);
    }
	 }