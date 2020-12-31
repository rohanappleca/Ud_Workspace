package abstraction;

public class Test2 extends Test{

	public static void main(String[] args) {
		
		
		Test2 t2=new Test2();
		t2.show();
		t2.display();
		t2.add();

	}

	@Override
	public void show() {
		System.out.println("Show from Test2 Class");
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Add from Test2 Class");
	}

}
