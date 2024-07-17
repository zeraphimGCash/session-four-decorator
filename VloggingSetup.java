// Implements `SystemDecorator` abstract class

class VloggingSetup extends SystemDecorator {

    VloggingSetup(SystemPlan c1) {
        super(c1); // inherits properties and behavior of `SystemDecorator`
    }

    public int getSystemCost() {
        return 25 + this.c1.getSystemCost();
        // Cost of vlogging setup decorator is 25, add to the total cost of the system
    }

    public void getSystemDetails() {
        this.c1.getSystemDetails();
        System.out.println("Security System");
        // In theory adds Security System
    }

}