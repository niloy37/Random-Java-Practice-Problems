package ExceptionHandling;
import java.lang.Exception;
public class InvalidRadiusException extends Exception{
	
	
	InvalidRadiusException()
	{
		super("InvalidRadiusException/ Radius cannot be negative");
	}

}
