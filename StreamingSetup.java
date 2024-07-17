// Implements the abstract class `SystemDecorator`

class StreamingSetup extends SystemDecorator {
    StreamingSetup(SystemPlan c1) {
        super(c1);
    }

    public int getSystemCost() {
        return 75 + this.c1.getSystemCost();
        // Cost of decorator is 75, added to the system totalcost
    }
    public void getSystemDetails() {
        this.c1.getSystemDetails();
        System.out.println("Auto Pilot System");
        // In theory adds Auto Pilot System
    }

}