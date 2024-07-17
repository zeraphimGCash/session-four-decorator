import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void testObjectTypes(){
        SystemPlan c1 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new AudioSetup())));
        SystemPlan b1 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new VoiceSetup())));
        System.out.println(c1.getClass());
        System.out.println(b1.getClass());
        Assert.assertEquals(c1.getClass(), b1.getClass());
    }

    @Test
    public void testSystemPlanWithNoComponents() {
        SystemPlan c4 = new AudioSetup();
        String expectedDescription = "Basic Default system of hi the adapter.Car";
        Assert.assertEquals(expectedDescription, c4.getSystemDetails());
    }

    @Test
    public void testSystemPlanCostWithNoComponents() {
        SystemPlan c4 = new AudioSetup();
        double expectedCost = 250; // assume cost for AudioSetup
        Assert.assertEquals(expectedCost, c4.getSystemCost(), 0.01);
    }

    @Test
    public void testSystemPlanWithMultipleVloggingSetups() {
        SystemPlan c5 = new VloggingSetup(new VloggingSetup(new StreamingSetup(new AudioSetup())));
        String expectedDescription = "Security System";
        Assert.assertEquals(expectedDescription, c5.getSystemDetails());
    }

    @Test
    public void testSystemPlanWithEquipmentAndVloggingSetups() {
        SystemPlan c6 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new AudioSetup())));
        String expectedDescription = "Nitro Boost System";
        Assert.assertEquals(expectedDescription, c6.getSystemDetails());
    }

    @Test
    public void testSystemPlanWithStreamingSetupOnly() {
        SystemPlan c7 = new StreamingSetup(new AudioSetup());
        String expectedDescription = "Auto Pilot System";
        Assert.assertEquals(expectedDescription, c7.getSystemDetails());
    }

    @Test
    public void testSystemPlanCostWithStreamingSetupOnly() {
        SystemPlan c7 = new StreamingSetup(new AudioSetup());
        double expectedCost = 325; // assume costs for StreamingSetup and AudioSetup
        Assert.assertEquals(expectedCost, c7.getSystemCost(), 0.01);
    }

    @Test
    public void testOrder(){
        SystemPlan o1 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new AudioSetup())));
        SystemPlan o2 = new VloggingSetup(new EquipmentSetup(new StreamingSetup(new AudioSetup())));
        System.out.println("o1 class: " + o1.getClass());
        System.out.println("o2 class: " + o2.getClass());
        System.out.println("o1 cost: " + o1.getSystemCost());
        System.out.println("o2 cost: " + o2.getSystemCost());
        Assert.assertEquals(o1.getSystemCost(), o2.getSystemCost());
    }
}
