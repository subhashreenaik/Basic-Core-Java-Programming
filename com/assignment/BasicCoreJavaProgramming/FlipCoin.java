package com.assignment.Day5Practice;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of times to flip a coin: ");
	    Scanner s = new Scanner(System.in);
	    int n =s.nextInt();
	    int head=0;
		int tail=0;
		
		
	    for (int i=1;i<=n;i++) {
	    	
	    	Random r=new Random();
	        int flip =r.nextInt(2);
	    	if (flip == 1) {
	        	head++;
	        	
	        }
	        else {
	        	tail++;
	        	
	        }
	    	
	    }
	    System.out.println("Count of head is "+head);
    	System.out.println("Count of tail is "+ tail);
    	System.out.println("Percentage of head is "+(head*100)/n);
    	System.out.println("Percentage of tail is "+(tail*100)/n);
    	
	    
	      
        
        
	}

}
