
public class Students {

	
	String studentName;
	int rollNo;
	
	// Default Constructor
	
	
	public Students(){
		System.out.println("default constructor");
	}
	
	public Students(int i) {
		System.out.println(i);
		
	}
	// Parameterized constructor
	public Students(String studentName,int rollNo) {
		
		this();
		//this(10);
		this.studentName=studentName;
		this.rollNo=rollNo;
		
		
	}
	public static void main(String[] args) {
		
		
		Students st=new Students("RohanSid",111);
		System.out.println(st.studentName+" "+st.rollNo);
		
	    
	    
	

	}

}
