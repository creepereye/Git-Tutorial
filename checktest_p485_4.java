import java.io.*;
import java.util.*;

public class checktest_p485_4 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try
		{
			Scanner sc= new Scanner(new FileReader("C:\\Windows\\system.ini"));
			int line=1;
			while (sc.hasNext()) {
				System.out.printf("%4d : %s\n",line++,sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("입출력 오류 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}

}
