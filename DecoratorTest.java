import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void testObjectTypes(){
        SystemPlan c1 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new AudioSetup())));
        SystemPlan b1 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new VoiceSetup())));
        Assert.assertEquals(c1.getClass(), b1.getClass());
    }


}
