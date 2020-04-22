package suits;

import loginTests.LoginTest;
import loginTests.LoginWithPageObjectTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                LoginTest.class,
                LoginWithPageObjectTest.class

        }
)
public class LoginSuit {

}



