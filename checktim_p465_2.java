import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class checktim_p465_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fo=new FileOutputStream("C:\\Temp\\testing.bat");
		FileInputStream fi=null;
		fo.write(3);
		fo.write(5);
		fo.close();
		int c;
		fi=new FileInputStream("C:\\Temp\\testing.bat");
		while ((c=fi.read())!=-1) {
			System.out.print(c+" ");
			
		}
	}

}
