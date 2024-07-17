import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class BasicSystemTest {
    private OutputCapture outputCapture;

    @Before
    public void setUp() {
        outputCapture = new OutputCapture();
        outputCapture.setUp();
    }

    @After
    public void tearDown() {
        outputCapture.tearDown();
    }

    @Test
    public void testAudioSetup() {
        SystemPlan audio = new AudioSetup();
        assertEquals(250, audio.getSystemCost());
        audio.getSystemDetails();
        assertEquals("Basic Default system of the adapter.Car", outputCapture.getOutput());
    }

    @Test
    public void testVoiceSetup() {
        SystemPlan voice = new VoiceSetup();
        assertEquals(150, voice.getSystemCost());
        voice.getSystemDetails();
        assertEquals("Basic Default system of the Bike", outputCapture.getOutput());
    }
}
