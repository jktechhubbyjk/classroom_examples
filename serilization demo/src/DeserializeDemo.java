import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fin = new FileInputStream("C:\\batch 2 files\\student.txt");
		
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		Student std = (Student)oin.readObject();
		
		System.out.println(std.id +" "+std.name+" "+std.location);
		
		
	}

}
