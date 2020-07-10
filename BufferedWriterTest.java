/**
 * 字符缓冲写入流测试代码
 */
import java.io.*;










public class BufferedWriterTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建一个缓冲字符写入流
		BufferedWriter bw = new BufferedWriter(new FileWriter("G:\\lmc\\note\\wenjianliu\\dami.txt"));
		//创建一个字符床s
		String s ="hello motuo";
		/*
		 * 将字符写入到缓冲流bw，
		 * 之后将bw关闭
		 */
		bw.write(s);
		bw.close();

	}

}
