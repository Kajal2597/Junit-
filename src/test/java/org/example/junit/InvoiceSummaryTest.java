package org.example.junit;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceSummaryTest {

    @Test
    void testInvoiceSummaryConstructor() {

        int totalFare = 100;
        double noOfRides = 2;


        InvoiceSummary invoiceSummary = new InvoiceSummary(totalFare, noOfRides);


        assertEquals(100, invoiceSummary.totalFare, "Total fare should be 100");
        assertEquals(2, invoiceSummary.noOfRides, "Number of rides should be 2");
        assertEquals(50, invoiceSummary.avgFare, "Average fare should be 50");
    }

    @Test
    void testEqualsMethod_sameObject() {

        InvoiceSummary invoiceSummary = new InvoiceSummary(200, 4);


        assertTrue(invoiceSummary.equals(invoiceSummary), "The same object should be equal to itself");
    }

    @Test
    void testEqualsMethod_differentObject() {

        InvoiceSummary summary1 = new InvoiceSummary(200, 4);
        InvoiceSummary summary2 = new InvoiceSummary(200, 4);
        assertTrue(summary1.equals(summary2), "Objects with the same values should be equal");
    }

    @Test
    void testEqualsMethod_differentValues() {

        InvoiceSummary summary1 = new InvoiceSummary(200, 4);
        InvoiceSummary summary2 = new InvoiceSummary(150, 3);
        assertFalse(summary1.equals(summary2), "Objects with different values should not be equal");
    }

    @Test
    void testSetUserId() {

        InvoiceSummary summary1 = new InvoiceSummary(300, 6);
        InvoiceSummary summary2 = new InvoiceSummary(400, 8);
        Map<Integer, InvoiceSummary> userMap = summary1.getUserId();
        summary1.setUserId(101, summary2);
        assertEquals(userMap, summary1.getUserId(), "The userId map should remain the same, as the method currently does nothing.");
    }

    @Test
    void testGetUserId() {

        InvoiceSummary summary1 = new InvoiceSummary(150, 3);
        Map<Integer, InvoiceSummary> userIdMap = summary1.getUserId();
        assertNotNull(userIdMap, "User ID map should not be null");
        assertTrue(userIdMap.isEmpty(), "User ID map should initially be empty");
    }
}
