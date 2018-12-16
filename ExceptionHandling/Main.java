package ExceptionHandling;

public class Main {
	
	
		public static void main(String[] args) {
			//Type your code here,havoccboi..	
		try {
			Circle c1 = new Circle(5);
			System.out.println("Radius is " +c1.getRadius());
			Circle c2 = new Circle(-5);
	}catch(InvalidRadiusException e) {
		System.out.println(e);
	}
		System.out.println("...Rest of the code");
		}

}
