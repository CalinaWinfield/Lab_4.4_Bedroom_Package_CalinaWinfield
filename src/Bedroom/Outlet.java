package OOP.Bedroom;

public class Outlet {
    private int numOfOutlets;

    public Outlet(int numOfOutlets) {
        this.numOfOutlets = numOfOutlets;
    }

    public int getNumOfOutlets() {
        return numOfOutlets;
    }

    public void setNumOfOutlets(int numOfOutlets) {
        this.numOfOutlets = numOfOutlets;
    }

    public String toString(){
        return String.format("Number of outlets: %s",numOfOutlets);
    }
}
