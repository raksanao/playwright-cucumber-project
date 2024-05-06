package com.bunch.step_defs;

import com.bunch.utilities.BrowserUtils;
import com.bunch.utilities.Driver;
import org.junit.After;

public class Hooks {


    @After
    public void tearDown()  {
        BrowserUtils.sleep(3);
        Driver.getInstance().close();
    }
}
