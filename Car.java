import java.util.ArrayList;

public class Car {

    /**
     * all private atributes
     */
    private ArrayList <Passenger> passengerList;
    private int maxCapacity;

    /**
     * Car constructor
     * @param max the maximum capacity for the car
     */
    public Car(int max){
        this.maxCapacity = max;
        this.passengerList = new ArrayList <Passenger> (max);
    }

    /**
     * getter for maxCapacity
     * @return the max capacity
     */
    public int getCapacity(){
        return maxCapacity;
    }

    /**
     * calculates the amount of seats left in the car
     * @return the amount of seats still free in the car
     */
    public int seatsRemaining(){
        return maxCapacity - passengerList.size();
    }

    /**
     * adds a passenger to the car if possible
     * @param p the passenger attempting to be added
     * @return if the passenger was successfully added
     */
    public Boolean addPassenger(Passenger p){
        if(this.seatsRemaining()>0){
            passengerList.add(p);
            System.out.println(p + " has boarded!");
            return true;
        }
        System.out.println("Max capacity! " + p + " could not board.");
        return false;
    }

    /**
     * is possible, removes passenger p from the car
     * @param p passenger attempting to be removed from car
     * @return if passenger was successfully removed from the car
     */
    public Boolean removePassenger(Passenger p){
        int index = passengerList.indexOf(p);
        if(index != -1){
            passengerList.remove(index);
            System.out.println(p + " has been removed!");
            return true;
        }
        System.out.println(p + " could not be removed! They were never on board!");
        return false;
    } 

    /**
     * prints out the list of passengers on the car
     */
    public void printManifest(){
        if (passengerList.size() > 0){
            for(int i = 0; i < passengerList.size(); i++){
                System.out.println(passengerList.get(i));
            }
        }
        else{
            System.out.println("This car is EMPTY.");
        }
    }

    /**
     * toString to make Train method getCar() prettier
     * @return a sentance stating the max capacity and the seats remaining
     */
    public String toString(){
        return "This car has a maximum capacity of " + maxCapacity + " and " + this.seatsRemaining() + " seats available";
    }

    //personal tester
    public static void main(String[] args) {
        Passenger anne = new Passenger("Anne");
        Passenger brad = new Passenger("Brad");
        Car one = new Car(1);

        System.out.println(one.getCapacity());
        System.out.println(one.seatsRemaining());

        one.addPassenger(anne);
        one.removePassenger(brad);
        one.addPassenger(brad);
        System.out.println(one.getCapacity());
        System.out.println(one.seatsRemaining());
        one.printManifest();

        one.removePassenger(anne);
        one.printManifest();
        System.out.println(one);
    }
}