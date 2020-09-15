import java.io.FileReader;
import java.io.IOException;

public class buffer_stream_move {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("C:\\windows\\system.ini");
			char []buf=new char[1024*2];
			while (true) {
				int n=fr.read(buf);
				System.out.println(buf);
				System.out.println(n);
				if(n<buf.length)
					break;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
