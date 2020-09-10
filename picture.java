
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class picture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream Fo=new FileOutputStream("C:\\temp\\test.jpg");
			FileInputStream Fi=new FileInputStream("D:\\JAVA\\a.jpg");
			File f=new File("C:\\temp\\test.jpg");
			f.mkdir();
			int c;
			while ((c=Fi.read())!=-1) {
				Fo.write((byte)c);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
