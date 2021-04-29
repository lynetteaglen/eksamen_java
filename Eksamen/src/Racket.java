public class Racket {

    String equipment;
    int id = 0;
    String locker;
    boolean replace;
    boolean maintenance;

    public Racket(String equipment, int id, String locker, boolean replace, boolean maintenance) {
        this.equipment = equipment;
        this.id = id;
        this.locker = locker;
        this.replace = replace;
        this.maintenance = maintenance;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocker() {
        return locker;
    }

    public void setLocker(String locker) {
        this.locker = locker;
    }

    public boolean isMaintenance() {
        return maintenance;
    }

    public void setMaintenance(boolean maintenance) {
        this.maintenance = maintenance;
    }

    public boolean isReplace() {
        return replace;
    }

    public void setReplace(boolean replace) {
        this.replace = replace;
    }
}
