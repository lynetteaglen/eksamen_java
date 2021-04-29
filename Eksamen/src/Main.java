import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("From main");
        EquipmentStorage equipments = new EquipmentStorage();
        List<Ball> ballList = equipments.createBallObjects();
        List<Racket> racketList = equipments.createRacketObjects();
        equipments.printBalls();
        equipments.printRackets();
        Oppgave3 oppgave3 = new Oppgave3();
        oppgave3.printBallsNeedingMoreAir(ballList);
        oppgave3.printEquipmentNeedingToBeReplaced(ballList, racketList);
        oppgave3.printTableTennisRacketsNeedingNewPad(racketList);
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