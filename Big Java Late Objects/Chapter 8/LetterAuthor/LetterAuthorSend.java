public class LetterAuthorSend
{
    public static void main(String[] args)
    {
        String from = "Someone";
        String to = "Someone";
        LetterAuthor letter = new LetterAuthor(from, to);
        
        letter.addLine("For one moment");
        letter.addLine("I wish you'd hold your stage");
        letter.addLine("With no feelings at all");
        letter.addLine("Open-minded");
        letter.addLine("I'm sure I used to be so free"); // Muse, Citizens Erased lyrics

        System.out.println(letter.getText());
    }
}