package anagrams;

import java.util.Scanner;

/**
 * TODO Explain what this class does here
 * Challenge Idea from www.hackerrank.com/challenges/java-anagrams/.
 * 
 * @author (your name)
 */
public class AnagramChecker {

	/**
	 * Check to see if two strings are anagrams. Ignore capitalization.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
    static boolean isAnagram(String a, String b) {
		// TODO
    	return false;
    }

    /**
     * Tests class
     */
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter string 1");
        String a = scan.next();
        System.out.println("Please enter string 2");
        String b = scan.next();
        scan.close();
        boolean result = isAnagram(a, b);
        System.out.println( (result) ? "Anagrams" : "Not Anagrams" );
        
        // TODO Work in a group to write code to test your solution
    }
}