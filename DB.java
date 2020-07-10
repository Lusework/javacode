import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class DB {

	/**
	 * @param args
	 */
	private ObjectInputStream in;
	private ObjectOutputStream out;
	
	DB() throws FileNotFoundException, IOException
	{
		out = new ObjectOutputStream(new FileOutputStream("G:\\lmc\\note\\wenjianliu\\lmc.txt"));
		in = new ObjectInputStream(new FileInputStream("G:\\lmc\\note\\wenjianliu\\lmc.txt"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per = new Person(1,"tom",21);

	}
	

}
	class Person implements Serializable
	{
		private int id;
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
