package ProjectExercises;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int [] arr= new int[5];
		
		
		System.out.println("Please enter array values");
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
		arr[i]=input.nextInt();
		sum+=arr[i];
		
		}
		System.out.println("sum of array = "+sum);

		

  }
}