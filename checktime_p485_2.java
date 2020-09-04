import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class checktime_p485_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			FileWriter IR=new FileWriter("C:\\Temp\\phone.txt");
			String str="";
			while (true) 
			{
				System.out.print("이름 전화번호 >>>>>>  ");
				if(!(str=sc.nextLine()).equals("그만"))IR.write(str+"\r\n");
				else break;
			}
			IR.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print("입출력 문제 발생!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		
	}

}
