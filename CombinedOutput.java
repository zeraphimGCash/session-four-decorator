import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CombinedOutput {

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
    public void testCombinedSystemWithAudio() {
        SystemPlan system = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new AudioSetup())));
        assertEquals(375, system.getSystemCost());
        assertEquals("Basic Default system of the adapter.Car\nAuto Pilot System\nSecurity System\nNitro Boost System", outputCapture.getOutput());
    }

    @Test
    public void testCombinedSystemWithVoice() {
        SystemPlan system = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new VoiceSetup())));
        assertEquals(275, system.getSystemCost());
        assertEquals("Basic Default system of the Bike\nAuto Pilot System\nSecurity System\nNitro Boost System",outputCapture.getOutput());
    }
}
