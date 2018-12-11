import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBottle {

    Bottle bottle;

    @Before
   public void before(){
        bottle = new Bottle(100);
    }

    @Test
    public void testFill(){
        Bottle bottleEmpty = new Bottle(0);
        assertEquals(100, bottleEmpty.fill());
    }

    @Test
    public void testEmpty() {
        assertEquals(0, bottle.empty());
    }

    @Test
    public void testGet() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void testDrink() {
        assertEquals(90, bottle.drink());
    }

    @Test
    public void testSetVolumn(){
        Bottle b = new Bottle(0);
        assertEquals(90, b.setVolume(90));
    }
}
