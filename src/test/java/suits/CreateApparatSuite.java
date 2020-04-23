package suits;


import createApparatTest.CreateApparatWithNumberCommentFilled;
import createApparatTest.UnvalidCreateApparatWithCommentFilled;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                CreateApparatWithNumberCommentFilled.class,
                UnvalidCreateApparatWithCommentFilled.class,
                CreateApparatWithNumberCommentFilled.class

        }
)

public class CreateApparatSuite {
}
