
public class Test13Aug {

	static int a=10;
	 
	
	public static void test1() {
		
		
		a=20;
		System.out.println("From test1 method"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("From Main Method "+Test13Aug.a);
		Test13Aug.test1();
		System.out.println("From Main Method "+Test13Aug.a);
	}

}




