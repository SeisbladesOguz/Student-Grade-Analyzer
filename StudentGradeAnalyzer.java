
import java.util.Scanner;

public class StudentGradeAnalyzer {
	public static void main(String[] args) {
		// Initialize Scanner for user input.
		Scanner in = new Scanner(System.in);
		System.out.print("How many grades will you enter? ");
		// Define the size of the array based on user input.
		int maxGradesLength = in.nextInt();

		int[] grades = new int[maxGradesLength];

		System.out.print("Please enter grades: ");
		// Loop to collect grades from the user and store them in the array.
		for (int i = 0; i < maxGradesLength; i++) {

			grades[i] = in.nextInt();

		}
		
		System.out.println("\n-----------------------------------");

		System.out.print("Entered  grades are: ");
		// Use enhanced for-loop to print all entered grades
		for (int g : grades) {
			System.out.print(g + " ");
		}
		
		System.out.println();
		in.close(); // Close the scanner to prevent resource leaks.
		// Variable to store the sum of all grades
		int sum = 0;

		for (int g2 : grades) {
			sum = sum + g2;
		}
		// Calculate average. Note: (double) cast is used to prevent integer division
		double average = (double) sum / grades.length;

		System.out.printf("Average is: %.2f\n", average);
		// Check if the student has passed or failed based on the threshold
		if (average >= 50) {
			System.out.println("");
			System.out.print("Status: Student passed");
			
		} else {
			
			System.out.print("Status: Student fail");
			System.out.println("");
		}
		// Logic to find the highest grade in the array
		int maxGrade = grades[0];

		for (int g3 : grades) {

			if (g3 > maxGrade) {
				maxGrade = g3;
			}

		}
      
		System.out.print("Max grade is: " + maxGrade);
		System.out.println("");
		
		// Logic to find the lowest grade in the array
		int minGrade = grades[0];

		for (int g4 : grades) {
			if (g4 < minGrade) {
				minGrade = g4;
			}
		}
		
		System.out.print("Min grade is: " + minGrade);
	}

}
