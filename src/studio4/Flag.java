package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//this is the rectangle base
		Color purple = new Color (201, 157, 208);
		StdDraw.setPenColor(purple);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
	
		//this is a head
		Color orange = new Color (255, 204, 153);
		StdDraw.setPenColor(orange);
		StdDraw.circle(0.5, 0.5, .1);
		
		//this is the body
		Color green = new Color (204,255,204);
		StdDraw.setPenColor(green);
		// first point... second point (going to)
		StdDraw.line(0.5, 0.5, 0.3, 0.3);
		
		StdDraw.line(0.5, 0.5, 0.7, 0.3);
		
		//this is a head
		StdDraw.setPenColor(orange);
		StdDraw.circle(0.2, 0.3, .07);
		
		StdDraw.circle(0.8, 0.3, .07);
		
		//draw last lines
		StdDraw.setPenColor(green);
		StdDraw.line(0.2, 0.3, 0.09, 0.09);
		//moved it .11... go add .11
		StdDraw.line(0.2, 0.3, 0.31, 0.09);
		
		StdDraw.line(0.8, 0.3, 0.69, 0.09 );
		StdDraw.line(0.8, 0.3, 0.91, 0.09 );
		
		
	}
}