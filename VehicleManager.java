
import java.util.Scanner;
public class VehicleManager extends MotorVehicle {

    // public String Motorcycle[];

    //public int[] Car;

    public static void run() {
        Motorcycle oMotorcycle1 = new Motorcycle();
        Motorcycle oMotorcycle2 = new Motorcycle();
        Motorcycle oMotorcycle3 = new Motorcycle();

        oMotorcycle1.model = "Yamaha";
        oMotorcycle2.model = "Harley Davidson";
        oMotorcycle3.model = "Honda";
        //oMotorcycle1.running=false; does not work 
       //oMotorcycle2.running=false;
       // oMotorcycle3.running=false;

        Car oCar1 = new Car();
        Car oCar2 = new Car();
        Car oCar3 = new Car();


        oCar1.model = "Ford";
        oCar2.model = "Chevrolet";
        oCar3.model = "Toyota";
        //oCar1.running=false;
       // oCar2.running=false;
        //oCar3.running=false;

        Scanner input = new Scanner(System.in);
        System.out.println("Choose a car to start: ");
        System.out.println("1. Ford");
        System.out.println("2. Chevrolet");
        System.out.println("3. Toyota");
        int numC = input.nextInt();

        Car[] aCar = new Car[3];
        aCar[0] = oCar1;
        aCar[1] = oCar2;
        aCar[2] = oCar3;
        System.out.println(aCar[numC - 1].model);
        Car.start();
        System.out.println("Choose a car to stop: ");
        int numStop = input.nextInt();
        System.out.println(aCar[numStop - 1].model);
        Car.stop();


        System.out.println("Choose a Motorcycle to start: ");
        System.out.println("1. Yamaha");
        System.out.println("2. Harley Davidson");
        System.out.println("3. Honda");
        int numM = input.nextInt();

        Motorcycle[] aMotorcycle = new Motorcycle[3];
        aMotorcycle[0] = oMotorcycle1;
        aMotorcycle[1] = oMotorcycle2;
        aMotorcycle[2] = oMotorcycle3;
        System.out.println(aMotorcycle[numM - 1].model);
        Motorcycle.start();
        System.out.println("Choose a motorcycle to stop: ");
        int numStopMotor = input.nextInt();
        System.out.println(aMotorcycle[numStopMotor - 1].model);
        Motorcycle.stop();


        System.out.println("List of Cars: ");
        for (int i = 0; i < aCar.length; i++) {
            System.out.print(aCar[i].model + (" ") + "\r\n");
        }
        for (int run=0; run < aCar.length; run++){
            System.out.print(aCar[run].running + (" ") + "\r\n");
        }
        System.out.println("List of Motorcycles: ");
        for (int m = 0; m < aMotorcycle.length; m++) {
            System.out.print(aMotorcycle[m].model + (" ") + "\r\n");
            }
        for (int run=0; run < aCar.length; run++){
            System.out.print(aMotorcycle[run].running + (" ") + "\r\n"); // I want to display all 6 vehicles status

            }
        }
    }





