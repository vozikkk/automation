import org.junit.Test;

public class MainClassTest
{
    @Test
    public void testGetLocalNumber()
    {
        int a = MainClass.getLocalNumber();

                if (a==14)
                {
                    System.out.println("Method returns the expected value - 14");
                } else {
                    System.out.println("Method does not return the expected value - 14");
                }
    }
}
