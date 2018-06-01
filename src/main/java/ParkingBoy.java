import java.util.ArrayList;

public class ParkingBoy {

    private String type;

    public ParkingBoy(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void parkCar(ArrayList<ParkingLot> pkls, String carNum){
        ParkingLotSystem parkingLotSystem=new ParkingLotSystem();
        if(type.equals("Normal")){
            parkCarWithPklNum(pkls,1,carNum);
        }else if(type.equals("Smart")){
            parkCarInPklWithMostAvailableSpace(pkls,carNum);
        }else if(type.equals("Super")){

        }else{

        }
    }

    public String parkCarWithPklNum(ArrayList<ParkingLot> pkls,int pklNum, String carNum){
        for(ParkingLot pkl:pkls){
            if(pkl.getParkingLotNum()==pklNum){
                pkl.addAcarInParkingLot(new Car(carNum));
                return "Success. Car parked in ParkingLot"+pkl.getParkingLotNum();
            }
        }
        return "Failed. ParkingLot not exists.";
    }

    public String parkCarInPklWithMostAvailableSpace(ArrayList<ParkingLot> pkls,String carNum){
        ParkingLot pkl=getMostAvaliableParkingLot(pkls);
        if(pkl==null) {
            return "Failed. ParkingLot are full.";
        }else {
            pkl.addAcarInParkingLot(new Car(carNum));
            return "Success. Car parked in ParkingLot"+pkl.getParkingLotNum();
        }
    }

    public ParkingLot getMostAvaliableParkingLot(ArrayList<ParkingLot> pkls){
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

    public ParkingLot getMostAvaliableRateParkingLot(ArrayList<ParkingLot> pkls){
        int mostAvailableRate=0;
        ParkingLot mostAvailablePkl=null;
        for(ParkingLot pkl:pkls){
            if(pkl.getAvailableParkingSpace()>mostAvailable){
                mostAvailable=pkl.getAvailableParkingSpace();
                mostAvailablePkl=pkl;
            }
        }
        return mostAvailablePkl;
    }

    public String pickCar(ArrayList<ParkingLot> pkls,int pklNum,String carNum){
        for(ParkingLot pkl:pkls){
            if(pkl.getParkingLotNum()==pklNum){
                boolean pickup=pkl.getAcarInParkingLot(carNum);
                if(pickup) {
                    return "Success. Car pickup in ParkingLot" + pkl.getParkingLotNum();
                }else{
                    return "Failed. Car not exists.";
                }
            }
        }
        return "Failed. ParkingLot not exists.";
    }
}
