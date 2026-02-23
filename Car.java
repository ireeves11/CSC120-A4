import java.util.ArrayList;

public class Car {
    private ArrayList <Passenger> passengerList;
    private int maxCapacity;

    public Car(int max){
        this.maxCapacity = max;
        this.passengerList = new ArrayList <Passenger> (max);
    }

    public int getCapacity(){
        return maxCapacity;
    }

    public int seatsRemaining(){
        return maxCapacity - passengerList.size();
    }

    public Boolean addPassenger(Passenger p){
        if(this.seatsRemaining()>0){
            passengerList.add(p);
            System.out.println(p + " has boarded!");
            return true;
        }
        System.out.println("Max capacity! " + p + " could not board.");
        return false;
    }

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
    }
}