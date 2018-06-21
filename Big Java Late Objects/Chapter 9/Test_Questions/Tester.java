import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String response = "";

        Question q = new Question();
        q.setText("Who was the inventor of Java?");
        q.setAnswer("James Gosling");
        
        q.display();
        System.out.print("Your answer: ");
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));

        ChoiceQuestion first = new ChoiceQuestion();
        first.setText("What was the original name of the Java language?");
        first.addChoice("*7", false);
        first.addChoice("Duke", false);
        first.addChoice("Oak", true);
        first.addChoice("Gosling", false);

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);
        presentQuestion(first);
        presentQuestion(second);

        NumericQuestion third = new NumericQuestion();
        third.setText("What is 3/4 equivalent to?");
        third.setAnswer(0.75);

        third.display();
        System.out.print("Your answer: ");
        response = in.nextLine();
        System.out.println(third.checkAnswer(response));
        
        FillInQuestion fourth = new FillInQuestion("the answer to this is _trash_");
        
        fourth.display();
        System.out.println("Your answer: ");
        response = in.nextLine();
        System.out.println(fourth.checkAnswer(response));
    }

    public static void presentQuestion(ChoiceQuestion q)
    {
        q.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}