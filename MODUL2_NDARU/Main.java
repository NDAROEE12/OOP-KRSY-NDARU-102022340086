public class Main {
    public static void main(String[] args) {

        // To do: Create a new object from the Computer class

        Computer computer = new Computer(20, "SCAM GAMING INTERNET CAFE", 250000);
        
        // To do: Call the information method from the Computer class
        
        computer.Information();
        System.out.println();
        
        
        // To do: Create a new object from the VIPComputer class

        VIPComputer vipComputer = new VIPComputer(15, "SCAM GAMING INTERNET CAFE VIP + + ", 888888, false);

        // To do: Call the Information methods from the VIPComputer class

        vipComputer.Information();        

        // To do: Call the Login methods

        vipComputer.Login("Udin");

        // To do: Call the Palying method 2x to be able to do polymorphism overloading

        vipComputer.Playing(200);
        vipComputer.Playing(500, 200);
        System.out.println();
         
        // To do: Create a new object from the PremiumComputer class

        PremiumComputer PREMIUMComputer = new PremiumComputer(5, "SCAM GAMING INTERNET CAFE PREMIUM HOT HOT + + ", 1500000, false);

        // To do: Call the Information methods from the VIPComputer class

        PREMIUMComputer.Information();

        // To do: Call the Order methods

        PREMIUMComputer.Order(13);

        // To do: Call the AddService method 2x to be able to do polymorphism overloading

        PREMIUMComputer.AddService("Batagor lapis emas");
        PREMIUMComputer.AddService("Nasgor Caviar", "Jus sari keringat Naga merah dari gunung Fuji");
        
    }
}