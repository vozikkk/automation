import org.junit.Test;

public class MainClassTest
{
    @Test
    public void testGetClassNumber()
    {
        int a = MainClass.getClassNumber();

            if (a>45)
            {
                System.out.println("Method returns the value bigger than 45");
            } else {
                    System.out.println("Error! Method should return the value bigger than 45");
                }
    }
}

