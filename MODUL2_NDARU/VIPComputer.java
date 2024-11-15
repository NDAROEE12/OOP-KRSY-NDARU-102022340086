class VIPComputer extends Computer {
    // To do: Create 1 variable according to the requirements

    protected boolean vipCard;
    
    // To do: Create a constructor for the VIPComputer class

    public VIPComputer(int numberOfComputers, String internetCafeName, float pricePerHour, boolean vipCard) {
        super(numberOfComputers, internetCafeName, pricePerHour);
        this.vipCard = vipCard;
    }
    
    // To do: Create an Information method using Polymorphism Override with content that matches the requirements 
    // (can be different but must still align with the module material!)

    @Override
    public void Information() {
        super.Information();
        if (vipCard){
            System.out.println("Status: VIP Member");
            System.out.println("VIP Member Benefits:");
            System.out.println("-10% Discount for playing over 3 hours");
            System.out.println("-Free drink every 4 hours of gaming");
            System.out.println("-Priority booking for gaming computers");
        }else {
            System.out.println("Don't expect benefits, sorry :) ");
        }
    }
    
    // To do: Create a Login method according to the requirements

    public void Login(String username) {
        System.out.println("Logging in with username:" + username);
    }
    
    // To do: Create a Playing method according to the requirements

    public void Playing(int hour) {
        System.out.println("Playing for " + hour + " hours.");
    }
    
    // To do: Create a Playing method using Polymorphism Overloading according to the requirements

    public void Playing(int hour, int minutesAdditional) {
        System.out.println("Playing for " + hour + " hours and " + minutesAdditional + " minutes.");
    }

}