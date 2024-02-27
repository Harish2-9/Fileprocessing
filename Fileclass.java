package File;

import java.io.*;

public class Fileclass {

	public static void main(String[] args) {
		File file = new File("myfile.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br= new BufferedReader(fr);
			String line= br.readLine();
			} catch (FileNotFoundException e) {
			
			System.out.println("File not found");
		} catch (IOException e) {
				
				e.printStackTrace();
			}
	}

}
