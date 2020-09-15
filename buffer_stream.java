import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class buffer_stream {
	public static FileReader FR=null;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File root=new File("C:\\Temp\\test2.txt");
		try {
			FR=new FileReader(root);//버퍼가 5를 넘어가면 5까지 출력
			BufferedWriter BF=new BufferedWriter(new OutputStreamWriter(System.out,"utf-8"),5);//크기가 5인 버퍼를 만듬
			int c;
			while ((c=FR.read())!=-1) {
				BF.write((char)c);
				
			}//5까지만 버퍼를 출력
			//new Scanner(System.in).nextLine();//.엔터누르면 남아잇는 버퍼 모두출력 이제 이 Scanner 객체를 지정할수없음 일회용임 다시말해 닫을 수도없다는 의미 노란줄이 뜨는이유임
			//BF.flush();
			BF.close();
			FR.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// 오류메세지 출력
		}
	}

}
