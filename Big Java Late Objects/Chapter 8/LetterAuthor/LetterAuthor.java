public class LetterAuthor
{
    private String letter;
    private String author;
    private String recipient;

    public LetterAuthor(String from, String to)
    {
        author = from;
        recipient = to;
        letter = "Dear " + to + "\n \n"; 
    }

    public LetterAuthor()
    {
        author = "REDACTED";
        recipient = "REDACTED";
        letter = "Dear " + author + "\n" + "\n";
    }

    public void addLine(String line)
    {
        letter = letter + line + "\n";
    }

    public String getText()
    {
        letter = letter + "\n" + "Scincerely, \n \n" + author;
        return letter;
    }
}