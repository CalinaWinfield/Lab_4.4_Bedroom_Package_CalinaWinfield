package OOP.Bedroom;

public class Ventilation {
    private int numOfVents;

    public Ventilation(int numOfVents) {
        this.numOfVents = numOfVents;
    }

    public int getNumOfVents() {
        return numOfVents;
    }

    public void setNumOfVents(int numOfVents) {
        this.numOfVents = numOfVents;
    }

    public String toString(){
        return String.format("Number of vents: %s",numOfVents);
    }
}
