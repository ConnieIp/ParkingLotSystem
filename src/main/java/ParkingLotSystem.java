import java.util.ArrayList;

public class ParkingLotSystem {

    ArrayList<ParkingLot> pkls=new ArrayList<ParkingLot>();

    public ParkingLotSystem() {
        ParkingLot pkl1=new ParkingLot(1);
        ParkingLot pkl2=new ParkingLot(2);
        ParkingLot pkl3=new ParkingLot(3);
        pkls.add(pkl1);
        pkls.add(pkl2);
        pkls.add(pkl3);

    }
    public ParkingLotSystem(ArrayList<ParkingLot> pkls) {
        this.pkls=pkls;
    }

    public ArrayList<ParkingLot> getPkls() {
        return pkls;
    }
}
