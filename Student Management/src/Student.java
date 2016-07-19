
public class Student {

	private String name;
	private String ID;
	private String email;
	
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
		System.out.println("Student Name: "+name);
		System.out.println("Student ID: "+ID);
		System.out.println("email: "+email);
	}
}
