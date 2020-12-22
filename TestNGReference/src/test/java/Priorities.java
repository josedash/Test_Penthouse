import org.testng.Assert;
import org.testng.annotations.Test;

public class Priorities {

    @Test(priority = 1)
    void setup(){

        System.out.println("This is the set up method.");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("This is the login method.");
    }

    @Test(priority = 3, enabled = false)
    void tearDown(){
        System.out.println("This is the teardown method.");
        Assert.assertTrue(true);
    }

}
