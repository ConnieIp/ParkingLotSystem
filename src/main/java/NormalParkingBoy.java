import java.util.ArrayList;

public class NormalParkingBoy extends ParkingBoy{
    public NormalParkingBoy(int id) {
        super(id);
    }

    @Override
    protected String parkCar(ParkingLotSystem parkingLotSystem,String carNum){
        for(ParkingLot pkl:parkingLotSystem.getPkls()){
            if(pkl.getParkingLotNum()==1){
                Car car=new Car(carNum);
                pkl.addAcarInParkingLot(car);
                parkedCar.add(car);
                return "Success. Car parked in ParkingLot"+pkl.getParkingLotNum();
            }
        }
        return "Failed. ParkingLot not exists.";
    }


}
