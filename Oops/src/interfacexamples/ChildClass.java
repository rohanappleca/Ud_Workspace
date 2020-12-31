package interfacexamples;

public class ChildClass extends ParentClass1 implements Parent1,Parent2{

	public static void main(String[] args) {
		
    ChildClass ch=new ChildClass();
    ch.show();
    
		
	}

	public void show() {
		
		System.out.println("Child Class show");
	}
	

}
