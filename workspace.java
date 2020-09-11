
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class P486 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			FileInputStream f=null;
			FileInputStream f_=null;;
			try
			{
				String name1=sc.nextLine();
				String name2=sc.nextLine();
				
				f=new FileInputStream(name1);
				f_=new FileInputStream(name2);
				
				System.out.println(compare(f, f_)?"파일이 같습니다":"파일이 다릅니다");
				
				f.close();
				f_.close();
			}
			catch (IOException e) {
				// TODO: handle exception
				System.out.println("파일 오류");
			}
		
	}
	public static boolean compare(FileInputStream f,FileInputStream f_) throws IOException
	{
		byte buf[]=new byte[1024];
		byte buf_[]=new byte[1024];
		
		while (true) {
			
			
			int x=f.read(buf,0,buf.length);
			int y=f_.read(buf_,0,buf_.length);
			
			
			if(x!=y)
			{
				return false;
			}
			
			
			if(x==-1)
				break;
			
			
			for(int i=0;i<buf.length;i++)
			{
				if(buf[i]!=buf_[i])
				{
					return false;
				}
			}
			
			
		}
		return true;
	}
}
