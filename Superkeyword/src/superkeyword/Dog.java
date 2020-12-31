package superkeyword;

public class Dog extends Animal {

	
	
	
	  public Dog() {
	  
	  System.out.println("Dog constructor"); }
	 
	  
	  
	  public Dog(int x) {
	  System.out.println("Dog int constructor"); }
	 
	 

	public void sound() {

		super.sound();// sound method from superclass is called with super keyword
		System.out.println("Dog sound");

	}
}
