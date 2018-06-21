public class FillInQuestion extends Question
{
    public FillInQuestion(String toSet)
    {
        String temp = "";
        boolean bracket = false;

        for(int i = 0; i < toSet.length(); i++)
        {
            if(bracket)
            {
                if(toSet.charAt(i) == '_')
                {
                    bracket = false;
                }
                else
                {
                    temp = temp + toSet.charAt(i);
                }
            }
            else
            {
                if(toSet.charAt(i) == '_')
                {bracket = true;}
            }
        }

        toSet = toSet.replaceAll(temp, "______");
        setText(toSet);
        setAnswer(temp);
    }
}