
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
			System.out.println("������ �����ּ���");
			String title=sc.next();
			System.out.println(" �ڹٴ� 1��,C++�� 2��,���̽��� 3���� �����ּ���");
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
			while (!(code=sc.nextLine()).equals("�׸�")) {
				FW.write(code+"\r\n");
			}
			FW.close();
			sc.close();
			File root=new File("C:\\edu\\Git-Tutorial");
			System.out.println("cd "+root.getPath());
			System.out.println("git add "+title);
			System.out.println("git commit -m \"[Add Text File "+title+"]\"");
			System.out.println("git push");
			System.out.println("��");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
