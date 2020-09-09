
package git_up;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class git_up_main {
	public static FileWriter FW=null;
	public static File store_root=null;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		try {
			String code;
			System.out.println("제목을 적어주세요");
			String title=sc.next();
			System.out.println(" 자바는 1번,C++은 2번,파이썬은 3번을 눌러주세요");
			choice=sc.nextInt();
			if(choice==1)
			{
				store_root=new File("C:\\edu\\Git-Tutorial\\"+title+".java");
				title+=".java";
			}
			else if (choice==2) {
				store_root=new File("C:\\edu\\Git-Tutorial\\"+title+".cpp");
				title+=".cpp";
			}
			else {
				store_root=new File("C:\\edu\\Git-Tutorial\\"+title+".py");
				title+=".py";
			}
			FW=new FileWriter(store_root);
			while (!(code=sc.nextLine()).equals("그만")) {
				FW.write(code+"\r\n");
			}
			FW.close();
			sc.close();
			File root=new File("C:\\edu\\Git-Tutorial");
			System.out.println("cd "+root.getPath());
			System.out.println("git add "+title);
			System.out.println("git commit -m \"[Add Text File "+title+"]\"");
			System.out.println("git push");
			System.out.println("끝");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
