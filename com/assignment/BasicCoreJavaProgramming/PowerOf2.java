package com.assignment.Day5Practice;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Take N value from command line argument");
     int N = Integer.parseInt(args[0]);
     if(N<31) {
    	 System.out.println("N is valid .Again enter n value between 0 to 31");
     }
     else {
    	 System.out.println("Invalid N value");
    	 System.exit(0);
     }
       for(int i=0;i<=N;i++) {
    	   double j= Math.pow(2, i);
    	   System.out.println(j+" ");
       }
	}

}
