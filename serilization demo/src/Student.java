import java.io.Serializable;

public class Student implements Serializable{
	String name;
	int id;
	transient String location;
	
	public Student(String name, int id, String location) {
		this.name = name;
		this.id = id;
		this.location = location;
	}
	
	

}
