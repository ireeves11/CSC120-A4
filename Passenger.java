public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c){
        c.addPassenger(this);
    }

    public void getOffCar(Car c){
        c.removePassenger(this);
    }

    public String toString(){
        return name;
    }

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
