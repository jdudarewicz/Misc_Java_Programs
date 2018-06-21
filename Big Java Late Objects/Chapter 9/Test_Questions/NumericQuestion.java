import java.util.*;

public class NumericQuestion extends Question
{
    private double numAnswer;

    public void setAnswer(double correctResponse)
    {
        numAnswer = correctResponse;
    }

    public boolean checkAnswer(String response)
    {
        double userAnswer = Double.parseDouble(response);
        if(numAnswer >= 0)
        {
            return (Math.abs(numAnswer) - userAnswer <= 0.01 && Math.abs(numAnswer) - userAnswer >= -0.01);
        }
        else
        {
            return (Math.abs(numAnswer) + userAnswer <= 0.01 && Math.abs(numAnswer) + userAnswer >= -0.01);
        }
    }
}