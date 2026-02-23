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
            return true;
        }
        return false;
    }

    public Boolean removePassenger(Passenger p){
        int index = passengerList.indexOf(p);
        if(index != -1){
            passengerList.remove(index);
            return true;
        }
        return false;
    } 

    public void printManifest(){
        if (passengerList.size() > 0){
            for(int i = 0; i < passengerList.size(); i++){
                System.out.println(passengerList.get(i));
            }
        }
        System.out.println("This car is EMPTY.");
    }
}