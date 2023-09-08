package Steps;

import Utils.DriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends DriverInit{


    @Before
    public void hook()
    {
        System.out.println("Iniciando automatización");
    }

    @After
    public void after()
    {
        driver.close();
    }
}
