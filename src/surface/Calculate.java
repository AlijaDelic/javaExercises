package surface;

public class Calculate {
	
	public static double calculate (Object shape) {
		double result = 0;
		
		if(shape.getClass() == Rectangle.class) {
			
			result = ((Rectangle) shape).a * ((Rectangle) shape).b; 
			
		}
		
		else if(shape.getClass() == Circle.class) {
			
			result = ((Circle) shape).r * ((Circle) shape).r * 3.14;
			
		}else {
			System.out.println("Wrong shape");
		}
		
		
		return result;
	}
}
