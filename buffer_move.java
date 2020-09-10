
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fast_move {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("D:\\파일\\test.png");
		File f2 =new File("C:\\Temp\\복사완료.jpg");
		byte buf[]=new byte[1024*10];
		try
		{
			FileOutputStream fo=new FileOutputStream(f2);
			FileInputStream fi=new FileInputStream(f1);
			int n=0;
			while (true) {
				n=fi.read(buf);
				fo.write(buf,0,n);
				if(n<buf.length)
					break;
			}
			fo.close();
			fi.close();
			System.out.println(f1.getPath()+ " 를 "+f2.getPath()+" 로복사하였습니다.");
		}
		catch (IOException e) {
			System.out.println("파일 복사오류");
		}
	}

}
