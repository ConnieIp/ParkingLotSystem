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
}
