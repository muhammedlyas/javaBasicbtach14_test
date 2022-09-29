package ProjectExercises;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numbers = { 
				{1,2,3,4,5},
				{10,20,30,40,50},
				{100,200,300,400,500}
				};
		
		int sum=0;
				
		for(int i=0; i<numbers.length; i++) {
	     
			for(int j=0; j<numbers[i].length; j++) {
	    	
				System.out.print(numbers[i][j]+" ");
				sum+=numbers[i][j];
	     }
	      System.out.println();
	      System.out.println("sum ="+sum);
		}
		
	}
	

}
