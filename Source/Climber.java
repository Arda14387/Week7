package Source;

public class Climber extends Mechanism implements Loggable{

    public Climber() {
        super("Climber");
    }

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
        setPosition(maxPosition);
    }

    public void retractArm() {
        setPosition(minPosition);
    }


    
}
