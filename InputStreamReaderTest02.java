import java.io.IOException;
import java.io.InputStreamReader;


public class InputStreamReaderTest02 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//字节输入流转换为字符输出流
		InputStreamReader ir = new InputStreamReader(System.in);
		
		int a ;
		while((a=ir.read())!=-1)
		{
			System.out.print((char)a);
		}

	}

}
