package parallelexample;

import org.testng.annotations.Test;

public class MethExample {

    private int value = 9;

    @Test
    void testOne() throws InterruptedException {
        System.out.println("Test One");
        Thread.sleep(3000);
        System.out.println("Meth Constant Value :" + value);
    }

    @Test
    void testTwo() throws InterruptedException {
        System.out.println("Meth Test Two");
        Thread.sleep(3000);
        System.out.println("Constant Value :" + value);
        value = 5;
    }

    @Test
    void testThree() throws InterruptedException {
        System.out.println("Meth Test Three");
        Thread.sleep(3000);
        System.out.println("Constant Value :" + value);
    }
}
