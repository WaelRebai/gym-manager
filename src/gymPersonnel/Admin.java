package src.gymPersonnel;
public class Admin extends Person{
	
	
	//constructor
	public Admin(String username, String password, String phoneNb, String email)
	{
		super( username, password, phoneNb, email);

	}
	
	public boolean Login(String username, String password)
	{
		return username.equals(username)&& password.equals(password);
	}
	
}
