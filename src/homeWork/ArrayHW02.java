package homeWork;

public class ArrayHW02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] animals = {"tiger","lion","rabbit","monkey","eagle"};
		
		for(int i=0; i<animals.length; i++) {
			
			System.out.println(animals[i]);
		}
		
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
		for(String name : animals) {
			
			System.out.println(name);
		}

	}

}
