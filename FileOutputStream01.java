import java.io.*;

public class FileOutputStream01 {

	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("Comment.java");
			try{
				FileOutputStream fos = new FileOutputStream("Comment.bak");
			//Comment
				try{
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
			}catch (FileNotFoundException e){
				System.out.println(e);
			}catch (IOException e){
				System.out.println(e);
			}
		
		}catch (FileNotFoundException e){
			System.out.println(e);
		}catch (IOException e){
			System.out.println(e);
		}
		

	}

}
