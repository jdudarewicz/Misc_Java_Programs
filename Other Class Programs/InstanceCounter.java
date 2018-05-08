public class InstanceCounter
{
    public static void main(String[] args)
    {
        String[] string1 = {"Ryerson", "University", "Toronto"};
        String[] string2 = {"Ryerson", "High", "Toronto"};
        instanceCounter(string1, string2);
    }
    public static void instanceCounter(String[] instance1, String[] instance2)
    {
        int runningSum = 0;
        for(int i = 0; i < instance1.length; i++)
            {
                for(int j = 0; j < instance2.length; j++)
                    {
                        if(instance1[i].equals(instance2[j]))
                            {
                                runningSum++;
                            }
                    }
                System.out.println("The word " + instance1[i] + " occurs " + runningSum + " times in the second string.");
                runningSum = 0;
            }
    }
}