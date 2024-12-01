public class Equipment {
    private String nomEq;
    private int idEq; 
    private String maintenance; 
    private String availability;

    public Equipment(String nomEq, int idEq, String maintenance, String availability) {
        this.nomEq = nomEq;
        this.idEq = idEq;
        this.maintenance = maintenance;
        this.availability = availability;
    }
    public String getNomEq() {
        return nomEq;
    }

    public void setNomEq(String nomEq) {
        this.nomEq = nomEq;
    }

    public int getIdEq() {
        return idEq;
    }

    public void setIdEq(int idEq) {
        this.idEq = idEq;
    }

    public String getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
    public void changeEquipment(String name, String availability) {
        this.nomEq = name;
        this.availability = availability;
    }

    public void searchById(int id) {
        // Logic to search equipment by ID (backend interaction)
    }
}
