import java.util.ArrayList;

public class ParkingLot {
    private int parkingLotNum;
    private int totalParkingSpace;
    private int availableParkingSpace;
    private ArrayList<Car> cars;

    public ParkingLot(int parkingLotNum) {
        this.parkingLotNum = parkingLotNum;
        this.totalParkingSpace = 20;
        this.availableParkingSpace = 20;
        this.cars=new ArrayList<Car>();
    }

    public ParkingLot(int parkingLotNum,int totalParkingSpace,int availableParkingSpace,ArrayList<Car> cars) {
        this.parkingLotNum = parkingLotNum;
        this.totalParkingSpace = totalParkingSpace;
        this.availableParkingSpace = availableParkingSpace;
        this.cars=cars;
    }

    public int getParkingLotNum() {
        return parkingLotNum;
    }

    public int getTotalParkingSpace() {
        return totalParkingSpace;
    }


    public int getAvailableParkingSpace() {
        return availableParkingSpace;
    }


    public void addAcarInParkingLot(Car car){
        cars.add(car);
    }

    public boolean getAcarInParkingLot(String carNum){
        for(Car c:cars){
            if(c.getCarNum().equals(carNum)){
                cars.remove(c);
                return true;
            }
        }
        return false;
    }
}