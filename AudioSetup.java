public class AudioSetup implements SystemPlan {
    int cost;
    AudioSetup() {
        this.cost = 250;
    }
    public int getSystemCost() {
        return this.cost;
    }

    public void getSystemDetails() {
        System.out.println("Basic Default system of the adapter.Car");
    }
}