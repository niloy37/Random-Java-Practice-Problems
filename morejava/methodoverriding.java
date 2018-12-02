class methodoverriding {
    public static void main(String[] args) throws java.lang.Exception {
	 A obj = new A();
    System.out.println(obj.toString());
    obj = new B ();
    
    System.out.println(obj.toString());
    
    }
}
 class A {
	 public String toString() {
		 return "superclass tostring";
	 }
 }
 class B extends A{
	 public String toString() {
		 return "sub class toString";
	 }
 }


