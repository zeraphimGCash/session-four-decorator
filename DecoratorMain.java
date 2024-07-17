
// Main class for implementing the Decorator Pattern
// Decorator Pattern in theory adds functionality to an object without modifying its underlying structure

// In the example - the decorator concept is used to add different components to a system and calculate the total cost of the system.

class DecoratorMain
{
    public static void main(String[] args)
	{

        System.out.println("""
                    
                    
                       ,---.-,                                                                   \s
                      '   ,'  '.                                                                 \s
                     /   /      \\                                                       ,---,    \s
                    .   ;  ,/.  :    ,---,.  ,---,    ,---,.  ,---,    ,---,.  ,---,  .'  .' `\\  \s
                    '   |  | :  ;  ,'  .' |,'  .'|  ,'  .' |,'  .'|  ,'  .' |,'  .'|,---.'     \\ \s
                    '   |  ./   :,---.'  ,---.'  |,---.'  ,---.'  |,---.'  ,---.'  ||   |  .`\\  |\s
                    |   :       ,|   |   |   |   ;|   |   |   |   ;|   |   |   |   ;:   : |  '  |\s
                     \\   \\     / :   :  .:   :  .':   :  .:   :  .':   :  .:   :  .'|   ' '  ;  :\s
                      ;   ,   '\\ :   |.' :   |.'  :   |.' :   |.'  :   |.' :   |.'  '   | ;  .  |\s
                     /   /      \\`---'   `---'    `---'   `---'    `---'   `---'    |   | :  |  '\s
                    .   ;  ,/.  :                                                   '   : | /  ; \s
                    '   |  | :  ;                                                   |   | '` ,/  \s
                    '   |  ./   :                                                   ;   :  .'    \s
                    |   :      /                                                    |   ,.'      \s
                     \\   \\   .'                                                     '---'        \s
                      `---`-'                                                                    \s
                    
                    
                    """);

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println("""
                
                    ___  __  ___   ___  __    _   _____  ___  __ \s
                   /   \\/__\\/ __\\ /___\\/__\\  /_\\ /__   \\/___\\/__\\\s
                  / /\\ /_\\ / /   //  // \\// //_\\\\  / /\\//  // \\//\s
                 / /_///__/ /___/ \\_// _  \\/  _  \\/ / / \\_// _  \\\s
                /___,'\\__/\\____/\\___/\\/ \\_/\\_/ \\_/\\/  \\___/\\/ \\_/\s
                                                                 \s
                """);
        try
        {
            // Creates a SystemPlan object that is wrapped around each other to form a chain of decoratrs. Each decorator class adds its own behavior to the system plan.

            System.out.println("OBJECT 1:\n");
            SystemPlan c1 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new AudioSetup())));
            // Shows the total cost of the system
            System.out.println("Total cost of the system is " + c1.getSystemCost());
            c1.getSystemDetails();
            System.out.println("=".repeat(50));

            System.out.println("\n\nOBJECT 2:\n");
            SystemPlan b1 = new EquipmentSetup(new VloggingSetup(new StreamingSetup(new VoiceSetup())));
            System.out.println("Total cost of the system is " + b1.getSystemCost());
            b1.getSystemDetails();




        }
        catch(Exception e){
            System.out.println("whatsup");
        }
	}
}