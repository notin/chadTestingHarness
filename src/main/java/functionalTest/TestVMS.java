package functionalTest;

import dataproviders.vms;
import org.testng.annotations.Test;
import pojos.VMS;
import utils.QueryInfo;

public class TestVMS extends BaseTest
{
    @Test(dataProvider = "vms.json", dataProviderClass= vms.class)
    public void testGetVM( QueryInfo username, QueryInfo password, QueryInfo credentials, QueryInfo base, QueryInfo param, QueryInfo token)
    {
       VMS vm = getVMS(base, param, token, "21310576", VMS.class);
    }

    @Test(dataProvider = "vms.json", dataProviderClass= vms.class)
    public void testRunVM( QueryInfo username, QueryInfo password, QueryInfo credentials, QueryInfo base, QueryInfo param, QueryInfo token)
    {
        VMS vm = getVMS(base, param, token, "21310576",VMS.class);
        vm.setRunstate("running");
        getRunVMS(base, param, token, vm.getRunstate(), "/21310576.json", String.class);
    }


}
