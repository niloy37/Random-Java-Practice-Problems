package ExceptionHandling;

public class Circle {
	private int radius;
	
	
	Circle(int radius)throws InvalidRadiusException{
		if( radius < 0 ) {
			throw new InvalidRadiusException();
		}
		else this.radius=radius;
	}
	public int getRadius() {
		return this.radius;
	}

}
