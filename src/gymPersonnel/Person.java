package src.gymPersonnel;
public class Person {
	private String username;
	private String password;
	private String phoneNb;
	private String email;
	private Role role;
	enum Role {Co, Us};

	//constructor
	public Person(String username, String password, String phoneNb, String email)
	{
		this.username = username;
		this.password = password;
		this.phoneNb = phoneNb;
		this.email = email;
	}


	
	//getters
	public String getPhoneNb() {
		return phoneNb;
	}
	public String getEmail() {
		return email;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	

	//setters
	public void setPhoneNb(String phoneNb) {
		this.phoneNb = phoneNb;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}

	
	//enum setter & getter
	public Role  getRole() {
		return role;
	}
	public void setRole(Role newRole) {
		this.role = newRole;
	}
}
