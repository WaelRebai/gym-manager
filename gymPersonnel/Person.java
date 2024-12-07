
public class Person {
	private String id;
	private String name;
	private String phoneNb;
	private String email;
	
	//constructor
	public Person(String id, String name, String phoneNb, String email)
	{
		this.id = id;
		this.name = name;
		this.phoneNb = phoneNb;
		this.email = email;
	}
	
	//getters
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNb() {
		return phoneNb;
	}
	public String getEmail() {
		return email;
	}
	
	
	//setters
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNb(String phoneNb) {
		this.phoneNb = phoneNb;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
