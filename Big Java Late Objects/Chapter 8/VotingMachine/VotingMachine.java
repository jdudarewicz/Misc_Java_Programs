public class VotingMachine
{
    private int demVotes;
    private int repVotes;
    
    public VotingMachine()
    {
        demVotes = 0;
        repVotes = 0;
    }

    public void addVote(String a)
    {
        if(a.equals("dem"))
            {
                demVotes++;   
            }
        else if(a.equals("rep"))
            {
                repVotes++;
            }
        else
            {
                System.out.println("Invalid Vote.");
            }
    }
    public void clearVotes()
    {
        demVotes = 0;
        repVotes = 0;
    }

    public int getRepVotes()
    {
        return repVotes;
    }
    public int getDemVotes()
    {
        return demVotes;
    }
}