package Personnel;

public class Membership {
		private String id;
		private String type;
		private double price;
		private double discount;
		
		public Membership()
		{
			
		}
		
		public Membership(String id, String type, double price, double discount) {
			this.id = id;
			this.type = type;
			this.price = price;
			this.discount = discount;
			
		}
		
		//getters
		public String getId()
		{
			return id;
		}
		public String getType()
		{
			return type;
		}
		public double getPrice()
		{
			return price;
		}
		public double getDiscount()
		{
			return discount;
		}
		
		//setters
		public void setId(String id) {
			this.id = id;
		}
		public void setType(String type) {
			this.type = type;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public void setDiscount(double discount) {
			this.discount = discount;
		}
		
		//upgrade 
		public void Upgrade() 
		{
			
		}
		//downgrade
		public void Downgrade()
		{
			
		}
		
		public void getPaymentHistory()
		{
			
		}

}
