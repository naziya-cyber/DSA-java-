package StdGrade;
import java.util.Scanner;

public class StdGrade {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);

    // Array to store marks for 5 subjects
        double[] marks = new double[5];
        String[] subjects = {"Math", "Science", "English", "History", "Computer Science"};
        
        System.out.println("===== STUDENT GRADE CALCULATOR =====\n");
        
        // Input marks for each subject using a loop
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + " (0-100): ");
            marks[i] = scanner.nextDouble();
            
            // Validate input
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid! Enter marks between 0-100: ");
                marks[i] = scanner.nextDouble();
            }
        }
        
        // Calculate total marks
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        
        // Calculate average
        double average = total / marks.length;
        
        // Determine grade using conditional statements
        char grade;
        String remarks;
        if (average >= 90) {
            grade = 'A';
            remarks = "Outstanding!";
        } else if (average >= 80) {
            grade = 'B';
            remarks = "Excellent!";
        } else if (average >= 70) {
            grade = 'C';
            remarks = "Good!";
        } else if (average >= 60) {
            grade = 'D';
            remarks = "Satisfactory";
        } else {
            grade = 'F';
            remarks = "Needs Improvement";
        }
        // Display result summary
        System.out.println("\n===== RESULT SUMMARY =====");
        System.out.println("\nSubject-wise Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-20s: %.2f\n", subjects[i], marks[i]);
        }
        System.out.println("\n--------------------------");
        System.out.printf("Total Marks      : %.2f / %.2f\n", total, marks.length * 100.0);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade            : " + grade);
        System.out.println("Remarks          : " + remarks);
        System.out.println("--------------------------");
        scanner.close();
    }
}
