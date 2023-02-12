package solutions.fluidity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the cargo load you want to load in the vehicle: ");
        try(Scanner s = new Scanner(System.in)){
            String input = s.nextLine();
            if(input == null || input.trim().length() == 0){
                System.out.println("You have entered an invalid cargo load");
            }
            int load = Integer.parseInt(input);
            Car car = new Car(VehicleType.CAR, load);
        }
    }
}
