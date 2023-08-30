
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class chandrayanTest {
    @Test
    public void testcommand(){
        Spacecraft spacecraft = new Spacecraft(0, 0, 0, "N");
        spacecraft.moveForward();
        
        assertEquals(0, spacecraft.x);
        assertEquals(1, spacecraft.y);
        assertEquals(0, spacecraft.z);
        assertEquals("N", spacecraft.direction);
               }

}
