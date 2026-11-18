package Source;

public class Climber extends Mechanism implements Loggable, Resettable{

    public Climber() {
        super("Climber");
    }
    double motorConstant = 0.02;
    Motor motor1;
    double minPosition = 0;
    double maxPosition = 5;

    @Override
    public void setPosition(double position) {
        if (position <= maxPosition && position >= minPosition) {
            this.position = position;
        } else {
            System.out.println("Invalid position. Must be between 0 and 5");
        }
    }

    @Override
    public void printStatus() {
        System.out.println(position);
    }

    public void extendArm() {
        motor1.setSpeed(50);
    }

    public void retractArm() {
        motor1.setSpeed(-50);
    }

    public void reset(){
        this.position = 0;
    }
    
    @Override 
    public void update(){
        if (position <= maxPosition && position >= minPosition)
        this.position = position + motor1.getSpeed()*motorConstant;
    }

    
}
