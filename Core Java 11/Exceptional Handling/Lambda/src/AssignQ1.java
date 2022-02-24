import java.util.function.BiFunction;


public class AssignQ1 {
 
    public static void main(String[] args) {
 
        
        BiFunction <Integer, Integer, Integer> funcAddObj = (i1, i2) -> i1 + i2;
 
  
        BiFunction <Integer, Integer, Integer> funcSubtractObj = (i1, i2) -> i1 - i2;
 
        BiFunction <Integer, Integer, Integer> funcMuliplyObj = (i1, i2) -> i1 * i2;
 
        BiFunction <Integer, Integer, Integer> funcDivideObj = (i1, i2) -> i1 / i2;
 
        BiFunction <Integer, Integer, Integer> funcModuloObj = (i1, i2) -> i1 % i2;
 
        System.out.println("Addition of 12 and 6: " + funcAddObj.apply(13, 5));
 
        System.out.println("Subtract of 12 and 6: " + funcSubtractObj.apply(13, 5));
 
        System.out.println("Multiply of 10 and 1: " + funcMuliplyObj.apply(13, 5));
 
        System.out.println("Division of 120 and 12: " + funcDivideObj.apply(13, 5));
 
        System.out.println("Modulo of 12 and 2: " + funcModuloObj.apply(13, 5));
 
    }
 
}