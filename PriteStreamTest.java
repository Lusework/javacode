import java.io.FileNotFoundException;
import java.io.PrintStream;



public class PriteStreamTest {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//创建一个打印输出流对象ps
		PrintStream ps = new PrintStream("G:\\lmc\\note\\wenjianliu\\qwe.txt");
		System.setOut(ps);
		//利用for循环取出里面的字符
		int num=0;
		for(int i=0;i<65535;i++)
		{
			System.out.print((char)i);
			num++;
			//当一行有一百个字符时进行换行
			if(num==100)
			{
				num=0;
				System.out.println();
				
			}
		}
	}

}
