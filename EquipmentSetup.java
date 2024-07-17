// Implements the abstract class `SystemDecorator`
// 

class EquipmentSetup extends SystemDecorator {

    EquipmentSetup(SystemPlan c1) {
        super(c1);
    }

    public int getSystemCost() {
        return 25 + this.c1.getSystemCost();
        // Cost of decorator is 25, it is added to the system cost
    }

    public void getSystemDetails() {
        this.c1.getSystemDetails();
        System.out.println("Nitro Boost System");
        // In theory adds Nitro Boost System
    }

}