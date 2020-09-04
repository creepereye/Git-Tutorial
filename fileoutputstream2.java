import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class fileoutputstream2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fo = new FileOutputStream("C:\\Temp\\e.txt");
		int ch=0;
		while ((ch=System.in.read())!=13) //엔터를 받을떄가지 문자하나를 read()로 받아온다
			fo.write((char)ch);
		fo.close();
	}

}
