import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("From main");
        EquipmentStorage equipments = new EquipmentStorage();
        equipments.createObjects();
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