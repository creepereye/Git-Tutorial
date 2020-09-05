import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class toupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileReader fr=null;
		File f=new File("C:\\Temp\\toup.txt");
		try {
			fr=new FileReader(f);
			int c;
			while ((c=fr.read())!=-1) {
				char s=Character.toUpperCase((char)c);
				System.out.print(s);
				
			}
		}
			catch (IOException e) {
				System.out.println("입출력오류");
			}
	}

}
