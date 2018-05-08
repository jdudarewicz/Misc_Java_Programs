public class DiagonalAdder
{
    public static void main(String[] args)
    {
        int[][] even = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] odd = {{1,2,3},{4,5,6},{7,8,9}};
        int evenResult = diagonalAdder(even);
        int oddResult = diagonalAdder(odd);

        System.out.println("Even sum: " + evenResult + ", odd sum: " + oddResult);
    }

    public static int diagonalAdder(int[][] a)
    {
        int sum = 0;

        int upDown = 0;
        for(int i = 0; i < a.length; i++)
            {
                sum = sum + a[i][upDown++];
            }
        int downUp = 0;
        for(int i = a.length - 1; i > -1; i--)
            {
                sum = sum + a[i][downUp++];
            }
        
        if(a.length % 2 == 0)
                return sum;
        else
                return sum - a[a.length / 2][a.length / 2];           
    }
}