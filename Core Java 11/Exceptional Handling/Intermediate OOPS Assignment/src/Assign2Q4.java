abstract class chocolates{
	abstract void eat();
}
class silk extends chocolates{
	void eat(){System.out.println("had silk");}
}	
class kitkat extends chocolates{
	void eat() {System.out.println("had kitkat");}
}
class testing{
	public static void main(String args[]){
	chocolates c1=new silk();
	c1.eat();
	chocolates c2=new kitkat();
	c2.eat();
}	
}
