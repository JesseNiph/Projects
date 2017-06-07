package designer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class File {

	
	public void readString(){
	BufferedReader br = null;{
	 
	try {

		String sCurrentLine;

		br = new BufferedReader(new FileReader("c:\\lol.txt"));

		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		}

	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			if (br != null)br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}


	      
}	   
}
}