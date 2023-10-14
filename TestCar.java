package org.example;

import org.junit.*;

public class TestCar {


    @Test
    public void whenCalledVehicleAccelerate_thenOneAssertion() {
        Vehicle vehicle = new Vehicle();
        String mph ="100";
        Assert.assertEquals(vehicle.accelerate(100), "The vehicle accelerates at : " + mph + " MPH.");
        Object object = new Object();

    }
//
//    @Test
//    public void whenCalledVehicleRun_thenOneAssertion() {
//        Vehicle vehicle = new Vehicle();
//        assertThat(vehicle.run())
//                .isEqualTo("The vehicle is running.");
//    }
//
//
//    @Test
//    public void whenCalledVehicleStop_thenOneAssertion() {
//        Vehicle vehicle = new Vehicle();
//        assertThat(vehicle.stop())
//                .isEqualTo("The vehicle has stopped.");
//    }
//
//    @Test
//    public void whenCalledCarAccelerate_thenOneAssertion() {
//        Car car = new Car();
//        assertThat(car.accelerate(80))
//                .isEqualTo("The car accelerates at : 80 MPH.");
//    }
//
//    @Test
//    public void whenCalledCarRun_thenOneAssertion() {
//        Car car = new Car();
//        assertThat(car.run())
//                .isEqualTo("The vehicle is running.");
//    }
//
//    @Test
//    public void whenCalledCarStop_thenOneAssertion() {
//        Car car = new Car();
//        assertThat(car.stop())
//                .isEqualTo("The vehicle has stopped.");
//    }
}
