class Computer {

    // To do: Create 3 variables according to the requirements
    
    protected int numberOfComputers;
    protected String internetCafeName;
    protected float pricePerHour;
    
    // To do: Create a constructor for the Computer class

    public Computer(int numberOfComputers, String internetCafeName, float pricePerHour) {
        this.numberOfComputers = numberOfComputers;
        this.internetCafeName = internetCafeName;
        this.pricePerHour = pricePerHour;
    }
    
    // To do: Create an Information method with content that matches the requirements 
    // (can be different but must still align with the module material!)

    public void Information() {
        System.out.println("Internet Cafe: " + internetCafeName);
        System.out.println("Number of Computers: " + numberOfComputers);
        System.out.println("Price per Hour: $" + pricePerHour);
    }


}