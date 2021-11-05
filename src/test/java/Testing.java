import io.turntabl.domain.PrivateClient;
import io.turntabl.domain.ServiceLevel;
import org.junit.Test;
public class Testing {
    @Test
    public void test() {
        PrivateClient privateClient = new PrivateClient("Mickey", ServiceLevel.GOLD, "Lady P");

        System.out.println(privateClient.save("micke", String::length));

        System.out.println(privateClient.useSupplier(() -> 50));

    }
}
