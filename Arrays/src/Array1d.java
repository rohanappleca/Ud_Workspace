
public class Array1d {

	public static void main(String[] args) {
		
		
		int[] array= new int[5];
		
		for (int i=0;i<array.length;i++) {
			
			
			array[i]=(int)(Math.random()*10);
			
		}
		

		
		  for (int var:array) {
		  
		  System.out.println(var); }
		 
		

	}

}
