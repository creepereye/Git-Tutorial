import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWrite1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		FileWriter fw=null;
		int c=0;
		try {
			fw=new FileWriter("C:\\Temp\\test.txt");
			while (true) {
				String line=sc.nextLine();
				if(line.length()==0)
				{
					break;
				}
				fw.write(line,0,line.length());
				fw.write("\r\n",0,2);
			}
			fw.close();
		}
			catch (IOException e) {
				// TODO: handle exception
				System.out.print("문제발생!");
			}
		}
	}
