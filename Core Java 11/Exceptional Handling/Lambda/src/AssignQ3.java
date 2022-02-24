import java.util.function.Function;
public class AssignQ3 {
    static int modifyValue(int n,Function fun) {
    	return (int)fun.apply(n);
    	}
    static class Product {
    }
    static void display(int r) {
        System.out.println(r);
    }
    public static void main(String[] args) {
        int r =modifyValue(6,val->(Integer)val+ 10);
        display(r);
    }
}