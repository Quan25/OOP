/**
 * @author Quan Zhou
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class JBTestSuiteRunner {

    public static void main(String[] args) {
      System.out.println("Running Junit Test Suite.");
      Result result = JUnitCore.runClasses(JukeBoxTestSuite.class);
      for (Failure failure : result.getFailures()) {
          System.out.println(failure.toString());
      }
      System.out.println("Successful running all test ?: " + result.wasSuccessful() +
          " ran " + result.getRunCount() + " tests");
   }
}
