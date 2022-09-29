package homeWork;

public class ArrayHW01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] carName=new String[6];
		
		carName[0]="Mercedes";
		carName[1]="BMW";
		carName[2]="Audi";
		carName[3]="Volkswagen";
		carName[4]="Seat";
		carName[5]="Porche";
		
		for(String brand : carName) {
			
			System.out.println(brand);
		}
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*");
		
		for(int i=0; i<carName.length; i++) {
			
			System.out.println(carName[i]);
		}

	}

}
