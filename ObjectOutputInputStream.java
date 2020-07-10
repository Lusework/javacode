import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class ObjectOutputInputStream {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		write();
		read();
		
	}

		// TODO Auto-generated method stub
	
	
		
	
	static void write() throws FileNotFoundException, IOException
	{   //创建一个对象流的实例
		ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream("G:\\lmc\\note\\wenjianliu\\liu.txt"));
		Person per = new Person(1,"kit",25);
		ops.writeObject(per);
		
	}
	//创建一个对象输出流的实例
	static void read() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream oos = new ObjectInputStream(new FileInputStream("G:\\lmc\\note\\wenjianliu\\liu.txt"));
		Person per = (Person)oos.readObject();
		System.out.println(per);
	}
		
}

/*
 * 创建一个一个person类，并定义类的方法和属性
 * 
 */

class Person implements Serializable
{
	private  int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}

