package ProjectExercises;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String [] countries = {"Turkiye","Uzbekistan","US","France","Germany"};
		
		System.out.println("Please select one of the countries above");
		for(int i=0; i<countries.length; i++) {
			countries[i]=input.next();
			
			if(countries[i].equalsIgnoreCase("Turkiye")) {
				
				System.out.println("Ankara capital of the "+countries[i]);
			}
			else if(countries[i].equalsIgnoreCase("Uzbekistan")) {
				System.out.println("Tashkent capital of the "+countries[i]);
			}
			else if(countries[i].equalsIgnoreCase("US")) {
				System.out.println("DC capital of the "+countries[i]);
			}
			else if(countries[i].equalsIgnoreCase("France")) {
				System.out.println("Paris capital of the "+countries[i]);
			}
			else if(countries[i].equalsIgnoreCase("Germany")) {
				System.out.println("Berlin capital of the "+countries[i]);
			}
			else
			{
				System.out.println("invalid country");
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
