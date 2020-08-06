import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.lang.reflect.Method;

public class TryClass extends class1{

     public static void start(Class testClass) {
         System.out.println("Method");
}

    @CheckTest(value = 20.0f)
    public void check () {
        System.out.println("Java");
    }
    @CheckTest(value = 20.0f)
    public void check1 () {
        System.out.println("Java");
    }



}
