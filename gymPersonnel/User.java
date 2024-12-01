package Personnel;

public class User extends Person{
	private String username;
	private String password;
	
	//constructor
	public User(String name, String phoneNb, String email)
	{
		super(name, phoneNb, email);
		Membership membership = new Membership();
	}
	
	//Register
	public void Register(String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	
	//Login
	public boolean Login(String username, String password)
	{
		return this.username.equals(username)&& this.password.equals(password);
	}
	
	//getters
	public String getUsername()
	{
		return username;
	}
	public String getPassword()
	{
		return password;
	}
	
	//setters
	public void setUsername(String username)
	{
		this.username = username;
	}
	public void setPAssword(String password)
	{
		this.password = password;
	}




}
