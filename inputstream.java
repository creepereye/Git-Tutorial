import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin=null;
		InputStreamReader in=null;
		try {
			int c;
			fin=new FileInputStream("C:\\Temp\\test.txt");
			in=new InputStreamReader(fin,"MS949");
			System.out.println(in.getEncoding());
			while ((c=in.read())!=-1) {
				
				System.out.print((char)c);
			}
			fin.close();
			in.close();
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.print("¿À·ù³µÀ½!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		}
	}

}
