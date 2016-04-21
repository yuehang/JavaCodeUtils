import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.List;


public class SerializationTest {
	public static void main(String[] args)
	{
		Person person = new Person("张三",27);
		try
		{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:\\person.dat"));
			out.writeObject(person);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("对象初始化成功!");
		try
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("d:\\person.dat"));
			Person newPerson = (Person)in.readObject();
			System.out.println("name:"+newPerson.getName());
			System.out.println("age:"+newPerson.getAge());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}

class Person implements Serializable{
	private String name;
	private int age;
	public Person()
	{
		
	}
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
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
}
