
public class MRH1JavaQuestion2 {
public static void main(String[] args) {
	int a=5 ;
	int b=10;
	int c=-6;
	
	System.out.println(a>b&&a<c); //false
	System.out.println(b>15&&c<0 || a>0); //true
	System.out.println(a==c || b>a); //true
	System.out.println(a/2.0==0.0 && b/2.0!=0.0 || c<0.0); //true
	System.out.println(a>>1<0); //false
}
}
