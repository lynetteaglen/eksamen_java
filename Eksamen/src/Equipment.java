public abstract class Equipment {
    int id = 0;
    String locker;
    boolean replace;
    String type;
    boolean maintenance;

    public Equipment(int id, String locker) {
        this.id = id;
        this.locker = locker;
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


    class Ball extends Equipment {
        boolean replace_ball;
        String type_ball;
        boolean need_more_air;

        Ball (int id, String locker, boolean replace, String type, boolean maintenance) {
            super(id, locker);
            this.replace_ball = replace_ball;
            this.type_ball = type_ball;
            this.need_more_air = need_more_air;
        }

        public boolean replaceBall() {
            return replace_ball;
        }

        public void setReplaceBall(boolean replace) {
            this.replace_ball = replace;
        }

        public String getTypeBall() {
            return type_ball;
        }

        public void setTypeBall(String type) {
            this.type_ball = type;
        }

        public boolean needMoreAir() {
            return need_more_air;
        }

        public void setNeedMoreAir(boolean more) {
            this.need_more_air = more;
        }

        void printStates(){
            System.out.println("ID: " + id + " Locker: " + locker + " Replace: " + replace_ball + "Type: " + type_ball + " Maintenance: " + need_more_air);
        }

    }

    class Racket extends Equipment {
        boolean replace_racket;
        boolean change_coating;

        public Racket(int id, String locker, boolean replace_racket, boolean change_coating) {
            super(id, locker);
            this.replace_racket = replace_racket;
            this.change_coating = change_coating;
        }

        public boolean replaceRacket() {
            return replace_racket;
        }

        public void setReplaceRacket(boolean replace) {
            this.replace_racket = replace;
        }

        public boolean changeCoating() {
            return change_coating;
        }

        public void setChangeCoating(boolean change) {
            this.change_coating = change;
        }
    }
}