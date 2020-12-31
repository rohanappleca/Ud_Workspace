package polymorphism;

public class CITI extends RBI {

	public static void main(String[] args) {

		CITI obj = new CITI();
		//System.out.println(obj.getHomeLoanROI());
        System.out.println(obj.getObj());
	}

	// Overridden method for getting Home loan interest
	
	  public double getHomeLoanROI(){
	  
	  return 10.75;
	  
	  }
	 
	
	// Covariant return type -i.e Class names are accepted but not Primitive data types
	public AMEX getObj(){
		
		AMEX obj2=new AMEX();
		return obj2;

		
	}

}
