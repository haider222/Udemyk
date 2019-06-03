package stepdefs;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class BaseClassForAll //extends readPropertiesByfileinputstream
         {
private static Logger logger = LogManager.getLogger(BaseClassForAll.class.getName());
public static WebDriver driver;
     public static Properties properties = new Properties();
        FileInputStream fileInputStream;
public WebDriver initalizaDriver() throws IOException {
fileInputStream = new FileInputStream("src\\main\\GeneralData.properties");
properties.load(fileInputStream);
String Browser = properties.getProperty("browser");
switch(Browser){
case "chrome" :
System.setProperty("webdriver.chrome.driver","ChromeBrowser\\chromedriver.exe" );
driver = new ChromeDriver();
break;
case "firefox" :
System.out.println(Browser);
break;
case "IE" :
System.out.println(Browser);
break;
default:
System.out.println("Browser should be chrome, firefox or IE");
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS  );
return driver;
}
public String openURL()  {
String url = properties.getProperty("url");
return  url;
 }
public void tearDown(){
driver.close();
driver.quit();
driver = null;// to avoid increase of memory while executing large number of test scenarios
}
public WebDriver takeScreenShot() throws IOException {
return driver;
}
}
