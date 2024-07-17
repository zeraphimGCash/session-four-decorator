// Implements `SystemPlan` interface
// Used to add additional behavior to SystemPlan object

abstract class SystemDecorator implements SystemPlan {
    SystemPlan c1;

    SystemDecorator(SystemPlan c1) {
        this.c1 = c1;
    }

    public int getSystemCost() {
        return c1.getSystemCost();
    }

    public String getSystemDetails() {
        System.out.println(c1.getSystemDetails());
        return c1.getSystemDetails();
    }

}