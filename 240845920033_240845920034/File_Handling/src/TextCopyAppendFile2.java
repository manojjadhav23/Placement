import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TextCopyAppendFile2 {
	
	try( FileInputStream fis=new FileInputStream("test1.txt");
			FileOutputStream fos=new FileOutputStream("textcopy.txt"); )
			{
			
			int c=fis.read();
			while(c!=-1) {
				fos.write(c);
				c=fis.read();
			}
			}catch(FileNotFoundException e) {
				System.out.println(e.getMessage());
			

}
}
