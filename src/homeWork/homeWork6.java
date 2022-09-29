package homeWork;

import java.util.Scanner;

public class homeWork6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please tell me where are you from?");
		String country = input.nextLine();
		
		String language;
		
		switch(country) {
		
		case "Usa":
			language ="English";
			break;
		case "Turkey":
			language ="Turkish";
			break;
		case "Ksa":
			language ="Arabic";
			break;
		case "Uzbekistan":
			language ="Uzbek";
			break;
		default:
			language ="unknown language";
				
		}
		System.out.println("Your country is "+country+" and your language is "+language);

	}

}
