import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {
      
		try(FileInputStream fis=new FileInputStream("text.txt");
				FileOutputStream fos=new FileOutputStream("textcopy.txt");) {
		
			int c=fis.read();
			while(c!=-1)
			{
			   fos.write(c);
			   c=fis.read();
			}
			System.out.println("file is copied");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
	

}
