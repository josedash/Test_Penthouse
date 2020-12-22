package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * create method 1 as the role data provider method.@DataProvider. ( to be referred in test method.)
 * ( if in diff class, data provider has to be static
 */
public class DataProviderTests {

    @Test(dataProvider = "userInfo")
    void loginWithId(String email, String password, String address){
        System.out.println(email);
        System.out.println(password);
        System.out.println(address);
    }

    @DataProvider(name = "userInfo")
    Object[][] getData() {
        Object[][] data = {{"jose@mail.com", "password", "home"}, {"juan@mail.com", "passwerd", "work"},
                {"mtz@mail.com", "passwurd", "usa"}};
        return data;
    }

    @Test(dataProvider = "userInfoDiff", dataProviderClass = DataProviderDiffClass.class)
    void loginWithIdFromDiffClass(String email, String password, String address){
        System.out.println(email);
        System.out.println(password);
        System.out.println(address);
    }



}
