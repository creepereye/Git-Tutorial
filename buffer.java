
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class buffer_stream {
	public static FileReader FR=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File root=new File("C:\\Temp\\test2.txt");
		try {
			FR=new FileReader(root);//���۰� 5�� �Ѿ�� 5���� ���
			BufferedWriter BF=new BufferedWriter(new OutputStreamWriter(System.out,"utf-8"),5);//ũ�Ⱑ 5�� ���۸� ����
			int c;
			while ((c=FR.read())!=-1) {
				BF.write((char)c);
				
			}//5������ ���۸� ���
			//new Scanner(System.in).nextLine();//.���ʹ����� �����մ� ���� ������ ���� �� Scanner ��ü�� �����Ҽ����� ��ȸ���� �ٽø��� ���� �������ٴ� �ǹ� ������� �ߴ�������
			//BF.flush();
			BF.close();
			FR.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// �����޼��� ���
		}
	}

}
