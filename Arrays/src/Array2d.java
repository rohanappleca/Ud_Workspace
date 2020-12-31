
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] array=new int[2][3];
		//System.out.println(array.length);
		
		for (int i=0;i<array.length;i++) {
			
			for(int j=0;j<array[i].length;j++) {
				
				array[i][j]=(int)(Math.random()*100);
				System.out.print(array[i][j]+" ");
			}
			
			System.out.println();
		}
			

	}

	
}
