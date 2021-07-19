import org.junit.Test;


public class MainClassTest
{
    @Test
    public void testGetClassString()
    {
        String text = MainClass.getClassString();
        //String str = "Hello world"
        int test1 = text.indexOf("Hello");
        int test2 = text.indexOf("hello");

        if (test1 == 0 || test2 == 0) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
            }
    }
}