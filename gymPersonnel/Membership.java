

public class Membership {
		private String reference;
		private String type;
		private double price;
		private double discount;
		
		public Membership()
		{
			
		}
		
		public Membership(String reference, String type, double price, double discount) {
			this.reference = reference;
			this.type = type;
			this.price = price;
			this.discount = discount;
			
		}
		
		//getters
		public String getReference()
		{
			return reference;
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
		public void setReference(String reference) {
			this.reference = reference;
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
