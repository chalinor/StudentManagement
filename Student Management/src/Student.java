
public class Student {

	private String name;
	private String ID;
	private String email;
	private String course;
	
	public Student(String name, String iD, String email, String course) {
		super();
		this.name = name;
		ID = iD;
		this.email = email;
		this.course = course;
	}



	public Student(String name, String iD, String email) {
		super();
		this.name = name;
		ID = iD;
		this.email = email;
	}
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void display(){
		if (course != null){
			
			System.out.println("Student Name: "+name);
			System.out.println("Student ID: "+ID);
			System.out.println("email: "+email);
			System.out.println("Course: "+course);
		}
		else {
		System.out.println("Student Name: "+name);
		System.out.println("Student ID: "+ID);
		System.out.println("email: "+email);
		}
	}
	
}
