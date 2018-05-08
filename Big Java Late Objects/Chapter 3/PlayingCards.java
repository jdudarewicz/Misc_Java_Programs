import java.util.Scanner;

public class PlayingCards
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a playing card in shorthand notation: ");
        String userPlayingCard = in.next();
        String identifier = userPlayingCard.substring(0,1);
        String club = userPlayingCard.substring(1,2);

        if (identifier.equals("A"))
            identifier = "Ace";
        else if (identifier.equals("J"))
            identifier = "Jack";
        else if (identifier.equals("Q"))
            identifier = "Queen";
        else if (identifier.equals("K"))
            identifier = "King";
        //Don't know how to deal with 10 here?
            else if (identifier.equals("2") || identifier.equals("3") || identifier.equals("4") || identifier.equals("5") || identifier.equals("6") || identifier.equals("7") || identifier.equals("8") || identifier.equals("9") || identifier.equals("10"))
            identifier = identifier;
        else 
        {
            System.out.println("Not a valid identifier");
            identifier = "NA";
        }

        if (club.equals("D"))
            club = "Diamonds";
        else if (club.equals("H"))
            club = "Hearts";
        else if (club.equals("S"))
            club = "Spades";
        else if (club.equals("C"))
            club = "Clubs";
        else 
        {
            System.out.println("Not a valid club");
            club = "NA";
        }
        
        if ((identifier.equals("NA") || club.equals("NA")) == false)
            System.out.println(identifier + " of " + club);
    }
}