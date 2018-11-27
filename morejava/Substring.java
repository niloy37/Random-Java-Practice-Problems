package morejava;
import java.util.*;


public class Substring {
	public static void main(String[] args) {
		String s= "EOvdedn";
		String s1;
		String s2;
StringBuilder sb = new StringBuilder();
StringBuilder sb2 = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				sb.append(s.charAt(i));
			}
			else sb2.append(s.charAt(i));
			
			
		}
		System.out.println(sb.toString());
		System.out.println(sb2.toString());
	}

}
