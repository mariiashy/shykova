package suits;

import loginTests.LoginTestWithPageObjectWithExcel;
import logoutTest.LogoutTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                LoginTestWithPageObjectWithExcel.class,
                LogoutTest.class

        }
)

public class LogoutSuit {


}
