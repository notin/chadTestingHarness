package dataproviders;

import org.testng.annotations.DataProvider;
import utils.QueryInfo;

public class vms {

    @DataProvider(name = "vms.json")
    public static Object[][] vms() {
        return new Object[][] { { QueryInfo.USERNAME, QueryInfo.PASSWORD, QueryInfo.CREDENTIALS, QueryInfo.BASE, QueryInfo.VMS, QueryInfo.TOKEN} };
    }
}
