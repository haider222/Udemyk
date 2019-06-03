import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class screenShotListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {

//        try {
//            TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
//            File sourc = takesScreenshot.getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(sourc, new File("C://Users//muhammad.ilyas//Downloads//scredfdenshot.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
