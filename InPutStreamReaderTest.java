import java.io.*;








public class InPutStreamReaderTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//创建一个字节流转换为字符流的实例对象ir
		InputStreamReader ir = new InputStreamReader(new FileInputStream("G:\\lmc\\note\\wenjianliu\\dami.txt"));
		//定义一个int变量a
		int a;
		//使用while循环读取ir里面的数据，
		while((a=ir.read())!=-1)
			//将读取出来的数据，强制转换为char类型输出
		{
			System.out.print((char)a);
		}
	}

}
