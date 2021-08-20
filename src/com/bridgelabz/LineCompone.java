package com.bridgelabz;
import java.lang.Math.*;

public class LineCompone {
	public static void main(String[] args) {
		System.out.println("Welcome to line Comparision Computation");
		
		int x1,x2,y1,y2,a1,a2,b1,b2;
		double length,length1;		
		x1=2;y1=2;x2=4;y2=4;
		a1=6;a2=6;b1=8;b2=8;
		length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		length1=Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		System.out.println("length of line "+"("+x1+","+y1+"),"+"("+x2+","+y2+")=>"+length);
		
		if((x1/x2 == y1/y2))
			System.out.println("Lines are equal");
		else
			System.out.println("Lines are not equal");
		
		if (length>length1)
			System.out.println("First length is greater than second ");
		else if(length<length1)
			System.out.println("First length is lesser than second");
		else
			System.out.println("Both the lengths are equal");
			
		
	
		
		
		

		
		
			
		
	}

}
