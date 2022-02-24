public class StringBuilderAssignment {
		public static void main(String[] args)
		 {
		 StringBuilder s = new StringBuilder("");
		 System.out.println(s);
		 s.append("StringBuilder");
		 s.append(" is a peer class of String");
		 s.append(" that provides much of");
		 s.append(" the functionality of strings");
		 System.out.println(s);
		 StringBuilder str = new StringBuilder("It is used to at the specified index position");
	     str.insert(14, "insert text ");
	     System.out.println(str);
	     StringBuilder sbr = new StringBuilder("This method returns the reversed object on which it was called");
	     sbr.reverse();
	     System.out.println(sbr);
	    }


	}