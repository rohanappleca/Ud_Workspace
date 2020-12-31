package collectionsexamples;

public class Autoboxing {

	public static void main(String[] args) {
		
		
		int var=10;
		Integer obj=new Integer(var); // Autoboxing or Wrapping
		
	    System.out.println(obj); // Prints value 10
	    
	  /*  int i=obj; // Unboxing or Unwrapping
	    System.out.println(i);*/
	    
	   int j= obj.intValue(); // Unboxing or Unwrapping .This is what was mentioned in the tutorial 
	     
		
		

	}

}
