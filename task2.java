import java.util.*;

public class task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); ;
    System.out.println("Enter the number of subjects: ");
    int num_subject = sc.nextInt();
    int total_marks = 0;
    for(int i=1; i<= num_subject; i++)
    {
        System.out.println("enter marks in "+i+" subject");
        int marks = sc.nextInt();
        total_marks = total_marks+ marks;
    }
    double avg_percent = (double)total_marks/num_subject;
    System.out.println("\nTotal marks obtained: "+total_marks);
    System.out.println("Average marks: "+avg_percent+ "%");
    char grade = calgrade(avg_percent);
    System.out.println("Grade "+grade);
    }
    public static char calgrade(double averagePercentage) {
        char grade;
        if (averagePercentage >= 90) {
        	grade = 'A';
        }
        else if (averagePercentage >= 80) {
        	grade = 'B';
        }
        else if (averagePercentage >= 70) {
            grade = 'C';
        }
        else if (averagePercentage >= 60) {
        	grade = 'D';
        }
        else if (averagePercentage >= 50) {
        	grade = 'E';
        }
        else {
        	grade = 'F';
        }
        return grade;
        }
}