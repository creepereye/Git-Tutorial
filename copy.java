
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("C:\\windows\\system.ini");
		File f2=new File("C:\\temp\\system.txt");
		try
		{
			FileWriter fw=new FileWriter(f2);
			FileReader fr=new FileReader(f1);
			int c;
			while ((c=fr.read())!=-1) {// 아스키코드반환
				fw.write((char)c);
				
			}
			fw.close();
			fr.close();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
