import javax.swing.*;
import java.util.*;
import java.io.*;

public class CountryPopAverage
{
    public static void main(String[] args)
    {
        String filename = JOptionPane.showInputDialog("Enter correctly formatted filename");
        
        try{
            fileParser(filename);
        }
        catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "file not found", "FileNotFoundException", JOptionPane.PLAIN_MESSAGE);
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, e, "IOException", JOptionPane.PLAIN_MESSAGE);
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "File format incorrect", "NumberFormatException", JOptionPane.PLAIN_MESSAGE);
        }
        catch (NoSuchElementException e)
        {
            JOptionPane.showMessageDialog(null, "File format incorrect", "NoSuchElementException", JOptionPane.PLAIN_MESSAGE);
        }
        catch (NullPointerException e)
        {
            System.out.println("Window closed by user");
        }
        System.exit(0);
    }

    public static int countryCounter(String filename) throws IOException
    {
        Scanner in = new Scanner(new File(filename));
        int number = 0;

        while(in.hasNextLine())
        {
            if(in.nextLine().length() > 0)
            {
                number++;
            }
        }

        return number;
    }

    public static void fileParser(String filename) throws IOException
    {
        Scanner in = new Scanner(new File(filename));
        String countryList = "";
        int populationTotal = 0;

        while(in.hasNextLine())
        {
            String nextLine = in.nextLine();

            if(nextLine.length() > 0)
            {
                int i = 0;
                while(i < nextLine.length() && !Character.isDigit(nextLine.charAt(i))) {i++;}

                String country = nextLine.substring(0,i);
                int population = Integer.parseInt(nextLine.substring(i).trim());

                countryList = countryList + country.trim() + ", ";
                populationTotal = populationTotal + population;
            }
            else break;
        }

        int numberOfCountries = countryCounter(filename);

        double countryAverage = populationTotal / numberOfCountries;

        JOptionPane.showMessageDialog(null, "The countries " + countryList + "have a population average of " + countryAverage, "Result", JOptionPane.PLAIN_MESSAGE);
    }
}