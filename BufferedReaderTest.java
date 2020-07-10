import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建一个缓冲字符读取流
		BufferedReader br = new BufferedReader(new FileReader("G:\\lmc\\note\\wenjianliu\\dami.txt"));
		//创建一个字符串变量s，赋值为空
		String s = null;
		/*
		 * 利用while循环，将里面的数值按行读取出来
		 */
		try {
			while((s =br.readLine())!=null)
			{
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//关闭打开的字符流
		br.close();

	}

}
