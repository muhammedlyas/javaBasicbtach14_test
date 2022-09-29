package homeWork;

public class ArrayHW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers= {14,27,58,42,33};
		
		int largestNumber = 0 ;
		
		for(int i=0; i<numbers.length; i++) {
			
			if(largestNumber<numbers[i]) {
				
				largestNumber=numbers[i];
			}
		}
		
		System.out.println(largestNumber);

	}

}
