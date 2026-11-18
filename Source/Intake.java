package Source;
public class Intake implements Loggable, Resettable{
    private Motor motor1;
    private Motor motor2;
    double angle;

    public Intake() { 
        motor1 = new Motor("Spinner"); 
        motor2 = new Motor("Deployer");
    }


    public void setAngle(double angle) {
        if (angle >= 0 && angle <= 90) {
            this.angle = angle;
        } else {
            System.out.println("Angle must be between 0 and 90");
        }
    }
    public void intake() { motor1.setSpeed(50); }
    public void outtake() { motor1.setSpeed(-50); }
    public void stop() { 
        motor1.stop();
        motor2.stop();

     }
    public void printStatus() { motor1.printStatus(); }

    public void deploy() {

        motor2.setSpeed(50);
    }
    public void retract() {
        
        motor2.setSpeed(-50);
    }

    public void reset(){
        motor1.setSpeed(0);
        motor2.setSpeed(0);
        this.angle = 0;
    }

}
