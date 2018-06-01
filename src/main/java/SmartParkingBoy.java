import java.util.ArrayList;

public class SmartParkingBoy extends ParkingBoy{
    public SmartParkingBoy(int id) {
        super(id);
    }

    @Override
    protected String parkCar(ParkingLotSystem parkingLotSystem,String carNum){
        ParkingLot pkl=getMostAvaliableParkingLot(parkingLotSystem.getPkls());
        if(pkl==null) {
            return "Failed. ParkingLot are full.";
        }else {
            Car car=new Car(carNum);
            pkl.addAcarInParkingLot(car);
            parkedCar.add(car);
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
