import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class class1 {
    public static void started(Class testClass) {
        System.out.println("Method start started");
    }
        @BeforeSuite
        public static void vivod () {
            System.out.println("class1,0");
        }
        @CheckTest
        public static void vivod1 () {
            System.out.println("class1,1");
        }
        @CheckTest
        public static void vivod2 () {
            System.out.println("class1,2");
        }
        @AfterSuite
        public static void vivod3 () {
            System.out.println("class1,3");
        }


}
