// Can be added to a basic audio setup
// Implements the `SystemPlan` interface

public class VoiceSetup implements SystemPlan {
    int cost;
    VoiceSetup() {
        this.cost = 150;
    }

    public int getSystemCost() {
        return this.cost;
    }

    public void getSystemDetails() {
        System.out.println("Basic Default system of the Bike");
    }
}