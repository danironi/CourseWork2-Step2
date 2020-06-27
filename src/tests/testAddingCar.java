package tests;

import org.junit.jupiter.api.Test;
import step2.Car;
import step2.Dealership;
import step2.Make;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testAddingCar {

    @Test

    void testWithAddingCars(){
        Dealership dealership = new Dealership();
        Make make1 = new Make("Citroen");

        dealership.addMake(make1);

        Car car1 = new Car("NA90 LJK","Berlingo","Red");

        make1.addCar(car1);

        Car expectedResult = car1;
        Car actualResult = make1.getCarRegNo("NA90 LJK");

        String expected = car1.getRegNo();
        String actual = "NA90 LJK";


        assertEquals(expectedResult,actualResult);
        assertEquals(expected,actual);
    }
}
