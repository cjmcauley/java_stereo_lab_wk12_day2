import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdplayer;

    @Before
    public void before() {
        cdplayer = new CDPlayer("Sony", "A310", 4);
    }

    @Test
    public void hasCD() {
        assertEquals(4, cdplayer.getNoOfCDs());
    }

    @Test
    public void canPlayCD() {
        assertEquals("playing", cdplayer.play());
    }

}
