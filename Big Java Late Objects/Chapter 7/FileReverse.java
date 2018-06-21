import java.util.*;
import java.io.*;

public class FileReverse
{
    public static void main(String[] args)
    {
        boolean done = false;

        while(!done){
            try{
                Scanner in = new Scanner(System.in);
                System.out.print("Enter the name of the text file you wish to reverse: ");
                String filename = in.next();

                Scanner file = new Scanner(new File(filename));

                String toWrite = "";

                while(file.hasNextLine()){
                    String line = file.nextLine();
                    String lineReversed = "";
                    for(int i = 0; i < line.length(); i++){
                        lineReversed = line.charAt(i) + lineReversed;
                    }
                    toWrite = toWrite + lineReversed + "\r\n";
                }

                PrintWriter pw = new PrintWriter(filename);
                pw.print(toWrite);
                pw.close();

                done = true;
            }
            catch (FileNotFoundException e){
                System.out.println("File not found");
            }
        }
    }
}