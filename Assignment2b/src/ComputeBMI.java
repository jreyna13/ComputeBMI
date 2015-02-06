//Javier Reyna EG1305A 02/05/2015

import javax.swing.JOptionPane;

public class ComputeBMI {
	
	public static void main(String[] args) {
		
		// dialog box weight algorithm
		
		double weight;
		String str;
		str = JOptionPane.showInputDialog ("Enter your weight in pounds.");
		
		weight = Double.parseDouble(str);
		
		// dialog box height algorithm
		
		double height;
		
		String str2;
		
		str2 = JOptionPane.showInputDialog ("Enter your height in inches.");
		
		height = Double.parseDouble(str2);
		
		//BMI calculations
		
		double height_conv = height*height;
		
		double first_calc = weight/height_conv;
		
		double BMI = first_calc*703;
		
		
		JOptionPane.showMessageDialog(null,"Your Body Mass Index is: " +BMI);
		
		System.exit(0);
		
		//String keyboard = JOptionPane.showInputDialog ("Enter your height in inches.");
	}
}
