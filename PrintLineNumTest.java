import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class PrintLineNumTest {

	/**
	 * 程序实现的功能，用于将接受的字节流转换成字符流
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建一个缓冲字符流的实例对象br
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//创建一个字符输入流接受数据
		PrintWriter pw = new PrintWriter("G:\\lmc\\note\\wenjianliu\\dsa.txt");
		
		//定义一个字符串str，初始化为null
		String  str = null;
		//定义一个计数器·用来计算行号
		int counter = 1;
		//当输入的字符为byte时退出
		while(!(str=br.readLine()).equals("byte"))
		{
			System.out.println(counter+":"+str);
			counter++;
			
		}
		pw.close();
		

	}

}
