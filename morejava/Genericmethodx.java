import java.util.*;

class Main{
    public static void main (String [] args){
        int a=5,b=10;
        System.out.println(max(a,b));
    }

    public static <E extends Comparable<E>> int max(E a, E b){
       return a.compareTo(b);
    }
}
