package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;


//Itestlistener interface which implements Testng Listeners
public class Listeners implements ITestListener{
	
	public  void onTestStart(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a test succeeds.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS
	   */
	  public  void onTestSuccess(ITestResult result) {
	    // not implemented
		 // System.out.println("I successfully executed Listeners pass code");
	  }

	  public interface ITestListener extends ITestNGListener {
		  /**
		   * Invoked each time before a test will be invoked. The <code>ITestResult</code> is only partially
		   * filled with the references to class, method, start millis and status.
		   *
		   * @param result the partially filled <code>ITestResult</code>
		   * @see ITestResult#STARTED
		   */
		  public static void onTestStart(ITestResult result) {
		    // not implemented
		  }

		  /**
		   * Invoked each time a test succeeds.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SUCCESS
		   */
		  public static void onTestSuccess(ITestResult result) {
		    // not implemented
		  }

		  /**
		   * Invoked each time a test fails.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#FAILURE
		   */
		  public static void onTestFailure(ITestResult result) {
		    // not implemented
			  System.out.println("I falied executing Listeners pass code" +result.getName());
		  }

		  /**
		   * Invoked each time a test is skipped.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SKIP
		   */
		  public static void onTestSkipped(ITestResult result) {
		    // not implemented
		  }

		  /**
		   * Invoked each time a method fails but has been annotated with successPercentage and this failure
		   * still keeps it within the success percentage requested.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
		   */
		  public static void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    // not implemented
		  }

		  /**
		   * Invoked each time a test fails due to a timeout.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   */
		  public static void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }

		  /**
		   * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt; tag
		   * and calling all their Configuration methods.
		   *
		   * @param context The test context
		   */
		  public static void onStart(ITestContext context) {
		    // not implemented
		  }

		  /**
		   * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
		   * and all their Configuration methods have been called.
		   *
		   * @param context The test context
		   */
		  public static void onFinish(ITestContext context) {
		    // not implemented
		  }
	  }
	  

}
