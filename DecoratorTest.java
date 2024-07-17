import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {

//    Simply test the object type of the decorated objects
//    Expected behavior: the two objects should be equal and of object type of the outermost decorator wrapping
    @Test
    public void testObjectTypes(){
        SystemPlan c1 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new AudioSetup())));
        SystemPlan b1 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new VoiceSetup())));
        System.out.println(c1.getClass());
        System.out.println(b1.getClass());
        Assert.assertEquals(c1.getClass(), b1.getClass());
    }

    // Tests the getSystemDetails method of a SystemPlan object that implements AudioSetup and no other components
    @Test
    public void testSystemPlanWithNoComponents() {
        SystemPlan c2 = new AudioSetup();
        String expectedDescription = "Basic Default system of hi the adapter.Car";
        Assert.assertEquals(expectedDescription, c2.getSystemDetails());
    }

    // Tests the system cost calculation for a SystemPlan that implements AudioSetup and no other components
    @Test
    public void testSystemPlanCostWithNoComponents() {
        SystemPlan c3 = new AudioSetup();
        double expectedCost = 250; // assume cost for AudioSetup
        Assert.assertEquals(expectedCost, c3.getSystemCost(), 0.01);
    }

    // Tests the getSystemDetails method of a SystemPlan object that implements VloggingSetup, StreamingSetup, and AudioSetup
    @Test
    public void testSystemPlanWithMultipleVloggingSetups() {
        SystemPlan c4 = new VloggingSetup(new VloggingSetup(new StreamingSetup(new AudioSetup())));
        String expectedDescription = "Security System";
        Assert.assertEquals(expectedDescription, c4.getSystemDetails());
    }

    // Tests the getSystemDetails method of a SystemPlan object that implements EquipmentSetup, VloggingSetup, StreamingSetup and AudioSetup
    @Test
    public void testSystemPlanWithEquipmentAndVloggingSetups() {
        SystemPlan c5 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new AudioSetup())));
        String expectedDescription = "Nitro Boost System";
        Assert.assertEquals(expectedDescription, c5.getSystemDetails());
    }

    // Tests the getSystemDetails method of a SystemPlan object that implements StreamingSetup and AudioSetup
    @Test
    public void testSystemPlanWithStreamingSetupOnly() {
        SystemPlan c6 = new StreamingSetup(new AudioSetup());
        String expectedDescription = "Auto Pilot System";
        Assert.assertEquals(expectedDescription, c6.getSystemDetails());
    }

    // Tests the system cost calculation of a SystemPlan object that implements StreamingSetup and AudioSetup
    @Test
    public void testSystemPlanCostWithStreamingSetupOnly() {
        SystemPlan c7 = new StreamingSetup(new AudioSetup());
        double expectedCost = 325; // assume costs for StreamingSetup and AudioSetup
        Assert.assertEquals(expectedCost, c7.getSystemCost(), 0.01);
    }

//    Test if the order of wrapping of decorators on concrete classes changes the behavior and class of the concrete obj
//    Expected behavior: The concrete obj should behave the same regardless of wrapping order
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
