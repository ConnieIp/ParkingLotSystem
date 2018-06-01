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

    public String parkCarWithPklNum(int pklNum, String carNum){
        for(ParkingLot pkl:pkls){
            if(pkl.getParkingLotNum()==pklNum){
                pkl.addAcarInParkingLot(new Car(carNum));
                return "Success. Car parked in ParkingLot"+pklNum;
            }
        }
        return "Failed. ParkingLot not exists.";
    }

    public void parkCarInPklWithMostAvailableSpace(String carNum){


    }

    public ParkingLot getMostAvaliableParkingLot(){
        int mostAvailable=0;
        for(ParkingLot pkl:pkls){
            if(pkl.getAvailableParkingSpace()>mostAvailable){
                mostAvailable=pkl.getAvailableParkingSpace();
            }
        }
        return null;
    }


}
