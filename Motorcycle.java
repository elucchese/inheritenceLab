
public class Motorcycle extends MotorVehicle {

    public static boolean sideCar;


    public static void start() {
       Motorcycle.running = true;
        System.out.println("The vehicle has started.");
        System.out.println("Is the vehicle running: "+ running);
        System.out.println("Does the vehicle have a sidecar: "+ sideCar);
        System.out.println("Type of vehicle: Motorcycle ");

    }

        public static void stop() {
        Motorcycle.running = false;
            System.out.println("The vehicle has stopped.");
            System.out.println("Is the vehicle running: "+ running);
            System.out.println("Does the vehicle have a sidecar: "+ sideCar);
            System.out.println("Type of vehicle: Motorcycle ");
        }


}


