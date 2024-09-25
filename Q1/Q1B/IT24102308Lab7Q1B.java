import java.util.Scanner;

public class IT24102308Lab7Q1B { 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define variables
        double subject1, subject2, subject3, subject4, total, average;
        String grade;
        double totalmarks=0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("student " + i +":");
            for(int j = 1; j <= 4; j++) {
                System.out.print("Enter marks for subject " + j+":" );
                int marks =input.nextInt();
                totalmarks+=marks;
             }
            average = totalmarks / 4;
            System.out.println("Marks " +totalmarks/4 );
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Overall Grade is:"+grade);
            System.out.println();
        }
        input.close();
    }
}
