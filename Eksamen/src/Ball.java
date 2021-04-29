public class Ball {

    String equipment;
    int id = 0;
    String locker;
    boolean replace;
    String type;
    boolean maintenance;

    public Ball(String equipment, int id, String locker, boolean replace, String type, boolean maintenance) {
        this.equipment = equipment;
        this.id = id;
        this.locker = locker;
        this.replace = replace;
        this.type = type;
        this.maintenance = maintenance;
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

    public boolean isReplace() {
        return replace;
    }

    public void setReplace(boolean replace) {
        this.replace = replace;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isMaintenance() {
        return maintenance;
    }

    public void setMaintenance(boolean maintenance) {
        this.maintenance = maintenance;
    }

    void printStates(){
        System.out.println("ID: " + " Locker: " + locker + " Replace: " + replace + "Type: " + type + " Maintenance: " + maintenance);
    }


}
