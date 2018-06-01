import java.util.ArrayList;

public class SuperParkingBoy extends ParkingBoy{
    public SuperParkingBoy(int id) {
        super(id);
    }

    @Override
    protected String parkCar(ParkingLotSystem parkingLotSystem, String carNum){
        ParkingLot pkl=getMostAvaliableRateParkingLot(parkingLotSystem.getPkls());
        if(pkl==null) {
            return "Failed. ParkingLot are full.";
        }else {
            Car car=new Car(carNum);
            pkl.addAcarInParkingLot(car);
            parkedCar.add(car);
            return "Success. Car parked in ParkingLot"+pkl.getParkingLotNum();
        }
    }

    private ParkingLot getMostAvaliableRateParkingLot(ArrayList<ParkingLot> pkls){
        double mostAvailableRate=0;
        ParkingLot mostAvailablePkl=null;
        for(ParkingLot pkl:pkls){
            if(pkl.getAvailableParkingSpaceRate()>mostAvailableRate){
                mostAvailableRate=pkl.getAvailableParkingSpaceRate();
                mostAvailablePkl=pkl;
            }
        }
        return mostAvailablePkl;
    }


}
