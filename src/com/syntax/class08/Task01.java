package com.syntax.class08;

public class Task01 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=2; i<=50; i+=2) {
			System.out.print(i+" ");
			sum+=i;
			}
		System.out.println(sum);
		

	   int sum2=0;
	   
	   for(int x=1; x<=50; x+=2) {
		   
		   System.out.print(x+" ");
		   sum2+=x;
	   }
	   System.out.println(sum2);
	   
	   int total=sum+sum2;
	   System.out.println(total);
	}
}

