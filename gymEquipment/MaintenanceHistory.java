import java.time.LocalDate;

public class MaintenanceHistory {
    private int idMain;
    private LocalDate dateMain;
    private double costMain;
    private LocalDate nextMain;

    public MaintenanceHistory(int idMain, LocalDate dateMain, double costMain, LocalDate nextMain) {
        this.idMain = idMain;
        this.dateMain = dateMain;
        this.costMain = costMain;
        this.nextMain = nextMain;
    }

    public int getIdMain() {
        return idMain;
    }

    public void setIdMain(int idMain) {
        this.idMain = idMain;
    }

    public LocalDate getDateMain() {
        return dateMain;
    }

    public void setDateMain(LocalDate dateMain) {
        this.dateMain = dateMain;
    }

    public double getCostMain() {
        return costMain;
    }

    public void setCostMain(double costMain) {
        this.costMain = costMain;
    }

    public LocalDate getNextMain() {
        return nextMain;
    }

    public void setNextMain(LocalDate nextMain) {
        this.nextMain = nextMain;
    }

    // Methods
    public void addDateMaintenance(LocalDate date) {
        this.dateMain = date;
    }

    public void changeDateMaintenance(LocalDate date) {
        this.dateMain = date;
    }

    public void removeDateMaintenance() {
        this.dateMain = null;
    }

    public void calculNextMain(int monthsToAdd) {
        if (this.dateMain != null) {
            this.nextMain = this.dateMain.plusMonths(monthsToAdd);
        }
    }
}
