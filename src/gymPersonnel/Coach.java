package src.gymPersonnel;
public class Coach extends Person{
	private double salaire;
	
	//constructor
	public Coach(String username, String password, String phoneNb, String email, double salaire)
	{
		super(username, password, phoneNb, email);
		this.salaire = salaire;
	}
	
	public boolean Login(String username, String password)
	{
		return username.equals(username)&& password.equals(password);
	}

	//getter
	public double getSalaire(){
		return salaire;
	}
	//setter
	public void setSalaire(double salaire){
		this.salaire = salaire;
	}
	
}
