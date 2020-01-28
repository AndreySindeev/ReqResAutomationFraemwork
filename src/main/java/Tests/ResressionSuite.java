package Tests;

        import org.junit.runner.RunWith;
        import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestPostRequests.class,
        TestGetRequests.class,
        TestPutRequests.class,
        TestDeleteRequests.class
})
class RegressionSuite {
}