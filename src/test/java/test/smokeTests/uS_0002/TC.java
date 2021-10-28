package test.smokeTests.uS_0002;

import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class TC {

    ReusableMethods reusableMethods = new ReusableMethods();

    @Test
    public void test () {
        reusableMethods.login();
    }
}
