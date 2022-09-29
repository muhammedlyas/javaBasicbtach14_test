package reviewclass1;

public class VariablesDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if we want to store number we can use below data types numbers
		 * without decimal parts like 10,23,40000 but we can not use them to store 
		 * decimal numbers like 12.5 , 1.5 etc
		 * byte
		 * short
		 * int
		 * long
		 * although above four types can be use to store whole numbers but we will
		 * be using int most of the time as it can handle up to billions and does not waste 
		 * a lot of space form RAM (memory where computer stores the programs which are opened
		 * and running currently).  
		 */
		
		int box1 = 12;
		
		//int => data type 
		//box1 =>variable name
		//= is called assignment operator and used to store data in variable
		//12 its the data that we want to store in box1
		// ; language rule we need to end all the lines with semicolons
		
		int box2; //creating a box but not storing data right away in the box
		box1=20;
		
		box1=30; // i am replacing the value 12 stored in box1 with 30;
		
		System.out.println(box1);
		System.out.println(box1);
	}

}
