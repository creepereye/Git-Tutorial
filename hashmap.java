
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new FileReader("C:\\Temp\\phone.txt"));
		String name="";
		String number="";
		boolean on=false;
		HashMap<String,String> map1 = new HashMap<String,String>();
		try {
			int c = 0;
			while(sc.hasNext())
			{
				name=sc.next();
				number=sc.next();
				map1.put(name, number);
				System.out.println(name+number);
			}
			System.out.println("총 "+map1.size()+"개의 전화번호를 읽었습니다");
			System.out.print("이름>> ");
			//name=new Scanner(System.in);
			System.out.println(map1.get("김기태"));
			sc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
