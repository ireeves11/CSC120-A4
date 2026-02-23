import java.util.ArrayList;

public class Train {

    private Engine theEngine;
    private ArrayList <Car> cars;

    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity){
        this.theEngine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        this.cars = new ArrayList <Car>();
            for(int i = 0; i < nCars; i++){
                this.cars.add(new Car(passengerCapacity));
            }
    }

    public Engine getEngine(){
        return theEngine;
    }

    public Car getCar(int i){
        return cars.get(i);
    }

    public int getMaxCapacity(){
        return cars.get(0).getCapacity();
    }

    public int seatsRemaining(){
        int seats = 0;
        for(int i = 0; i < cars.size(); i++){
            seats = seats + cars.get(i).seatsRemaining();
        }
        return seats;
    }

    public void printManifest(){
        for(int i = 0; i < cars.size(); i++){
            cars.get(i).printManifest();
        }
    }

    public static void main(String[] args){
        Train thomas = new Train(FuelType.ELECTRIC, 50.0, 55.0, 3, 5);
        System.out.println(thomas.getEngine());
        System.out.println(thomas.getCar(1));
        System.out.println(thomas.getMaxCapacity());
        System.out.println(thomas.seatsRemaining());
        thomas.printManifest();
    }
}
