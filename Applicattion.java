package Practice2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Applicattion {

	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		String a=sc.nextLine();

		try {
		File  a1= new File("myfile.txt");
		Scanner sc1;
	
			sc1 = new Scanner(a1);
		while(sc1.hasNextLine()) {
			String b=sc1.nextLine();
			System.out.println(b);
		}
		sc1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("FIle not found");
		//e.printStackTrace();
			
		}
			Fileutils Ins = new Fileutils();
			try {
				System.out.println(Ins.Sub(20));
			} catch (Exception e1) {
				//System.out.println("Exception/Error");
		      e1.printStackTrace();
			}

	}
	}

