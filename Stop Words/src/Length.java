import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Length {
	

	
 static List<String> wordsList = new ArrayList<String>();
	public Length() throws FileNotFoundException {
		 BufferedReader in = new BufferedReader(new FileReader("words.txt"));
	        String str;

	      
	        try {
				while((str = in.readLine()) != null){
				    wordsList.add(str);
				    //System.out.println("word added"+str);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	     

}
	
	


public static void main(String[] args) throws FileNotFoundException{
	new Length();
	Scanner scan = new Scanner(System.in);

    System.out.println("Please Enter the array spot you would like to check");
    int num = scan.nextInt(); 
    
     System.out.println("The word "+wordsList.get(num) + " is " +wordsList.get(num).length()+" characters long");
	
}
}