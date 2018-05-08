import java.util.Scanner;

public class VotingMachineTester
{
    public static void main(String[] args)
    {
        VotingMachine barrie = new VotingMachine();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the party you would like to vote for, by typing 'dem' or 'rep'. Type 'q' to quit");
        String vote = "";
        do
        {
            vote = in.next();
            barrie.addVote(vote);
        } while (!vote.equals("q"));

        System.out.println("There were " + barrie.getDemVotes() + " democrat votes, and " + barrie.getRepVotes() + " republican votes.");
        barrie.clearVotes();
        System.out.println("After resetting, there are " + barrie.getDemVotes() + " democrat votes, and " + barrie.getRepVotes() + " republican votes.");
    }
}