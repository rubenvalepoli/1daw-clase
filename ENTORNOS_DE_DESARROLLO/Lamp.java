package exam2;

public class Lamp {

    public boolean turnedOff;
    double consumption;
    boolean turnedOn;

    public Lamp(double consumption) {
        this.consumption = consumption;
    }

    public Lamp(double consumption, boolean turnedOn) {
        this.consumption = consumption;
        this.turnedOn = turnedOn;
    }

    public boolean isTurnedOff() {
        return turnedOff;
    }

    public void setTurnedOff(boolean turnedOff) {
        this.turnedOff = turnedOff;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void turnedOn() {
        turnedOn=true;
    }

    public void turnedOff() {
        turnedOff=false;
    }

    public void toggle() {
        turnedOn= !turnedOn;
    }

    public double consumption(double segundo) {

        if(!turnedOn){
            return 0;
        }
        return consumption*segundo/3600;
    }
}
