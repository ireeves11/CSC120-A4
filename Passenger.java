public class Passenger {
    
    /**
     * all private atributes
     */
    private String name;

    /**
     * Passenger constructor
     * @param name name of the passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * adds this passenger to car c if possible
     * @param c car passenger is attempting to board
     */
    public void boardCar(Car c){
        c.addPassenger(this);
    }

    /**
     * removes this passenger from car c if possible
     * @param c car passenger is attempting to leave
     */
    public void getOffCar(Car c){
        c.removePassenger(this);
    }

    /**
     * toString so that I could clean up some of the other
     * things I print about Passenger
     */
    public String toString(){
        return name;
    }

    //personal tester
    public static void main(String[] args){
        Passenger anne = new Passenger("Anne");
        Car car = new Car(10);
        Car no = new Car(0);

        anne.boardCar(car);
        System.out.println(car.seatsRemaining());
        anne.getOffCar(car);
        System.out.println(car.seatsRemaining());

        anne.getOffCar(car);
        System.out.println(car.seatsRemaining());
        anne.boardCar(no);
    }
}
