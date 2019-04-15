import org.junit.Test;

public class AccountTest {
    int a = 10;
    private static AccountTest instance = new AccountTest();

    @Test
    public void testMe(){
        System.out.println("okokokok");
        System.out.println(instance);
    }

    @Override
    public String toString() {
        return String.valueOf(instance.a);
    }
}
