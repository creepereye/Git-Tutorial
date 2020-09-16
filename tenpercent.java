
import java.io.*;

public class file_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f1=new File("a.jpg");
			File f2=new File("b.jpg");
			System.out.println(f1.getName()+"를 "+f2.getName()+"로 복사합니다.");
			System.out.println("10%마다 *을 출력합니다.");
			BufferedInputStream bf=new BufferedInputStream(new FileInputStream(f1));
			BufferedOutputStream fo=new BufferedOutputStream(new FileOutputStream(f2));
			int i;
			byte[] buf=new byte[(int) (f1.length()/10)];
			while (true) {
				i=bf.read(buf);
				fo.write(buf);
				if(i<buf.length)
					break;
				System.out.print("*");
			}
			System.out.println("복사 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
