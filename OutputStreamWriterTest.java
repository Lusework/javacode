import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class OutputStreamWriterTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 字节输出流转换为字符输出流
		 */
		FileOutputStream fs = new FileOutputStream("G:\\lmc\\note\\wenjianliu\\asd.txt");
		OutputStreamWriter ow = new OutputStreamWriter(fs);
		//使用BufferedWriter读取ow里面的字符
		BufferedWriter bw = new BufferedWriter(ow);
		bw.write("dsdsadasda");
		bw.close();
	}

}
