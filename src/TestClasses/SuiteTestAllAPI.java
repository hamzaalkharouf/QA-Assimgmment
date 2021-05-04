package TestClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestGetRestAPI.class,
	TestPutRestAPI.class,
	TestPostRestAPI.class,
	TestDeleteRestAPI.class,



})

public class SuiteTestAllAPI {

}
