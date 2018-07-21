import java.io.*;
import java.util.*;

/**
 * This program finds the anagram of a word (or, all the combinations of real words that can be obtained from a word rearranged in any order or character size, preserving the original characters and their amounts) and prints them out 
*/
public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            
        System.out.print("Enter the word you would like unscrambled: ");
        String anagram = in.nextLine();
        
        //try catch incase FileNotFoundException thrown
        try {
            long startTime = System.currentTimeMillis(); //tracks runtime of parser function
            ArrayList<String> anagrams = parser(anagram);
            long totalTime = System.currentTimeMillis() - startTime; 
            System.out.println("Anagrams of " + anagram + " are: \n" + answerToString(anagrams) + "\nCompleted parse in " + Long.toString(totalTime) + " milli-seconds."); //Prints anagrams to console
        }
        catch(FileNotFoundException e) {
            System.out.println("words.txt is not contained within the same folder as this program");
        }
        finally {
            in.close(); //closes user input whether try completes or not
        }
    }

    /**
     * Helper function which assembles ArrayList of possible anagrams
     * @param s is the anagram you want to find
     * @return toReturn is the ArrayList of answers
     * throws FileNotFoundException if words.txt is missing from program directory
     */
    private static ArrayList<String> parser(String s) throws FileNotFoundException {
        ArrayList<String> toReturn = new ArrayList<String>();
        Scanner words = new Scanner(new File("words.txt"));
        Map<Character, Integer> sMap = mapper(new HashMap<Character, Integer>(), s);
        Map<Character, Integer> comparisonMap; //two maps for comparison, one of the anagram itself and another for any potential anagrams

        //loops through scanner of words.txt file
        while(words.hasNext()) {
            String nextWord = words.next();
            if(nextWord.length() <= s.length()) { //if the potential anagram is less or equal to the length in characters of the anagram 
                comparisonMap = mapper(new HashMap<Character, Integer>(), nextWord); //create comparison map 
                boolean anagramCheck = anagram(sMap, comparisonMap); //check if it is a true anagram

                if(anagramCheck) { //if so, add to toReturn array
                    toReturn.add(nextWord);
                }

                comparisonMap.clear(); //clear comparisonMap
            }
        }
        words.close(); //closes words scanner
        return toReturn;
    }

    /**
     * Helper function to map a string, with the keys being the character and the values being the character count of the keys
     * @param m is the map you want keys and values assigned to
     * @param s is the string you want to map
     * @return m the modified map
     */
    private static Map<Character,Integer> mapper(Map<Character, Integer> m, String s) {
        for(int i = 0; i < s.length(); i++) { //for the strings length
            if(m.containsKey(s.charAt(i))) { //if the map contains the key, increment value by one
                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
            }
            else { //else, create character key with a value of one
                m.put(s.charAt(i), 1);
            }
        }
        return m;
    }

     /**
     * Helper function to check if the potential anagram is actually an anagram of the original word
     * @param m1 is the map of the original word
     * @param m2 is the map of the potential anagram
     * @return isAnagram which is a boolean if it is an anagram or not
     */
    private static boolean anagram(Map<Character, Integer> m1, Map<Character, Integer> m2) {
        boolean isAnagram = true; //defaults to true

        for(Character c: m2.keySet()) { //for all characters in the m2 keySet
            if(!m1.containsKey(c)) { //if there is a value in the potential anagram that is not in the original word
                isAnagram = false; //isAnagram is false, breaks from loop
                break;
            }
            else if(m2.get(c) > m1.get(c)){ //if the potential anagram has a character with a higher count of occurences than the original word
                isAnagram = false; //isAnagram is false, breaks from loop
                break;
            }
        }
        return isAnagram;
    }

    /**
     * Helper function to turn the answer array into a string
     * @param a is the ArrayList of answers
     * @return toReturn , the string of the ArrayList formatted for readability
     */
    private static String answerToString(ArrayList<String> a) {
        String toReturn = "";
        for(String s: a) {
            toReturn += s + ", ";
        }
        return toReturn;
    }
}