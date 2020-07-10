import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class DataInputOutputStreamTest {

	/**
	 * @创建一个数据输入与读写的代码示例
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//定义读写属性
		write();
		read();

	}
	//创建一个写的方法
	static void write() throws FileNotFoundException
	/*
	 * 创建一个文件，用来存储写入的数据，
	 * 
	 */
	
		{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("G:\\lmc\\note\\wenjianliu\\homhmi.txt"));
		try {
			dos.writeInt(20);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dos.writeByte(2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dos.writeBoolean(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dos.writeUTF("hello123");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//创建一个读的方法
	static void read() throws FileNotFoundException
	/*
	 * 从指定的文件读出数据
	 */

	{
		DataInputStream acd = new DataInputStream(new FileInputStream("G:\\lmc\\note\\wenjianliu\\homhmi.txt"));
		try {
			System.out.println(acd.readInt());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(acd.readByte());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(acd.readBoolean());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(acd.readUTF());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			acd.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
