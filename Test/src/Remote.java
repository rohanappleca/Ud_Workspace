
public class Remote implements WebD {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print from Remote class");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Display from Remote class");
	}

	
	public void check() {
		
		System.out.println("Check from Remote class");
	}


	
	public static void main(String[] args) {
		
		WebD d=new Remote();
		d.display();
		d.print();
	
		 Remote r=new Remote();
		 
	}
	
	

}
