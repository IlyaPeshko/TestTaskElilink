package old;

import by.htp.task.task_1_2_3.ui.webDriver.Driver;
import by.htp.task.task_1_2_3.ui.webDriver.DriverTypes;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected WebDriver driver;
    private static final Logger log = Logger.getLogger(BaseTest.class);

    @BeforeClass
    public void init (){
        PageFactory.initElements(driver, this);
        driver = Driver.getWebDriverInstance("chrome", DriverTypes.GC);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Before
    public void start () {
        driver.manage().window().fullscreen();
    }


    @AfterClass
    public void cleanUp () {
        driver.quit();
    }

}