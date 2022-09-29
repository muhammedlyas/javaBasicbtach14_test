package homeWork;

public class Loops4 {

	public static void main(String[] args) {
		
		int i=21;
		
		while(i<=50) {
			System.out.print(i+" "); //first way
			i+=2;
		}
		
		
		int x=20;
		
		while(x<=50) {
			if(x%2==1)
			{
				System.out.print(x+" "); //second way
			}
			x++;
		}

	}

}
