package org.example.junit;

public class CabCalculatefare {

    public static final double costperkm = 10.0;
    public static final double costpermin = 1.0;
    public static final double minfare = 5;


    public double calculateFare(double distance ,int time) {

        //                        2*10               +  5 *1 =    25
        double totalfare = (distance * costperkm) + (time * costpermin);
        if (totalfare < 5) {
            return minfare;
        } else {
            return totalfare;
        }
    }
}
