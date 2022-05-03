package Parking;
import java.util.Stack;
public class Parking {
    Stack <Integer> driveway = new Stack <>();
    Stack <Integer> street = new Stack <>();
    public void removeCar(int removal){
        if (driveway.peek() != removal*-1 && !driveway.isEmpty()) {
            do {
                int top = driveway.pop();
                street.push(top);
            } while (driveway.peek() != removal*-1 && !driveway.isEmpty());
            int top2 = driveway.pop();
            street.push(top2);

        }
    }
    public void addCar(int added){
        driveway.push(added);
    }
    public Stack getDriveway(){
        return driveway;
    }
    public Stack getStreet(){
        return street;
    }
}
