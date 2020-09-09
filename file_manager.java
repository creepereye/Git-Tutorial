
import java.io.File;
import java.util.Scanner;

public class manager {
	public static Scanner sc=new Scanner(System.in);
	public static void list(File file)
	{
		System.out.println("-----"+file.getPath()+" 의 서브 리스트입니다 -----");
		File list[]=file.listFiles();
		for(int i=0;i<list.length;i++)
		{
			File f=list[i];
			long t=list[i].lastModified();
			System.out.print(f.getName()+"\t");
			System.out.print(f.isFile()?"파일\t":"다이렉터리\t");
			System.out.print("크기:"+f.length()+" 바이트\t");
			System.out.printf("수정한시간 %tb %td %ta %tT\n",t,t,t,t);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("C:\\edu\\Git-Tutorial");
		System.out.println(f1.getPath()+", "+f1.getParent()+", "+f1.getName());
		String res="";
		if(f1.isFile()) 
		{
			res="파일";
		}
		else{
			res="다이렉터리";
		}
		System.out.println(f1.getPath()+" 는 "+res+" 입니다");
		
		String title=sc.next();
		File f2=new File("C:\\edu\\Git-Tutorial\\"+title);
		if(!f2.exists())
		{
			f2.mkdir();
		}
		list(new File(f1.getPath()));
		f2.renameTo(new File("C:\\edu\\Git-Tutorial\\"+title+" 변경"));
		list(new File(f1.getPath()));
		System.out.println(f2);
	}

}
