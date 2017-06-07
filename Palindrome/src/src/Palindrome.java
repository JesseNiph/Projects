package src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Jesse
 *This program checks if a word taken in  from a file is a palindrome both recursively and non recursively
 */


public class Palindrome
{
	

	/**
	 * Constructor used to run the palindrome checks
	 */
	 public Palindrome(){
		 
          
	

	
	try {
		BufferedReader br= new BufferedReader (new FileReader ("Words.txt"));
		
		String line;
		try{
		while ((line =br.readLine() )!=null){
			
			if(palRecursive(line, 0, line.length()-1)==true)
			{
				System.out.println(line);
			}
			
		System.out.println(isPal(line));
		
		
		
		}
		}
		catch(IOException e){
			
		}
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
		
		
		
	
		
	}}



		public static boolean isPal(String line){
			/**
			 * method used to check if a word is a palindrome(non recursively)
			 * @param i String that is the word being tested
			 * @param line ~ word being read in
			 * @return boolean
			 */
			
		
		int length = line.length();

		for (int i = 0; i <= length / 2; i++) {
		    
		    if (line.charAt(i) != line.charAt(length - 1 - i)) 
		    	return false;
		}

		
		return true;
		
		
	
		
			}
		
		public static boolean palRecursive(String a, int b, int c)
		{
			/**
			 * method that recursively checks if a word is a palindrome
			 *@param a ~ The string being tested
			 *@param b ~ Int used to start the test
			 *@param c ~ Int being used to end the test
			 *@return boolean
			 */
		
			if (b >= c)
			{
			return true; 
			}
			
			else if (a.charAt(b) == a.charAt(c))
			{
			
			return true && palRecursive(a, ++b, --c);
			}
			

			
			return false;
			
		}

			
		
		
	

	public static void main(String[] args)
	{
		/**
		 * The main used to run the program
		 */
	 new Palindrome();
		
	}
}

	



