
import java.util.Scanner;

public class StudentGradeAnalyzer {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("How many grades will you enter? ");

		int maxGradesLength = in.nextInt();

		int[] grades = new int[maxGradesLength];

		System.out.print("Please enter grades: ");

		for (int i = 0; i < maxGradesLength; i++) {

			grades[i] = in.nextInt();

		}
		
		System.out.println("\n-----------------------------------");

		System.out.print("Entered  grades are: ");

		for (int g : grades) {
			System.out.print(g + " ");
		}
		
		System.out.println();
		in.close();

		int sum = 0;

		for (int g2 : grades) {
			sum = sum + g2;
		}

		double average = sum / grades.length;

		System.out.printf("Average is: %.2f\n", average);

		if (average >= 50) {
			System.out.println("");
			System.out.print("Status: Student passed");
			
		} else {
			
			System.out.print("Status: Student fail");
			System.out.println("");
		}

		int maxGrade = grades[0];

		for (int g3 : grades) {

			if (g3 > maxGrade) {
				maxGrade = g3;
			}

		}
      
		System.out.print("Max grade is: " + maxGrade);
		System.out.println("");
		

		int minGrade = grades[0];

		for (int g4 : grades) {
			if (g4 < minGrade) {
				minGrade = g4;
			}
		}
		
		System.out.print("Min grade is: " + minGrade);
	}

}
