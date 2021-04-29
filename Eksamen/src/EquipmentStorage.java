import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EquipmentStorage {

    /*public EquipmentStorage(String filename) {this.fileName = fileName;}*/
    List<Ball> balls = new ArrayList<>();
    List<Racket> rackets = new ArrayList<>();

    public List<Ball> createBallObjects() {
        Ball ball1 = new Ball(12, "Locker 1", false, "Football", true);
        Ball ball2 = new Ball(15, "Locker 15", true, "Handball", true);
        Ball ball3 = new Ball(14, "Locker 2", true, "Handball", true);
        Ball ball4 = new Ball(1, "Locker 3", false, "Handball", false);
        Ball ball5 = new Ball(2, "Locker 3", false, "Handball", true);
        Ball ball6 = new Ball(12, "Locker 1", false, "Fotball", false);
        Ball ball7 = new Ball(3, "Locker 1", false, "Fotball", true);
        Ball ball8 = new Ball(5, "Locker 4", false, "Fotball", true);
        Ball ball9 = new Ball(6, "Locker 4", false, "Fotball", true);
        Ball ball10 = new Ball(20, "Locker 6", false, "Volleyball", false);
        Ball ball11 = new Ball(21, "Locker 6", false, "Volleyball", true);
        Ball ball12 = new Ball(31, "Locker 7", false, "Basketball", false);
        Ball ball13 = new Ball(32, "Locker 7", false, "Basketball", false);
        Ball ball14 = new Ball(33, "Locker 7", false, "Basketball", true);
        Ball ball15 = new Ball(34, "Locker 7", true, "Basketball", false);

        balls.add(ball1);
        balls.add(ball2);
        balls.add(ball3);
        balls.add(ball4);
        balls.add(ball5);
        balls.add(ball6);
        balls.add(ball7);
        balls.add(ball8);
        balls.add(ball9);
        balls.add(ball10);
        balls.add(ball11);
        balls.add(ball12);
        balls.add(ball13);
        balls.add(ball14);
        balls.add(ball15);

        return balls;
        }

        public List<Racket> createRacketObjects() {
            Racket racket1 = new Racket(16, "Locker 5", false, false);
            Racket racket2 = new Racket(17, "Locker 5", true, false);
            Racket racket3 = new Racket(18, "Locker 5", false, true);

            rackets.add(racket1);
            rackets.add(racket2);
            rackets.add(racket3);

            return rackets;
        }

        public void printBalls() {
            for (Ball b : balls) {
                System.out.println("ID: ");
                System.out.println(b.getId());
                System.out.println("Locker: ");
                System.out.println(b.getLocker());
                System.out.println("Replace: ");
                System.out.println(b.replaceBall());
                System.out.println("Type: ");
                System.out.println(b.getTypeBall());
                System.out.println("Maintenance");
                System.out.println(b.replaceBall());
                System.out.println("");
            }
        }

        public void printRackets() {
            for (Racket r : rackets) {
                System.out.println("ID: ");
                System.out.println(r.getId());
                System.out.println("Locker: ");
                System.out.println(r.getLocker());
                System.out.println("Needs to replace racket: ");
                System.out.println(r.replaceRacket());
                System.out.println("Needs to change coating: ");
                System.out.println(r.changeCoating());
                System.out.println("");
            }
        }
        public List<Ball> getBallList() {
            return balls;
        }

        public List<Racket> getRacketList() {
            return rackets;
        }

}



// Forsøk på å lese fra fil!!
/*    public void getEquipments() throws FileNotFoundException  {

        File equipmentFile = new File("equipment.txt");

        Scanner scanner = new Scanner (equipmentFile);
        scanner.useLocale(Locale.US);
        while(scanner.hasNextLine()) {
            String equipmentType = scanner.nextLine();
            System.out.println(equipmentType);
            switch (equipmentType){
                case "Ball" -> {
                    Ball ball = readBall(scanner);
                    balls.add(ball);
                }
                case "TableTennisRacket" -> {
                    Racket racket = readRacket(scanner);
                    rackets.add(racket);
                }
                default -> throw new RuntimeException("Unknown- cant find the type");
            }

        }
        scanner.close();
    }*/

 /*   private Ball readBall(Scanner scanner) {
        int id = readInt(scanner);
        System.out.println(id);

        String str1 = scanner.next();
        String str2 = scanner.next();
        String locker = str1+str2;
        String s = scanner.nextLine();
        System.out.println(locker);
        boolean replace = Boolean.parseBoolean(scanner.nextLine());
        *//*boolean replace = readBoolean(scanner);*//*
        System.out.println(replace);
        // FÅR IKKE LEST DEN - vet at det funket å lese string i locker variablen, men her går det ikke. Leser ikke scanner line by line?? H
        String type = readString(scanner);
        System.out.println(type);
        boolean maintenance = Boolean.parseBoolean(scanner.nextLine());
        System.out.println(maintenance);
        return new Ball(id, locker, replace, type, maintenance);
    }

    private Racket readRacket(Scanner scanner) {
        int id = readInt(scanner);
        String locker = readString(scanner);
        boolean replace = Boolean.parseBoolean(scanner.nextLine());
        boolean maintenance = Boolean.parseBoolean(scanner.nextLine());
        return new Racket(id, locker, replace, maintenance);
    }

    private int readInt(Scanner scanner) {
        int i = scanner.nextInt();
        scanner.nextLine();
        return i;
    }

    private boolean readBoolean(Scanner scanner) {
        boolean b = scanner.nextBoolean();
        scanner.nextLine();
        return b;
    }
    private String readString(Scanner scanner){
        String s = scanner.nextLine();
        scanner.nextLine();
        return s;
    }

*/






