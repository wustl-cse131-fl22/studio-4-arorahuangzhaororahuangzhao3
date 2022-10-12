package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double paramterOne = in.nextDouble();
		double paramterTwo = in.nextDouble();
		double paramterThree = in.nextDouble();
		double paramterFour = in.nextDouble();
		
		//if .compareTo to compare strings (can't do ==)
			Color c = new Color (redComponent, greenComponent, blueComponent);
			StdDraw.setPenColor(c);
			
			if(isFilled) {
			StdDraw.filledRectangle(paramterOne, paramterTwo, paramterThree, paramterFour);
			
			} else {
				StdDraw.rectangle(paramterOne, paramterTwo, paramterThree, paramterFour);
			}
			
			
			
			
			
			

		
		
	}
}
