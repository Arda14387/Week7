package Source;
// INDEPENDENT IN CLASS: Write the Elevator subclass here.
// 1. Extend Mechanism.
// 2. Add a constructor calling super("Elevator").
// 3. Override setPosition(double position).
//    Valid heights are 0.0 to 2.0 meters (inclusive).
// 4. Reject invalid heights without changing the current position.
//
// Start by replacing this comment with your class declaration.

public class Elevator extends Mechanism implements Loggable{

    Motor motor1;
    double motorConstant = 0.01;

    public Elevator () {
        super("Elevator");
    }

    @Override 
    public void setPosition(double position) {
        if (position >= 0 && position <= 2) {
            this.position = position;
        } else {
            System.out.println("Error, position must be between 0 and 2");
        }
    }
    

    @Override 
    public void printStatus() {
        System.out.println("Wooooo");
    }

    @Override 
    public void update(){
        if (position >= 0 && position <= 2){
            this.position = motor1.getSpeed()*motorConstant;
        }
    }
}
