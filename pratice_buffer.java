
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		File root=new File("C:\\edu\\Git-Tutorial\\e.txt");
		try
		{
			int c;
			br=new BufferedReader(new InputStreamReader(new FileInputStream(root),"euc-kr"),50);
			while ((c=br.read())!=-1) {
				System.out.print((char)c);
				
			}
			br.close();
		}
		catch (Exception e) {
			System.out.println("오류");
		}
	}

}
