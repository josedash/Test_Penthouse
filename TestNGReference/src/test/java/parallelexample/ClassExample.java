package parallelexample;

import org.testng.annotations.Test;

public class ClassExample {

    private int value = 0;

    @Test
    void testOne() throws InterruptedException {
        System.out.println("Test One");
        Thread.sleep(3000);
        value = 7;
        System.out.println("Constant Value :" + value);
    }

    @Test
    void testTwo() throws InterruptedException {
        System.out.println("Test Two");
        Thread.sleep(3000);
        System.out.println("Constant Value :" + value);
    }

    @Test
    void testThree() throws InterruptedException {
        System.out.println("Test Three");
        Thread.sleep(3000);
        System.out.println("Constant Value :" + value);

    }
}
