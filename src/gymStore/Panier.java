
public class Panier{
    // Attributs
    private double priceTotal;


    // Constructeur
    public Panier() {
        this.priceTotal = 0.0;
    }

    // Getters et Setters
    
    public void setPriceTotal(double pr) {
        this.priceTotal = pr;
    }
    public double getPriceTotal() {
        return priceTotal;
    }

    // Méthodes

    // Ajouter une quantité d'article
    public void increaseQt(Article article, int quantity) {

    }
    // Réduire la quantité d'un article dans le panier
    public void decreaseQt(Article article, int quantity) {
        
    }
    // Supprimer un article du panier
    public void removeItem(Article article) {
        
    }
    // Calculer le prix total
    private void updatePriceTotal() {
        
    }
    // Calculer et retourner le prix total
    public double prixTotal() {
        updatePriceTotal();
        return priceTotal;
    }
    // Valider l achat et vider le panier
    public void checkOut() {
        
    }
}
