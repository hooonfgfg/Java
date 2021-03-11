package ch06.exam17;

public class User {
	//Field
	private String id;
	private String name;
	private String password;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;
	private boolean adult;
	
	//Method
	public void setAdult(boolean adult) {
		this.adult=adult;
	}
	
	public boolean isAdult() {
		return adult;
	}
	
}