/*    static List<Ball> ballList = new ArrayList<Ball>();

    // Oppgave 1
    // Bruker scanner for å hente ut informasjon fra filen.

    public void ScanFile() throws FileNotFoundException {

        File equipmentFile = new File("equipment.txt");
        // Kjører filen gjennom scanneren


        Scanner scanner = new Scanner(equipmentFile);
        while (scanner.hasNextLine()) {
            String values = scanner.nextLine();
            *//*System.out.println(values);*//*
            if (values.equals("Ball")) {
                String equipment = values;
                System.out.println(equipment);
                int id = readInt(scanner);
                System.out.println(id);
                String locker = readString(scanner);
                System.out.println(locker);
                boolean replace = Boolean.parseBoolean(scanner.nextLine());
                System.out.println(replace);
                scanner.nextLine();
                String type = readString(scanner);
                System.out.println(type);
                boolean maintenance = Boolean.parseBoolean(scanner.nextLine());
                System.out.println(maintenance);
            }

            else {
                    System.out.println("DA FUCK");
            }

        }
    }


    private void addBall(Scanner scanner) {
        System.out.println("Equipment");
        String equipment = values;

    }

    private String readString(Scanner scanner){
        String s = scanner.nextLine();
        scanner.nextLine();
        return s;
    }

    private int readInt(Scanner scanner){
        int i = scanner.nextInt();
        scanner.nextLine();
        return i;
    }

    private boolean readBoolean(Scanner scanner){
        boolean b = scanner.nextBoolean();
        System.out.println("HEEEEY");
        scanner.nextLine();
        return b;
    }
}*/


      // public Ball(String equipment, int id, String locker, boolean replace, String type, boolean maintenance)


        // private Ball readBall(File scanner){
        //     String equipment = readString(scanner);
        //     int id = readInt(scanner);
        //     String locker = readString(scanner);
        //     boolean replace = readBoolean(scanner);
        //     String type = readString(scanner);
        //     boolean maintenance = readBoolean(scanner);
        //     return new Ball(equipment, id, locker, replace, type, maintenance);
        // }

        /*
        private Racket readRacket(File scanner){
            String equipment = readString(scanner);
            int id = readInt(scanner);
            String locker = readString(scanner);
            String type = readString(scanner);
            boolean replace = readBoolean(scanner);
            boolean maintenance = readBoolean(scanner);
            return new Racket(equipment, id, locker, type, replace, maintenance);
        }

        private String readString(Scanner scanner){
            String s = scanner.nextLine();
            scanner.nextLine();
            return s;
        }

        private int readInt(Scanner scanner){
            int i = scanner.nextInt();
            scanner.nextLine();
            return i;
        }

        private boolean readBoolean(Scanner scanner){
            boolean b = scanner.nextBoolean();
            scanner.nextLine();
            return b;
        }

*/

        /*
    public void getEquipment() throws FileNotFoundException {
        File equipmentData = new File("equipment.txt");
        try(Scanner scan = new Scanner(equipmentData)){
            scan.useLocale(Locale.US);
            if(scan.nextLine().equals("Ball")){
                readBall(equipmentData);
            }
            for (int i = 0; i < 7; i++){
                scan.nextLine();
            }
            if(scan.nextLine().equals("Racket")) {
                readRacket(equipmentData);
            }
            for (int i = 0; i < 10; i++){
                scan.nextLine();
            }
        }
    }



  @Override
    public Set<Equipment> retrieveEquipment() throws Exception {
        Set<Equipment> equipment = new HashSet<>();
        try(Scanner scanner = new Scanner(new File(data))){
            //fjern hvis du ikke finner double verider
            scanner.useLocale(Locale.US);
            while(scanner.hasNextLine()){
                String EquipmentType = scanner.nextLine();
                switch (EquipmentType){
                case "Ball" ->{
                    Ball ball = readBall(scanner);
                    equipment.add(ball);
                }
                case "Racket" -> {
                    Racket racket = readRacket(Scanner);
                    equipment.add(racket);
                }
                    default ->  throw new RuntimeException("Unknown equipment found!");
                }
            }
        }
        return equipment;
    }

    @Override
    public void storeEquipment(Set<Equipment> equipment) throws Exception {
        /*try(FileWriter fileWriter = new FileWriter(fileName)){
            for(Equipment e : equipment){
                if(e instanceof Ball){
                    writeBallToFile(fileWriter, (Ball) e);
                } else if(e instanceof Racket){
                    writeRacketToFile(FileWriter, (Racket) e);
                }
            }
        }
    }

    private void writeBallToFile(FileWriter fileWriter, Ball b) throws IOException {
        fileWriter.write(b.getEquipment()+"Ball"+"\n");
        fileWriter.write(b.getId()+"\n");
        fileWriter.write(b.getLocker()+"\n");
        fileWriter.write(b.getType()+"\n");
        fileWriter.write(b.isMaintenance()+"\n");
        fileWriter.write(b.isReplace()+"\n");
    }

    private void writeRacketToFile(FileWriter fileWriter, Racket r) throws IOException{
        fileWriter.write(r.getEquipment()+"Racket"+"\n");
        fileWriter.write(r.getId()+"\n");
        fileWriter.write(r.getLocker()+"\n");
        fileWriter.write(r.getType()+"\n");
        fileWriter.write(r.isMaintenance()+"\n");
        fileWriter.write(r.isReplace()+"\n");
    }


}

    @Override
    public void getShapes() throws FileNotFoundException {
        File equipment = new File("equipment.txt");
        try (Scanner scan = new Scanner(equipment)) {
            scan.useLocale(Locale.US);
        }
    }

*/

//     }
// }