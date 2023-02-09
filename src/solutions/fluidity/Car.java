package solutions.fluidity;

public class Car {


    private int cargoSpace = 0;
    private VehicleType vehicleType;

    public Car(VehicleType vehicleType) {
        if (vehicleType == null){
            throw new IllegalArgumentException("Vehicle type must be specified");
        }
        this.vehicleType = vehicleType;
    }

    public void drive() {
        //implementation hidden
        System.out.println("Driving the car");
    }

    public void addCargo(int kgs) {

        switch (vehicleType){
            case CAR:
            case ELECTRIC_CAR:
                if (kgs > 500) {
                    throw new IllegalArgumentException("Too heavy. The vehicle can only carry up to 500kgs.");
                }
                break;
            case TRUCK:
                if (kgs > 18000) {
                    throw new IllegalArgumentException("Too heavy. The truck can only carry up to 18000kgs.");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid vehicle type.");
        }
        this.cargoSpace = kgs;
    }

    public void fillUpPetrol() {
        //implementation hidden
        System.out.println("Filling up petrol.");
    }

    public void changeOil() {
        //implementation hidden
        System.out.println("Changing the oil.");
    }

    public void printStats() {
        //implementation hidden
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Cargo space: " + cargoSpace + "kgs");
    }

}