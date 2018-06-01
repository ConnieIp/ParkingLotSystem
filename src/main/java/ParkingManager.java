import java.util.ArrayList;

public class ParkingManager{

    public ArrayList<Car> parkedCar;
    public ParkingManager() {
        parkedCar=new ArrayList<Car>();
    }

    public String parkCar(ParkingLotSystem parkingLotSystem,String carNum){
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

    public String parkCarByParkingBoy(ParkingLotSystem parkingLotSystem,ParkingBoy parkingBoy,String carNum){
            return parkingBoy.parkCar(parkingLotSystem,carNum);
    }


}
