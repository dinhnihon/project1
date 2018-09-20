import java.io.*;

public class FileOutputStream00 {
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("./D/JaVaII/Lesson06/src/FileInputStream00.java");
			FileOutputStream fos = new FileOutputStream("FileOutputStream00.bak");
			
			int data;
			
			fos.write("// Bakup file \n".getBytes());
			while((data = fis.read()) != -1){
				System.out.print((char)data);
				fos.write((char)data);
			}
			fos.close();
			fis.close();
		}catch (IOException e){
			System.out.println(e);
		}
	}
}
