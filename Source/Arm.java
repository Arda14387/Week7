package Source;
// GUIDED IN CLASS: Use this starter to demonstrate extends, super, and @Override.
public class Arm extends Mechanism {

    Motor motor1;
    double motorConstant = 0.4;

    public Arm() {
        super("Arm");
    }

    @Override 
    public void setPosition(double position) {
        if (position >= 0 && position <= 180) {
            this.position = position;
        } else {
            System.out.println("Error, enter a position between 0 and 180");
        }
    }

    public void moveArm(){
        motor1.setSpeed(50);
    }

    public void retractArm(){
        motor1.setSpeed(-50);
    }

    @Override
    public void update(){
        if (position >= 0 && position <= 180){
            this.position = position + motor1.getSpeed()*motorConstant;
        }
    }



    // TODO (together): Override setPosition(double position).
    // Arm angles must stay between 0 and 180 degrees.
    // For valid positions, call super.setPosition(position).
    // For invalid positions, print an error and leave position unchanged.
}
