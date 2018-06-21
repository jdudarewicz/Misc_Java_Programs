import java.util.*;

public class StringReverse{
    public static void main(String[] args){

        String s = "who is it";
        String reversed = "";
        Scanner in = new Scanner(s);
        Stack<String> stack = new Stack<String>();

        while(in.hasNext()){
            stack.push(in.next());
        }

        while(!stack.empty()){
            reversed = reversed + " " + stack.pop();
        }

        reversed = reversed.trim();

        System.out.println(s);
        System.out.println(reversed);
    }
}