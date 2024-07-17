
class DecoratorMain
{
    public static void main(String[] args)
	{	
        try
        {
            SystemPlan c1 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new AudioSetup())));
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