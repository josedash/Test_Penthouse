package dependencytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Car {

    @Test
    void startCar(){
        System.out.println("start car");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("drive car");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("stop car");
    }

    @Test(dependsOnMethods = {"driveCar", "stopCar"}, alwaysRun = true)
    void parkCar(){
        System.out.println("Park car");
    }
}
