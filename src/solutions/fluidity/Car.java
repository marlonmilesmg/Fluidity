package solutions.fluidity;

public class Car {


    private int cargoSpace = 0;
    private VehicleType vehicleType;
    private Stats stats = new Stats();
    private ServiceVehicle serviceVehicle = new ServiceVehicle();
    private StartVehicle startVehicle = new StartVehicle();
    private LoadVehicle loadVehicle = new LoadVehicle();

    public Car(VehicleType vehicleType, int cargoLoad) {
        if (vehicleType == null){
            throw new IllegalArgumentException("Vehicle type must be specified");
        }
        if(cargoLoad < 0 ){
            throw new RuntimeException("Cargo load must be greater or equal to 0. Entered cargo load is: " + cargoLoad + "kgs");
        }
        this.vehicleType = vehicleType;
        serviceVehicle.changeOil();
        serviceVehicle.fillUpPetrol();
        loadVehicle.addCargo(cargoLoad);
        startVehicle.drive();
        stats.printStats();
    }

    private class StartVehicle {
        public void drive() {
            //implementation hidden
            System.out.println("Driving the car");
        }
    }

    private class LoadVehicle {
        public void addCargo(int kgs) {

            switch (vehicleType){
                case CAR:
                case ELECTRIC_CAR:
                    if (kgs > 500) {
                        throw new IllegalArgumentException("Too heavy. The vehicle can only carry up to 500kgs. Attempted to load " + kgs + "kgs");
                    }
                    break;
                case TRUCK:
                    if (kgs > 18000) {
                        throw new IllegalArgumentException("Too heavy. The truck can only carry up to 18000kgs. Attempted to load " + kgs + "kgs");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Invalid vehicle type.");
            }
            cargoSpace = kgs;
        }
    }

    private class ServiceVehicle {
        public void fillUpPetrol() {
            //implementation hidden
            System.out.println("Filling up petrol.");
        }

        public void changeOil() {
            //implementation hidden
            System.out.println("Changing the oil.");
        }
    }

    private class Stats {
        public void printStats() {
            //implementation hidden
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Cargo space loaded: " + cargoSpace + "kgs");
        }
    }

}