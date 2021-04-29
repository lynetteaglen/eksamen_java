import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EquipmentStorage {

    static List<Ball> ballList = new ArrayList<Ball>();

    // Oppgave 1
    // Bruker scanner for å hente ut informasjon fra filen.

    public void ScanFile() throws FileNotFoundException {

        File equipmentFile = new File("equipment.txt");
        // Kjører filen gjennom scanneren


        Scanner scanner = new Scanner(equipmentFile);
        while (scanner.hasNextLine()) {
            String values = scanner.nextLine();
            /*System.out.println(values);*/
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
        /*
        for (Ball ball : ballList) {
            System.out.println(ball.getId());
        }*/


    // private Ball readBall(File scanner){
    //     int id = readInt(scanner);
    //     String locker = readString(scanner);
    //     boolean replace = readBoolean(scanner);
    //     String type = readString(scanner);
    //     boolean maintenance = readBoolean(scanner);
    //     return new Ball(equipment, id, locker, replace, type, maintenance);
    // }

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

    // static void printBallList() {
    //     for (Ball ball : ballList) {
    //         System.out.println(ball.getId());
    //     }
    // }

}


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