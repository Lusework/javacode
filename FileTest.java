
import java.io.FileWriter;
import java.io.IOException;


public class FileTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建一个文件夹
		FileWriter f = new FileWriter("G:\\ lmc\\wenjian\\sdnh.txt");
		//向文件夹·里面添加字符
		String str = "春天花会开，鸟儿会回来";
		
		f.write(str);
		f.close();

	}

}
