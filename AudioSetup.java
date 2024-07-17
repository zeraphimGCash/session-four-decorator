// represents a basic audio setup system
// implements `SystemPlan` interface

public class AudioSetup implements SystemPlan {
    int cost;
    AudioSetup() {
        this.cost = 250;
    }
    public int getSystemCost() {
        return this.cost;
    }

    public String getSystemDetails() {
        return "Basic Default system of hi the adapter.Car";
    }
}