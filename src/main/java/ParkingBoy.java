import java.util.ArrayList;

public abstract class ParkingBoy {
    public ParkingBoy() {
    }

    protected abstract String parkCar(ParkingLotSystem parkingLotSystem,String carNum);

    public String pickCar(ParkingLotSystem parkingLotSystem, String carNum){
        for(ParkingLot pkl:parkingLotSystem.getPkls()){
            boolean pickup=pkl.getAcarInParkingLot(carNum);
            if(pickup) {
                return "Success. Car pickup in ParkingLot" + pkl.getParkingLotNum();
            }
        }
        return "Failed. Car not exists.";
    }

}
