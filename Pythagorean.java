package pythagorean;
import java.util.Scanner;

public class Pythagorean {
	
	 public static void main( String args[] ) {
		    
	        //Declare the scanner and setup variables
	        Scanner sc = new Scanner(System.in); 
	        int knownSides;
	        //Prompt user and get info
	        System.out.println("Which sides do you know? Enter 1 for leg and leg or enter 2 for leg and hypotenuse.");
	        knownSides = sc.nextInt();
	        double legA, legB, hyp;

	        //If/Else Commands Begin

	        if(knownSides == 1) {
	            //Prompts for legs
	            System.out.println("Enter the length of one leg.");
	                legA = sc.nextDouble();
	            //If values are 0 or negative, we redo it
	            if(legA <= 0) {
		         do {
		         System.out.println("The number you entered was not positive. Please try again.");
		         legA = sc.nextDouble();
		         } 
		         while(legA <= 0);
	            }
	                
	            System.out.println("Enter the length of the other leg.");
	                legB = sc.nextDouble();
	            //If values are 0 or negative, we redo it
	            if(legB <= 0) {
	            	do {
	            	System.out.println("The number you entered was not positive. Please try again.");
	            	legB = sc.nextDouble();
	            	} 
	            	while(legB <= 0);
	              
	            //Now the math begins!
	            hyp = (Math.sqrt( Math.pow(legA, 2) + Math.pow(legB, 2) ) );
	            //After that monstrosity, we print!
	            System.out.print("The length of the hypotenuse is " + hyp);
	            }
	        }
	        
	        else if(knownSides == 2) {
	        	//Prompts for sides
	        	System.out.println("Enter the length of the leg.");
                	legA = sc.nextDouble();
                //If values are 0 or negative, we redo it
    	        if(legA <= 0) {
    	         do {
    	         System.out.println("The number you entered was not positive. Please try again.");
    	         legB = sc.nextDouble();
    	         } 
    	         while(legA <= 0);
    	        }
    	         
                System.out.println("Enter the length of the hypotenuse.");
                	hyp = sc.nextDouble();
                //The hyp cannot be less than 0 and cannot be smaller than the leg
        	    if(hyp <= 0 || (hyp < legA)) {
        	     do {
        	     System.out.println("The hypotenuse is less than 0 or smaller than the leg. Please try again.");
        	     hyp = sc.nextDouble();
        	     } 
        	     while(hyp <= 0 || (hyp < legA));
        	     }
                
               //More math!
                legB = (Math.sqrt( Math.pow(hyp, 2) - Math.pow(legA, 2) ) ); 
                System.out.print("The length of the other leg is is " + legB);
        	    	}
	        
	        //Loops back to entry code
	        else {
	        	do {
	        	System.out.println("You entered an invalid number. Please try again");
	        	knownSides = sc.nextInt();
	        	}
	        	while(knownSides != 1 || knownSides != 2); 
	    } 
	        sc.close();
    	        		}

	        		}

	





   
   