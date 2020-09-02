import java.io.FileOutputStream;

public class fileoutputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[]= {7,51,3,4-1,24};
		try {
			FileOutputStream fo=new FileOutputStream("C:\\Temp\\qwer.out");
			for(int i=0;i<b.length;i++)
				fo.write(b[i]);
				
			fo.close();
		}
		catch (Exception e) {
			System.out.print("asda");
			return;
		}
		System.out.print("¿Ï·á");
	}

}
