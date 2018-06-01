import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ParkingLotSystemTest {
    @Test
    public void parkCarWithExistPklNumTest(){
        String carnum="CAR1";
        int pklnum=1;
        ParkingLotSystem pklSystem=new ParkingLotSystem();
        String result=pklSystem.parkCarWithPklNum(pklnum,carnum);
        Assert.assertEquals("Success. Car parked in ParkingLot"+pklnum,result);
    }

    @Test
    public void parkCarWithNotExistPklNumTest(){
        String carnum="CAR1";
        int pklnum=4;
        ParkingLotSystem pklSystem=new ParkingLotSystem();
        String result=pklSystem.parkCarWithPklNum(pklnum,carnum);
        Assert.assertEquals("Failed. ParkingLot not exists.",result);
    }

    @Test
    public void parkCarInPklWithMostAvailableSpaceTest(){
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
        String result=pklSystem.parkCarInPklWithMostAvailableSpace(carnum);
        Assert.assertEquals("Success. Car parked in ParkingLot1",result);
    }

    @Test
    public void parkCarInPklWithMostAvailableSpaceButFullTest(){
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
        String result=pklSystem.parkCarInPklWithMostAvailableSpace(carnum);
        Assert.assertEquals("Failed. ParkingLot are full.",result);
    }

    @Test
    public void pickCarTest(){
        int pklNum=1;
        String carNum="CAR1";
        ParkingLotSystem parkingLotSystem=new ParkingLotSystem();
        //park car1 in parkinglot1
        parkingLotSystem.parkCarWithPklNum(1,carNum);
        //pick up
        String result=parkingLotSystem.pickCarWithPklNum(1,carNum);
        Assert.assertEquals("Success. Car pickup in ParkingLot"+pklNum,result);
    }
}
