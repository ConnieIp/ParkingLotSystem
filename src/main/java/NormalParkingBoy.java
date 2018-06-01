import java.util.ArrayList;

public class NormalParkingBoy extends ParkingBoy{
    public NormalParkingBoy() {
        super();
    }

    @Override
    protected String parkCar(ParkingLotSystem parkingLotSystem,String carNum){
        for(ParkingLot pkl:parkingLotSystem.getPkls()){
            if(pkl.getParkingLotNum()==1){
                pkl.addAcarInParkingLot(new Car(carNum));
                return "Success. Car parked in ParkingLot"+pkl.getParkingLotNum();
            }
        }
        return "Failed. ParkingLot not exists.";
    }


}
