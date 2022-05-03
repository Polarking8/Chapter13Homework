package Parking;
import java.util.Scanner;
public class ParkingTester {
    public static void main (String [] args) {
        Scanner in= new Scanner (System.in);
        Parking driveways = new Parking();
        String next;
        do {
            System.out.println("Press A to add cars or R to remove, or 0 to stop the simulation");
            next = in.next();
            if(next.equals("A")||next.equals("a")){
                System.out.println("Input license plate to add: ");
                driveways.addCar(in.nextInt());
            }else if(next.equals("r")||next.equals("R")){
                System.out.println("Input license plate (as a negative) to remove from the driveway: ");
                driveways.removeCar(in.nextInt());
            }
            System.out.println("The Driveway: " + driveways.getDriveway());
            System.out.println("The Street:  " + driveways.getStreet());
        }while(!next.equals("0"));

    }
}
