package grouping;

import org.testng.annotations.Test;

public class GroupingTests {

    @Test(groups = "sanity")
    void groupTest1(){
        System.out.println("Test 1....");
    }

    @Test(groups = "sanity")
    void groupTest2(){
        System.out.println("Test 2....");
    }

    @Test(groups = "regression")
    void groupTest3(){
        System.out.println("Test 3....");
    }

    @Test(groups = "regression")
    void groupTest4(){
        System.out.println("Test 4....");
    }

    @Test(groups = {"regression","sanity"})
    void groupTest5(){
        System.out.println("Test 5....");
    }

}
