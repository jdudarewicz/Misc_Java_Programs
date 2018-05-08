import java.util.*;

import com.sun.javafx.sg.prism.NGRectangle;

public class ReturnEvenArray
{
    public static void main(String[] args)
    {
        int[] a1 = {12,342,55,4243,574,112,0,9};

        System.out.println(Arrays.toString(evenArray(a1)));
    }

    public static int[] evenArray(int[] originalArray)
    {
        int counter = 0;

        for(int i = 0; i < originalArray.length; i++)
            {
                if(originalArray[i]%2 == 0)
                    {
                        counter++;
                    }
            }
        
        int[] newArray = new int[counter];
        int newArrayLocation = 0;
        for(int i = 0; i < originalArray.length; i++)
            {
                if(originalArray[i]%2 == 0)
                    {
                        newArray[newArrayLocation++] = originalArray[i];
                    }
            }
        return newArray;
    }
}