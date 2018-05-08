import java.util.*;

public class TestScoreTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = in.next();
        in.nextLine();
        TestScores student = new TestScores(name);
        
        System.out.println("Enter student's quiz scores. Type 'q' to stop");
        while(in.hasNextInt())
        {
            student.addScore(in.nextInt());
        }

        System.out.println("Student " + student.getName() + " has a total test score of " + student.getTotalScore() + " and a average score of " + student.getAverageScore() + ", taking " + student.getNumberOfQuizzes() + " quizzes.");

        student.removeScore(99);

        System.out.println("Student " + student.getName() + " has a total test score of " + student.getTotalScore() + " and a average score of " + student.getAverageScore() + ", taking " + student.getNumberOfQuizzes() + " quizzes.");
    }
}