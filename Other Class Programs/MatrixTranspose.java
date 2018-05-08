import java.util.*;

public class MatrixTranspose
{
    public static void main(String[] args)
    {
        int[][] matA = {{2,1,3},{9,8,7},{5,0,6}};
        int temp;

        for(int i = 0; i < matA.length; i++)
            {
                for(int j = 0; j < matA[i].length; j++)
                    {
                        System.out.print(matA[i][j] + " ");
                    }
                System.out.println();
            }
        
        for(int row = 0; row < matA.length; row++)
            {
                for(int col = 0; col < row; col++)
                    {
                    temp = matA[row][col];
                    matA[row][col] = matA[col][row];
                    matA[col][row] = temp;
                    }
            }
        for(int i = 0; i < matA.length; i++)
            {
                for(int j = 0; j < matA[i].length; j++)
                    {
                        System.out.print(matA[i][j] + " ");
                    }
                System.out.println();
            }
    }
}