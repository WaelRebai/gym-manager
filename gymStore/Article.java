public class Article {
    private int idArt;
    private String nameArt;
    private String refArt;
    private int stockArt;
    private double priceArt;
//const
    public Article (int idArt , String nameArt , int stockArt , double priceArt) {
        this.idArt = idArt;
        this.nameArt = nameArt;
        this.refArt = generateRef();
        this.stockArt = stockArt;
        this.priceArt = priceArt;
    }
//getters setters
        public int getIdArt() {
            return idArt;
        }
        public void setIdArt(int idArt) {
            this.idArt = idArt;
            this.refArt = generateRef();
        }
        public String getNameArt() {
            return nameArt;
        }
        public void setNameArt(String nameArt) {
            this.nameArt = nameArt;
            this.refArt = generateRef();
        }
        public String getRefArt() {
            return refArt;
        }
        public void setRefArt(String refArt) {
            this.refArt = refArt;
        }
        public int getStockArt() {
            return stockArt;
            }
        public void setStockArt(int stockArt) {
                this.stockArt = stockArt;
            }
        public double getPriceArt() {
                return priceArt;
            }
        public void setPriceArt(double priceArt) {
                this.priceArt = priceArt;
            }
                   
        public void changeStock(int n){
            int newStock = this.stockArt + n;
            if (newStock < 0){
                //IllegalArgumentException est une exception qui est lancée lorsque la méthode est appelée avec un argument qui n'est pas valide
                throw new IllegalArgumentException("Stock ne peux pas etre negative !!!");
        }   
        this.stockArt = newStock;
    }
//methodes
    public void changePrice(double newPrice){
        setPriceArt(newPrice);
    }

    private String generateRef(){
        return nameArt + "_" + idArt;
    }
    
    public void addStock(int qt){
        if(qt > 0){
            this.stockArt += qt;
        }
        else{
            throw new IllegalArgumentException("Quantity to add must be positive");
       
        }

    }

    public void removeStock(int qt){
        if(qt > 0){
            this.stockArt -= qt;
        }  
        else {
            throw new IllegalArgumentException("Quantity to remove must be positive");
        }
    }

    public String tostring(){
        return "Article{" +
                "idArt='" + idArt + '\'' +
                ", nameArt='" + nameArt + '\'' +
                ", refArt='" + refArt + '\'' +
                ", stockArt=" + stockArt +
                ", priceArt=" + priceArt +
                '}';

    }

}

