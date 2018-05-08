public class TestScores
{
    private String name;
    private double quizScore;
    private int numberOfQuizzes;

    public TestScores()
    {
        name = "Unknown";
        quizScore = 0;
        numberOfQuizzes = 0;
    }

    public TestScores(String inputName)
    {
        name = inputName;
        quizScore = 0;
        numberOfQuizzes = 0;
    }

    public void addScore(int inputScore)
    {
        quizScore = quizScore + inputScore;
        numberOfQuizzes++;
    }

    public void removeScore(int inputScore)
    {
        if(quizScore >= inputScore)
            {
                quizScore = quizScore - inputScore;

                numberOfQuizzes--;
            }
        else
            {
                System.out.println("You cannot subtract the quiz score to a negative value");
            }
    }

    public String getName()
    {
        return name;
    }

    public double getTotalScore()
    {
        return quizScore;
    }

    public double getAverageScore()
    {
        return quizScore/numberOfQuizzes;
    }
    
    public double getNumberOfQuizzes()
    {
        return numberOfQuizzes;
    }
}