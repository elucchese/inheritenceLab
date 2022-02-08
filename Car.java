public class Car extends MotorVehicle{
    public static int airbags = 6;

    public static void start() {
        running = true;
        System.out.println("The vehicle has started.");
        System.out.println("Running:"+ running);
        System.out.println("Airbags:"+ airbags);
        System.out.println("Type of vehicle: Car");
    }

    public static void stop() {
       running = false;
        System.out.println("The vehicle has stopped.");
        System.out.println("Running:"+ running);
        System.out.println("Airbags:"+ airbags);
        System.out.println("Type of vehicle: Car ");

    }
}
