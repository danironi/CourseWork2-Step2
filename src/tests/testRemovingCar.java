package tests;

import org.junit.jupiter.api.Test;
import step2.Car;
import step2.Dealership;
import step2.Make;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testRemovingCar {
    @Test

    void testWithRemovingCars(){

        Dealership dealership = new Dealership();

        Make make1 = new Make("Ford");

        dealership.addMake(make1);

        Car car1 = new Car("NA90 LJK","Fiesta","Red");
        Car car2 = new Car("AW10 LKJ","Focus","Blue");

        make1.addCar(car1);
        make1.addCar(car2);

        make1.removeCar("NA90 LJK");

        Car expectedResult = null;
        Car actualResult= make1.getCarRegNo("NA90 LJK");

        int expected = 1;
        int actual = make1.getCars().size();

        assertEquals(expectedResult,actualResult);
        assertEquals(expected,actual);
    }
}
