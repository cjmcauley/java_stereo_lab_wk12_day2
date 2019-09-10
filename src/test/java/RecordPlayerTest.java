import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {

    RecordPlayer recordPlayer;

    @Before
    public void before() {
        recordPlayer = new RecordPlayer("Panasonic", "E323", 45);

    }

    @Test
    public void hasSpeed(){
        assertEquals(45, recordPlayer.getSpeed());
    }

    @Test
    public void canPlay(){
        assertEquals("playing", recordPlayer.play());
    }
}
