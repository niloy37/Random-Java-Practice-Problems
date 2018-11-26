import java.util.*;

public class Arraylssst {
public static void main(String[] args) {
	ArrayList <Integer> s = new ArrayList<Integer>();
	s.add(bigmod("123123123123123123",10));
	s.add(bigmod("1238912312319282312455",9));
	System.out.println(s);
}


public static int bigmod(String s , int a) {
	int res=0;
	for(int i=0;i<s.length();i++) {
		res = (res*10+(int)(s.charAt(i)-'0'))%a;
	}
	return res;
	
}
}
