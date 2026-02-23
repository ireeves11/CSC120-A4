public class Engine {
    private FuelType fuel;
    private double maxFuel;
    private double currentFuel;

    public Engine (FuelType fuel, double current, double max){
        this.fuel = fuel;
        maxFuel = max;
        currentFuel = current;
    }

    public FuelType getFuelType(){
        return fuel;
    }

    public double getMaxFuel(){
        return maxFuel;
    }

    double getCurrentFuel(){
        return currentFuel;
    }
    void refuel(){
        currentFuel = maxFuel;
    } 
    Boolean go(){
        if (currentFuel > 0){
            currentFuel = currentFuel - 1;
        }
        System.out.println("Fuel Remaining: " + currentFuel);
        return currentFuel > 0;
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 10.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
        myEngine.refuel();
        System.out.println(myEngine.getCurrentFuel());
    }
}
