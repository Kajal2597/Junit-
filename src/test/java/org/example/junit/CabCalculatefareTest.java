package org.example.junit;

import org.junit.Assert;
import org.junit.Test;

public class CabCalculatefareTest {

    CabCalculatefare cab = new CabCalculatefare();

    @Test
    public void givendistanceFare(){
        double distance =2.0;
        int time = 5;
        double actualvalue  = cab.calculateFare(distance,time);
        int expectedvalue =20;
        Assert.assertEquals(expectedvalue,actualvalue,0);
    }

    @Test
    public void givendistanceFare2(){
        double distance =2.0;
        int time = 5;
        double actualvalue  = cab.calculateFare(distance,time);
        int expectedvalue =25;
        Assert.assertEquals(expectedvalue,actualvalue,0);
    }

}
