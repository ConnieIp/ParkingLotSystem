import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ParkingLotSystemTest {
    @Test
    public void parkCar_Normal_pklExist_Test(){
        ParkingBoy parkingBoy=new NormalParkingBoy();
        String carnum="CAR1";
        int pklnum=1;
        ParkingLotSystem pklSystem=new ParkingLotSystem();
        String result=parkingBoy.parkCar(pklSystem,carnum);
        Assert.assertEquals("Success. Car parked in ParkingLot"+pklnum,result);
    }

    @Test
    public void parkCar_Normal_pklNotExist_Test(){
        ParkingBoy parkingBoy=new NormalParkingBoy();
        String carnum="CAR1";
        int pklnum=4;
        ParkingLotSystem pklSystem=new ParkingLotSystem();
        String result=parkingBoy.parkCar(pklSystem,carnum);
        Assert.assertEquals("Failed. ParkingLot not exists.",result);
    }

    @Test
    public void parkCar_Smart_NotFull_Test(){
        ParkingBoy parkingBoy=new SmartParkingBoy();
        ArrayList<ParkingLot> pkls=new ArrayList<ParkingLot>();
        ArrayList<Car> cars1=new ArrayList<Car>();
        ParkingLot pkl1=new ParkingLot(1,5,5,cars1);
        ArrayList<Car> cars2=new ArrayList<Car>();
        cars2.add(new Car("CAR1"));
        cars2.add(new Car("CAR2"));
        cars2.add(new Car("CAR3"));
        cars2.add(new Car("CAR4"));
        cars2.add(new Car("CAR5"));
        ParkingLot pkl2=new ParkingLot(2,5,0,cars2);
        ArrayList<Car> cars3=new ArrayList<Car>();
        cars3.add(new Car("CAR6"));
        cars3.add(new Car("CAR7"));
        cars3.add(new Car("CAR8"));
        ParkingLot pkl3=new ParkingLot(3,5,3,cars3);
        pkls.add(pkl1);
        pkls.add(pkl2);
        pkls.add(pkl3);
        String carnum="CAR9";
        ParkingLotSystem pklSystem=new ParkingLotSystem(pkls);
        String result=parkingBoy.parkCar(pklSystem,carnum);
        Assert.assertEquals("Success. Car parked in ParkingLot1",result);
    }

    @Test
    public void parkCar_Smart_Full_Test(){
        ParkingBoy parkingBoy=new SmartParkingBoy();
        ArrayList<ParkingLot> pkls=new ArrayList<ParkingLot>();
        ArrayList<Car> cars1=new ArrayList<Car>();
        cars1.add(new Car("CAR1"));
        cars1.add(new Car("CAR2"));
        cars1.add(new Car("CAR3"));
        cars1.add(new Car("CAR4"));
        cars1.add(new Car("CAR5"));
        ParkingLot pkl1=new ParkingLot(1,5,0,cars1);
        ArrayList<Car> cars2=new ArrayList<Car>();
        cars2.add(new Car("CAR6"));
        cars2.add(new Car("CAR7"));
        cars2.add(new Car("CAR8"));
        cars2.add(new Car("CAR9"));
        cars2.add(new Car("CAR10"));
        ParkingLot pkl2=new ParkingLot(2,5,0,cars2);
        ArrayList<Car> cars3=new ArrayList<Car>();
        cars3.add(new Car("CAR11"));
        cars3.add(new Car("CAR12"));
        cars3.add(new Car("CAR13"));
        cars3.add(new Car("CAR14"));
        cars3.add(new Car("CAR15"));
        ParkingLot pkl3=new ParkingLot(3,5,0,cars3);
        pkls.add(pkl1);
        pkls.add(pkl2);
        pkls.add(pkl3);
        String carnum="CAR16";
        ParkingLotSystem pklSystem=new ParkingLotSystem(pkls);
        String result=parkingBoy.parkCar(pklSystem,carnum);
        Assert.assertEquals("Failed. ParkingLot are full.",result);
    }

    @Test
    public void parkCar_Super_NotFull_Test(){
        ParkingBoy parkingBoy=new SuperParkingBoy();
        ArrayList<ParkingLot> pkls=new ArrayList<ParkingLot>();
        ArrayList<Car> cars1=new ArrayList<Car>();
        ParkingLot pkl1=new ParkingLot(1,2,1,cars1);
        ArrayList<Car> cars2=new ArrayList<Car>();
        cars2.add(new Car("CAR1"));
        cars2.add(new Car("CAR2"));
        cars2.add(new Car("CAR3"));
        cars2.add(new Car("CAR4"));
        cars2.add(new Car("CAR5"));
        ParkingLot pkl2=new ParkingLot(2,3,1,cars2);
        ArrayList<Car> cars3=new ArrayList<Car>();
        cars3.add(new Car("CAR6"));
        cars3.add(new Car("CAR7"));
        cars3.add(new Car("CAR8"));
        ParkingLot pkl3=new ParkingLot(3,4,1,cars3);
        pkls.add(pkl1);
        pkls.add(pkl2);
        pkls.add(pkl3);
        String carnum="CAR9";
        ParkingLotSystem pklSystem=new ParkingLotSystem(pkls);
        String result=parkingBoy.parkCar(pklSystem,carnum);
        Assert.assertEquals("Success. Car parked in ParkingLot1",result);
    }

    @Test
    public void pickCarTest(){
        ParkingBoy parkingBoy=new NormalParkingBoy();
        int pklNum=1;
        String carNum="CAR1";
        ParkingLotSystem parkingLotSystem=new ParkingLotSystem();
        //park car1 in parkinglot1
        String parkcar_result=parkingBoy.parkCar(parkingLotSystem,carNum);
        //pick up
        String pickcar_result=parkingBoy.pickCar(parkingLotSystem,carNum);
        Assert.assertEquals("Success. Car pickup in ParkingLot"+pklNum,pickcar_result);
    }
}
