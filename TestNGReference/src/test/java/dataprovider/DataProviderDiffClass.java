package dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderDiffClass {

    @DataProvider(name = "userInfoDiff")
    public static Object[][] getData() {
        Object[][] data = {{"jose@mail.com", "password", "home"}, {"juan@mail.com", "passwerd", "work"},
                {"mtz@mail.com", "passwurd", "mexico"}};
        return data;
    }
}
