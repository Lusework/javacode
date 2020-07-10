import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomAccessFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		try {
			
			
			write();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			
			read();
			
			
		} catch (IOException e) {
				
			System.err.println(e.getMessage());
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	//创建一个文件写入方法
	static void write() throws FileNotFoundException
	{   //创建一个随机访问文件，该文件是可以读写的
		RandomAccessFile rf = new RandomAccessFile("G:\\lmc\\note\\wenjianliu\\demonm.txt","rw");
		
		try {
			//向里面写入int型的数据10
			rf.writeInt(10);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			//向里面写入boolean型的数据true
			rf.writeBoolean(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			//向该文件写入一个字符类型的数据a
			rf.writeChar('a');
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//
			rf.writeUTF("hello");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	static void read() throws IOException
	{
		RandomAccessFile rf = new RandomAccessFile("G:\\lmc\\note\\wenjianliu\\demonm.txt","rw");
		
		System.out.println(rf.readInt());
		System.out.println(rf.readBoolean());
		
		
		
		rf.skipBytes(2);
		
		
		
		System.out.println(rf.readUTF());
	}
	
	
}
