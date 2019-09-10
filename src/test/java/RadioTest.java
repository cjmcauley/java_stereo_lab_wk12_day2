import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Radio 1");
    }

    @Test
    public void radioCanBeTuned() {
        assertEquals("Radio 1", radio.getStation());
    }

}
