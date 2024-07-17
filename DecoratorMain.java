
// Main class for implementing the Decorator Pattern
// Decorator Pattern in theory adds functionality to an object without modifying its underlying structure

// In the example - the decorator concept is used to add different components to a system and calculate the total cost of the system.

class DecoratorMain
{
    public static void main(String[] args)
	{	
        try
        {
            // Creates a SystemPlan object that is wrapped around each other to form a chain of decoratrs. Each decorator class adds its own behavior to the system plan. 
            SystemPlan c1 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new AudioSetup())));
            // Shows the total cost of the system
            System.out.println("Total cost of the system is " + c1.getSystemCost());
            c1.getSystemDetails();
            SystemPlan b1 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new VoiceSetup())));
            System.out.println("Total cost of the system is " + b1.getSystemCost());
            b1.getSystemDetails();
        }
        catch(Exception e){
            System.out.println("whatsup");
        }
	}
}