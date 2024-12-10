public class Equipment {
    private String nomEq;
    private int idEq;
    private Maintenance maintenance;
    enum Maintenance {Required, NotRequired};
    private Availability availability;
    enum Availability {Available, Unavailable};


    public Equipment(String nomEq, int idEq, Maintenance maintenance, Availability availability) {
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

    public Maintenance getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability newAvailability) {
        this.availability = newAvailability;
    }
    public void changeEquipment(String name, Availability availability) {
        this.nomEq = name;
        this.availability = availability;
    }

    public void searchById(int id) {
        // Logic to search equipment by ID (backend interaction)
    }

}
