import javax.swing.*;
import java.util.*;
import java.io.*;

public class ParenthesesChecker{
    public static void main(String[] args){
    
    try{
        boolean balanced = checkParentheses("ParenthesesChecker.java");
        if(balanced)
            System.out.println("balanced");
        else
            System.out.println("unbalanced");
    }
    catch (FileNotFoundException e){
        System.out.println("File not found");
    }
    }

    public static boolean checkParentheses(String filename) throws FileNotFoundException{
        Scanner in = new Scanner(new File(filename));
        Boolean toReturn = false;
        Stack<Character> parentheses = new Stack<Character>();

        while(in.hasNextLine())
        {
            String word = in.nextLine();

            for(int i = 0; i < word.length(); i++){
                if(word.charAt(i) == '{')
                    parentheses.push(word.charAt(i));
                if(word.charAt(i) == '}')
                    {
                        if(parentheses.empty())
                            return false;
                        else
                            parentheses.pop();
                    }
            }
        }

        return parentheses.empty();
    }
}