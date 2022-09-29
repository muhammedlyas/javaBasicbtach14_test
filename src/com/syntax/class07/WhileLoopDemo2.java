package com.syntax.class07;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print all number from 1 to 10
		
		int num=1;
		
		while(num<=10) {
			
			System.out.println(num);
			num++;
			
		}
		
		int x=50;
		
		while (x>=20) {
			//System.out.print(x+" ");
			x--;
		}
		
		int y=2;
		while(y<=20) {
			
			//System.out.print(y+" ");
			
			y+=2;
		}
		
		int i=1;
		while(i<=20) {
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			i++;
		}

	}

}
