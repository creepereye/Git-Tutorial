import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filewrite2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		FileWriter fr=new FileWriter("C:\\Temp\\test.txt");
		String str="";
		while (!(str=sc.nextLine()).equals("")) {
			fr.write(str+"\r\n");
		}
		fr.close();
		sc.close();
	}

}
