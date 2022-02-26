
public class Student {

	int id;
	String name;
	String location;
	public Student(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public static void main(String[] args) {
		Student std = new Student(101, "Raghav", "Pune");
		//System.out.println(std.id +" "+std.name +" "+std.location);
		
		System.out.println(std);
		
		Student std1 = new Student(101, "Raghav");
		
		System.out.println(std1);
	}

	/*
	 * @Override public String toString() { return "id=" + id + ", name=" + name +
	 * ", location=" + location + ""; }
	 */
	
	@Override
	public String toString() {
		
		String rep  = id +" "+name +" "+location;
		
		return rep;
		
	}
	

	
	//Student@71dac704
	
	/*
	 * public String toString() { return getClass().getName() + "@" +
	 * Integer.toHexString(hashCode()); // Student @ 71dac704 }
	 */
	
	
	
	
}
