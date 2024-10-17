package org.example.junit;
import org.junit.Assert;

import org.junit.jupiter.api.Test;

public class ClasscutoffCalculatorTest {

    CutOffMarkCalculator cc=new CutOffMarkCalculator();

    @Test
    public void testFCEligibility() {
        Assert.assertTrue(cc.isEligibleByCaste(610, "FC"));  // should be eligible
        Assert.assertFalse(cc.isEligibleByCaste(599, "FC"));  // should not be eligible
    }

    // Test for BC caste eligibility
    @Test
    public void testBCEligibility() {
        Assert.assertTrue(cc.isEligibleByCaste(580, "BC"));  // should be eligible
        Assert.assertFalse(cc.isEligibleByCaste(579, "BC"));  // should not be eligible
    }


}
