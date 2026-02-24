import java.util.ArrayList;

public class Train {

    /**
     * All private atributes
     */
    private Engine theEngine;
    private ArrayList <Car> cars;

    /**
     * Train constructor
     * @param fuelType type of fuel for engine of train
     * @param currentFuelLevel current fuel level of engine in train
     * @param fuelCapacity fuel capacity of the engine for this train
     * @param nCars number of cars attached to the train
     * @param passengerCapacity capacity of ALL cars on train
     */
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity){
        this.theEngine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        this.cars = new ArrayList <Car>();
            for(int i = 0; i < nCars; i++){
                this.cars.add(new Car(passengerCapacity));
            }
    }

    /**
     * Getter for the engine
     * @return Engine toString
     */
    public Engine getEngine(){
        return theEngine;
    }

    /**
     * getter for one specific car on the train
     * @return one specic car's toString
     */
    public Car getCar(int i){
        return cars.get(i);
    }

    /**
     * finds the max capacity of a car
     * @return maximum capacity of one car
     */
    public int getMaxCapacity(){
        return cars.get(0).getCapacity();
    }

    /**
     * finds the amount of seats available on the train
     * @return number of all seats on train available
     */
    public int seatsRemaining(){
        int seats = 0;
        for(int i = 0; i < cars.size(); i++){
            seats = seats + cars.get(i).seatsRemaining();
        }
        return seats;
    }

    /**
     * prints out a list of each passenger on board
     */
    public void printManifest(){
        for(int i = 0; i < cars.size(); i++){
            cars.get(i).printManifest();
        }
    }

    //personal tester
    public static void main(String[] args){
        Train thomas = new Train(FuelType.ELECTRIC, 50.0, 55.0, 3, 5);
        System.out.println(thomas.getEngine());
        System.out.println(thomas.getCar(1));
        System.out.println(thomas.getMaxCapacity());
        System.out.println(thomas.seatsRemaining());
        thomas.printManifest();
    }
}
