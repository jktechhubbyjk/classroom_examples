import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerilizationDemo{
	public static void main(String[] args) throws Exception {
		
		Student s1 = new Student("namdev", 118, "Aurangabad");
		
		FileOutputStream fout = new FileOutputStream("C:\\batch 2 files\\student.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		
		oos.writeObject(s1);
		
		oos.flush();
		System.out.println("success");
		
	}

}
