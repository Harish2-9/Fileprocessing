package Filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {	
	File file = new File("myfile.txt");
	try {
		Scanner sc;
		sc= new Scanner(file);
		while(sc.hasNextLine()) {
			String b=sc.nextLine();
			System.out.println(b);
		}
	} catch (FileNotFoundException e) {	
		System.out.println("File is not here");
	}
	
	}

}
