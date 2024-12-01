public class Category {
    private String nomCat;
    private int idCat;

    public Category(String nomCat, int idCat) {
        this.nomCat = nomCat;
        this.idCat = idCat;
    }
    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }
    public void addEquipment() {
        // Logic to add equipment (backend interaction)
    }

    public void removeEquipment() {
        // Logic to remove equipment (backend interaction)
    }
}
