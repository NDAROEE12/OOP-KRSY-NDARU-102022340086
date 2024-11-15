class PremiumComputer extends Computer {
    // To do: Create 1 variable according to the requirements

    protected boolean privateSpace;
    
    // To do: Create a constructor for the PremiumComputer class

    public PremiumComputer(int numberOfComputers, String internetCafeName, float pricePerHour, boolean privateSpace) {
        super(numberOfComputers, internetCafeName, pricePerHour);
        this.privateSpace = privateSpace;
    }
    
    // To do: Create an Information method using Polymorphism Override with content that matches the requirements 
    // (can be different but must still align with the module material!)

    @Override
    public void Information() {
        super.Information();
        if  (privateSpace){
            System.out.println("Premium Room Facilities:");
            System.out.println("- Private air-conditioned room");
            System.out.println("- Exclusive gaming sofa");
            System.out.println("- High-spec computer");
            System.out.println("- Dedicated 100Mbps internet connection");
        }else {
            System.out.println("Standard Room Facilities:");
            System.out.println("- Non-Ac room");
            System.out.println("- Basic sofa");
            System.out.println("- Low-spec computer");
            System.out.println("- Dedicated 1Mbps internet connection");
        }
    }

    
    // To do: Create an Order method according to the requirements

    public void Order(int computerNumber) {
        System.out.println("Ordering computer number: " + computerNumber);
    }
    
    // To do: Create an AddService method according to the requirements

    public void AddService(String food) {
        System.out.println("Adding food service:" + food);
    }
    
    // To do: Create an AddService method using Polymorphism Overloading according to the requirements

    public void AddService(String food, String drink) {
        System.out.println("Adding food service:" + food + ", and " + drink);
    }
}
