package com.bridgelabz;
import java.lang.Math.*;

public class LineCompone {
	public static void main(String[] args) {
		System.out.println("Welcome to line Comparision Computation");
		
		int x1,x2,y1,y2;
		double length;
		x1=2;y1=2;x2=4;y2=4;
		length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("length of line "+"("+x1+","+y1+"),"+"("+x2+","+y2+")=>"+length);
		
		if((x1/x2 == y1/y2))
			System.out.println("Lines are equal");
		else
			System.out.println("Lines are not equal");
			
		
	}

}
