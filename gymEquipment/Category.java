public class Category {
    private int idCat;
    private String nomCat;
    private int mainFreq;

    public Category(int idCat, String nomCat, int mainFreq) {
        this.idCat = idCat;
        this.nomCat = nomCat;
        this.mainFreq = mainFreq;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }
    public String getNomCat() {
        return nomCat;
    }

    public void setNomCat(String nomCat) {
        this.nomCat = nomCat;
    }

    public int getMainFreq() {
        return mainFreq;
    }

    public void setMAinFreq(int mainFreq) {
        this.mainFreq = mainFreq;
    }

    public void addEquipment() {
        // Logic to add equipment (backend interaction)
    }

    public void removeEquipment() {
        // Logic to remove equipment (backend interaction)
    }
}
