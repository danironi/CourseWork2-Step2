package tests;

import org.junit.jupiter.api.Test;
import step2.Dealership;
import step2.Make;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testAddingMake {
    @Test

    void testWithAddingMakes(){
        Dealership dealership = new Dealership();

        Make make1 = new Make("Citroen");
        Make make2 = new Make("Fiat");

        dealership.addMake(make1);
        dealership.addMake(make2);

        int expectedResult = 2;
        int actualResult = dealership.listSize();

        assertEquals(expectedResult,actualResult);
    }
}
