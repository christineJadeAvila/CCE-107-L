package src;
import java.util.Scanner;

public class W2A1AVILA {

	public static void main(String[] args) {
		// Initialization
		int input_row = 4;
		int input_col = 6;
		int gradeArray[][] = new int[input_row][input_col];
		int year = 1;
		String[] subjects = {"ENG", "MTH", "TLE", "PE", "FIL", "AP"};
		
		Scanner input = new Scanner(System.in);
		
		// Input the Elements of the Array
		System.out.println("Enter Grades: ");
		
		for(int row = 0; row < input_row; row++) {
			System.out.println("Input grades in Year: " + year++);
			for(int col = 0; col < input_col; col++) {
				System.out.print(subjects[col] + ": ");
				gradeArray[row][col] = input.nextInt();				                
			}
			System.out.println();
		}
		
		displayTable(gradeArray);
		System.out.println();
		highestValue(gradeArray);
	} 
	
	public static void displayTable(int[][] gradeArray) {
		int year = 1;
		System.out.println("SUBJECTS: \t\tENG MTH TLE PE FIL AP\n----------------------------------------------");
		for(int row = 0; row < gradeArray.length; row++) {
			System.out.print("Final Grades in Year " + year++ + ": ");
			for (int col = 0; col < gradeArray[row].length; col++) {
				System.out.print(gradeArray[row][col] + "  ");
			}
			System.out.println();
		}
	}
	
	public static void highestValue(int[][] gradeArray) {
		int max;
		
		for (int row = 0; row < gradeArray.length; row++) {
			// ASSUME that the first element of the row is the largest
			max = gradeArray[row][0];
			for (int col = 1; col < gradeArray[row].length; col++) {
				if (max < gradeArray[row][col]) {
					max = gradeArray[row][col];
				}
			
			}
			
			System.out.println("The Largest element of year " + (row + 1) + " = " + max);
		}
	}

}
