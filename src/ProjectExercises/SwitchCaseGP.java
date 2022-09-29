package ProjectExercises;

import java.util.Scanner;

public class SwitchCaseGP {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numOfStudents = input.nextInt();
		String name;
	    
		switch(numOfStudents) 
		{
		case 1:
		    name="Asma";
		    break;
		case 2:
			name="Athira";
			break;
		case 3:
			name="Humera";
			break;
		case 4:
			name="Kenny";
			break;
		case 5:
			name="Muhammed";
			break;
		case 6:
			name="Nergis";
			break;
		case 7:
			name="Nesrin";
			break;
		case 8:
			name="Priyasri";
			break;
		case 9:
			name="Tymur";
			break;
		case 10:
			name="Vidya";
			break;
		default :
			name="invalid";
			System.out.println("Sorry in our group project only 10 people exist. Try to enter values 1-10.");
				
		}
         System.out.println(name);
	}

}
