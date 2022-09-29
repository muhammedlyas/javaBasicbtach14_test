package com.syntax.class05;

public class Recap2 {
          public static void main(String[] args) {
			
        	  
        	  boolean allergy = false;
        	  
        	  String allergyType = "Pollen";
        	  
        	  if(allergy) {
        		  System.out.println("lets check what allergy you have");
        		  if(allergyType.equals("Pollen"))
        		  {
        			  System.out.println("Try to stay indoors when trees are ");
        		  }
        		  else if(allergyType.equals("Peanut"))
        		  {
        			  System.out.println("Please stay away from peanut");
        		  }
        		  else if(allergyType.equals("Dairy"))
        		  {
        			  System.out.println("Stay away from dairy produtcs");
        		  }
        		  else
        		  {
        			  System.out.println("we need to do some test");
        		  }
        	  }
              else
        	  {
        			  System.out.println("You are lucky");
        	  }
         
          }
}
