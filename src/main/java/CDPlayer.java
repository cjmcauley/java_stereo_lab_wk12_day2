public class CDPlayer extends Stereo implements IPlay {

    private int noOfCDs;

    public CDPlayer(String make, String model, int noOfCDs) {
        super(make, model);
        this.noOfCDs = noOfCDs;
    }

    public int getNoOfCDs() {
        return noOfCDs;
    }

    public void setNoOfCDs(int noOfCDs) {
        this.noOfCDs = noOfCDs;
    }

    public String play() {
        return "playing";
    }
}
