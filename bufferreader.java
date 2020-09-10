
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class other_buffer_move {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		BufferedReader br=null;
		try
		{
			br=new BufferedReader(new FileReader("C:\\windows\\system.ini"),1024*10);
			int c;
			while((c=br.read())!=-1)
			{
				System.out.print((char)c);
			}
			br.close();
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("오류");
		}
		long end = System.currentTimeMillis();

		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
	}
}
