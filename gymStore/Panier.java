
import java.util.HashMap;
import java.util.Map;

public class Panier {
    // Attributs
    private Map<Article, Integer> items;  
    private double priceTotal;

    // Constructeur
    public Panier() {
        this.items = new HashMap<>();
        this.priceTotal = 0.0;
    }

    // Getters et Setters
    public Map<Article, Integer> getItems() {
        return items;
    }

    public double getPriceTotal() {
        return priceTotal;
    }

    // Méthodes

    // Ajouter une quantité d'article  
    public void increaseQt(Article article, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("La quantité à ajouter doit être positive.");
        }

        // Ajouter ou mettre à jour l'article dans le panier
        items.put(article, items.getOrDefault(article, 0) + quantity);
        updatePriceTotal();
    }

    // Réduire la quantité d'un article dans le panier
    public void decreaseQt(Article article, int quantity) {
        if (!items.containsKey(article)) {
            throw new IllegalArgumentException("L'article n'est pas dans le panier.");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("La quantité à réduire doit être positive.");
        }

        int currentQuantity = items.get(article);
        if (currentQuantity <= quantity) {
            items.remove(article);  //si 0 supprimer larticle
        } else {
            items.put(article, currentQuantity - quantity);
        }
        updatePriceTotal();
    }

    // Supprimer un article du panier
    public void removeItem(Article article) {
        if (items.containsKey(article)) {
            items.remove(article);
            updatePriceTotal();
        }
    }

    // Calculer le prix total
    private void updatePriceTotal() {
        priceTotal = 0.0;
        for (Map.Entry<Article, Integer> entry : items.entrySet()) {
            Article article = entry.getKey();
            int quantity = entry.getValue();
            priceTotal += article.getPriceArt() * quantity;
        }
    }

    // Calculer et retourner le prix total 
    public double prixTotal() {
        updatePriceTotal();
        return priceTotal;
    }

    // Valider l achat et vider le panier
    public void checkOut() {
        if (items.isEmpty()) {
            throw new IllegalStateException("Le panier est vide.");
        }

        System.out.println("Merci pour votre achat !");
        for (Map.Entry<Article, Integer> entry : items.entrySet()) {
            Article article = entry.getKey();
            int quantity = entry.getValue();
            article.removeStock(quantity); // Déduire le stock
        }

        // Vider le panier après validation
        items.clear();
        priceTotal = 0.0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Panier:\n");
        for (Map.Entry<Article, Integer> entry : items.entrySet()) {
            sb.append("Article: ").append(entry.getKey().getNameArt())
              .append(", Quantité: ").append(entry.getValue())
              .append(", Prix unitaire: ").append(entry.getKey().getPriceArt())
              .append("\n");
        }
        sb.append("Prix total: ").append(priceTotal).append("€");
        return sb.toString();
    }
}
