public class Engine {
    
    //all private atributes

    private FuelType fuel;
    private double maxFuel;
    private double currentFuel;

    /**
     * Engine constructor
     * @param fuel the type of fuel the train uses
     * @param current current amount of fuel the engine has
     * @param max the maximum amount of fuel the engine can take
     */
    public Engine (FuelType fuel, double current, double max){
        this.fuel = fuel;
        maxFuel = max;
        currentFuel = current;
    }

    /**
     * getter for fuel
     * @return the fuel type
     */
    public FuelType getFuelType(){
        return fuel;
    }

    /**
     * getter for fuel
     * @return the maximum amount of fuel
     */
    public double getMaxFuel(){
        return maxFuel;
    }

    /**
     * getter for current fuel
     * @return the current fuel
     */
    double getCurrentFuel(){
        return currentFuel;
    }

    /**
     * brings the current fuel up to max fuel
     */
    void refuel(){
        currentFuel = maxFuel;
    } 

    /**
     * decreases the amount of current fuel, unless current fuel = 0
     * @return if the current fuel is positive
     */
    Boolean go(){
        if (currentFuel > 0){
            currentFuel = currentFuel - 1;
        }
        System.out.println("Fuel Remaining: " + currentFuel);
        return currentFuel > 0;
    }

    /**
     * a toString to make Train method getEngine() prettier
     * @return the type of fuel engine it is
     */
    public String toString(){
        return fuel + " engine";
    }

    //this is my personal tester
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 10.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
        myEngine.refuel();
        System.out.println(myEngine.getCurrentFuel());
        System.out.println(myEngine);
    }
}
