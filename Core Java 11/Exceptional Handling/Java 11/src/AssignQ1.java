@FunctionalInterface
interface Func<T1,T2,T3,R> {
     R apply(T1 t1, T2 t2, T3 t3);
}
public class AssignQ1
{
    public static void main (String[] args)
    {
        Func <Integer,Integer,Integer,Integer>  i = ( var p,var j,var r) -> (p*j*r);
        System.out.println(i.apply(50,90,150));
    }
}