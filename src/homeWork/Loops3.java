package homeWork;

public class Loops3 {

	public static void main(String[] args) {
		
		int i=20;
		
		while(i>=1) {
		System.out.print(i+" "); // first way
			i-=2;
		}
		
		
		int x=20;
		
		while(x>=1) {
			if(x%2==0)
			{
				System.out.print(x+" "); //second way
			}
			x--;
		}

	}

}
