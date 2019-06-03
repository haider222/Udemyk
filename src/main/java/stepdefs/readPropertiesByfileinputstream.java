package stepdefs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readPropertiesByfileinputstream {
    Properties properties = new Properties();
    public void readProperty(){
        FileInputStream fileInputStream;
  {
            try {
                fileInputStream = new FileInputStream("src\\main\\GeneralData.properties");
                properties.load(fileInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
