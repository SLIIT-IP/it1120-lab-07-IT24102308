import java.util.Scanner;

public class IT24102308Lab7Q1A {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //define variable
        double subject1, subject2, subject3, subject4,total, average;
        String grade;

        // Input 
        System.out.print("Enter marks for subject 1: ");
        subject1=input.nextDouble();

        System.out.print("Enter marks for subject 2: ");
        subject2=input.nextDouble();

        System.out.print("Enter marks for subject 3: ");
        subject3=input.nextDouble();

        System.out.print("Enter marks for subject 4: ");
        subject4=input.nextDouble();

        total=subject1+subject2+subject3+subject4;
        average=total/4;

        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println("Average is:"+average);
        System.out.println("Overall Grade is: " + grade);
    }
}