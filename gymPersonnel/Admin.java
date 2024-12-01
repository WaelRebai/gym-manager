package Personnel;

public class Admin extends Person{
	private String username;
	private String password;
	
	//constructor
	public Admin(String name, String phoneNb, String email, String username, String password)
	{
		super(name, phoneNb, email);
		this.username = username;
		this.password = password;
	}
	
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
