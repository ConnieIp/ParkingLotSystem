import java.util.ArrayList;

public class SmartParkingBoy extends ParkingBoy{
    public SmartParkingBoy() {
        super();
    }

    @Override
    protected String parkCar(ParkingLotSystem parkingLotSystem,String carNum){
        ParkingLot pkl=getMostAvaliableParkingLot(parkingLotSystem.getPkls());
        if(pkl==null) {
            return "Failed. ParkingLot are full.";
        }else {
            pkl.addAcarInParkingLot(new Car(carNum));
            return "Success. Car parked in ParkingLot"+pkl.getParkingLotNum();
        }
    }

    private ParkingLot getMostAvaliableParkingLot(ArrayList<ParkingLot> pkls){
        int mostAvailable=0;
        ParkingLot mostAvailablePkl=null;
        for(ParkingLot pkl:pkls){
            if(pkl.getAvailableParkingSpace()>mostAvailable){
                mostAvailable=pkl.getAvailableParkingSpace();
                mostAvailablePkl=pkl;
            }
        }
        return mostAvailablePkl;
    }


}
