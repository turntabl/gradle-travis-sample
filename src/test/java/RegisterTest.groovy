import org.junit.Test

class RegisterTest extends GroovyTestCase {
    @Test
    public void testRegister(){
    Register register1 = new Register(Arrays.asList("Isaac", 1234, ServiceLevel.Gold));
    assertEquals(register1, register1.namesOfClients())
    }

    @Test
    public void testNameById(){
        Register register2 = new Register(Arrays.asList("Isaac", 1234, ServiceLevel.Gold));
        assertEquals(1234, register2.clientNamesById() )

    }
}
