import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("From main");
        EquipmentStorage equipments = new EquipmentStorage();
        equipments.createObjects();
        List<Ball> ballList = equipments.getBallList();
        List<Racket> racketList = equipments.getRacketList();
        Oppgave3 oppgave3 = new Oppgave3();
        oppgave3.printBallsNeedingMoreAir(ballList);
        /*equipments.getEquipments();*/
        System.out.println("Main finished");
    }
}




/* EquipmentStorage storage = new EquipmentStorage("equipment.txt");
        try{
            var result = storage.getEquipment();
        }
        catch (Exception e){
            e.printStackTrace();
        }*/