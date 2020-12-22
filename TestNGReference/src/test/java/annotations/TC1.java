package annotations;

import org.testng.annotations.*;

public class TC1 {

    @BeforeTest
    void beforeTest(){
        System.out.println("Before even class");
    }


    @AfterTest
    void afterTest(){
        System.out.println("After test");

    }

    @BeforeClass
    void beforeClass(){
        System.out.println("Executed before class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("Executed After Class ");
    }

    /**
     * It will execute before every @Test method
     */
    @BeforeMethod
    void beforeMethod(){
        System.out.println("this will execute before every test method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every test method");
    }

    @Test
    void testOne(){
        System.out.println("Test One");
    }

    @Test
    void testTwo(){
        System.out.println("Test Two");
    }
}
