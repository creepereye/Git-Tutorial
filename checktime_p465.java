import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class checktime_p465 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//InputStreamReader rd=null;
		FileWriter rw=null;
		FileReader rd=null;
		try{
			//rd=new InputStreamReader("C:\\Temp\\testing.txt");
			rw=new FileWriter("C:\\Temp\\testing.txt");
			String c="";
			while (!(c=sc.nextLine()).equals("")) {
				rw.write(c+"\r\n");
				
			}
			rw.close();
			rd=new FileReader("C:\\Temp\\testing.txt");
			int s=0;
			while ((s=rd.read())!=-1) {
				System.out.print((char)s);
				
			}
			rd.close();
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.print("오류발생");
		}
	}

}
