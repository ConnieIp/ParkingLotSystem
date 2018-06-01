public class ParkingManager{
    public ParkingManager() {

    }

    public String parkCar(ParkingLotSystem parkingLotSystem,String carNum){
        for(ParkingLot pkl:parkingLotSystem.getPkls()){
            if(pkl.getParkingLotNum()==1){
                pkl.addAcarInParkingLot(new Car(carNum));
                return "Success. Car parked in ParkingLot"+pkl.getParkingLotNum();
            }
        }
        return "Failed. ParkingLot not exists.";
    }

    public String parkCarByParkingBoy(ParkingLotSystem parkingLotSystem,String parkingType,String carNum){
        if(parkingType.equals("Normal")){
            NormalParkingBoy normalParkingBoy=new NormalParkingBoy();
            return normalParkingBoy.parkCar(parkingLotSystem,carNum);
        }else if(parkingType.equals("Smart")){
            SmartParkingBoy smartParkingBoy=new SmartParkingBoy();
            return smartParkingBoy.parkCar(parkingLotSystem,carNum);
        }else if(parkingType.equals("Super")){
            SuperParkingBoy superParkingBoy=new SuperParkingBoy();
            return superParkingBoy.parkCar(parkingLotSystem,carNum);
        }
        return "";
    }

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
