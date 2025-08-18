import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of subjects: ");
        int num = sc.nextInt();

        int[] marks = new int[num];
        int totalMarks = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid! Please enter between 0 and 100.");
                i--; 
                continue;
            }

            totalMarks += marks[i];
        }

        double avgPercentage = (double) totalMarks / num;

        String grade;
        if (avgPercentage >= 90) {
            grade = "A+";
        } else if (avgPercentage >= 80) {
            grade = "A";
        } else if (avgPercentage >= 70) {
            grade = "B";
        } else if (avgPercentage >= 60) {
            grade = "C";
        } else if (avgPercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n========= RESULTS ===========");
        System.out.println("Total Marks: " + totalMarks + " / " + (num * 100));
        System.out.println("Average Percentage:  " + avgPercentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("=============================");

        sc.close();
    }
}

