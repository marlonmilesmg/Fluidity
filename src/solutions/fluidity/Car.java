package solutions.fluidity;

public class Car {


    private int cargoSpace = 0;
    private int vehicleType = 0;

    public Car(int vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void drive() {
        //implementation hidden
    }

    public void addCargo(int kgs) {
        if (vehicleType == 0) {   //car
            if (kgs > 500) {
                throw new IllegalArgumentException("too heavy");
            }
        } else if (vehicleType == 1) {  //electric car
            if (kgs > 500) {
                throw new IllegalArgumentException("too heavy");
            }
        } else if (vehicleType == 2) {  //truck
            if (kgs > 18000) {
                throw new IllegalArgumentException("too heavy");
            }
        }
        this.cargoSpace = kgs;
    }

    public void fillUpPetrol() {
        //implementation hidden
    }

    public void changeOil() {
        //implementation hidden
    }

    public void printStats() {
        //implementation hidden
    }

}