
import java.io.*;
import java.util.Scanner;

public class P486_ {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			BufferedInputStream f=null;
			BufferedInputStream f_=null;
			BufferedOutputStream new_file;
			try
			{
				String name1=sc.nextLine();
				String name2=sc.nextLine();
				
				new_file=new BufferedOutputStream(new FileOutputStream("qwe.txt"));
				f=new BufferedInputStream(new FileInputStream(name1),1024);
				f_=new BufferedInputStream(new FileInputStream(name2),1024);
				
				solve(f, new_file);
				solve(f_, new_file);
				
				System.out.println("완료");
				new_file.close();
				f.close();
				f_.close();
			}
			catch (IOException e) {
				// TODO: handle exception
				System.out.println("파일 오류");
			}
		
	}
	public static void solve(BufferedInputStream f,BufferedOutputStream new_file) throws IOException
	{
		int c;
		while ((c=f.read())!=-1) {
			new_file.write((char)c);
		}
	}
}
