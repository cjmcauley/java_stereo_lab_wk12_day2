public class RecordPlayer extends Stereo implements IPlay {

    private int speed;

    public RecordPlayer(String make, String model, int speed) {
        super(make, model);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String play() {
        return "playing";
    }

}
