
public class Test {

	
	public void add() {
		
		System.out.println("Add");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		
		//Class c=Test.class; 
		// Using MyClass.class method
		
		
		
		  Class d=Class.forName("Test"); // Using Class.forname()
		  
		  Class e=d.getClass();
		  System.out.println(d.getClass().getSimpleName());
		 
		 		
		

	}
}
