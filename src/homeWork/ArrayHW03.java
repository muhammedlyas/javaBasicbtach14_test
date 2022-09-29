package homeWork;

public class ArrayHW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {10,20,30,40,50};
		
		for(int allNum : numbers) {
			
			System.out.println(allNum);
		}
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
       
		int sum=0;
		
		for(int i=0; i<numbers.length; i++) {
			
			sum+=numbers[i];
		}
		System.out.println(sum);
	}

}
