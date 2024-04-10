package OOP.Bedroom;

public class Dresser {
    private int numOfDressers;
    private boolean isWood;

    public Dresser(int numOfDressers, boolean isWood) {
        this.numOfDressers = numOfDressers;
        this.isWood = isWood;
    }

    public int getNumOfDressers() {
        return numOfDressers;
    }

    public void setNumOfDressers(int numOfDressers) {
        this.numOfDressers = numOfDressers;
    }

    public boolean isWood() {
        return isWood;
    }

    public void setWood(boolean wood) {
        isWood = wood;
    }

    public String toString(){
        String result = "";
        if(isWood){
            result = "The dresser is wooden.";
        }
        else result = "The door is not wooden.";
        return String.format("Dressers: %s\nIs it wooden?: %s\n",numOfDressers, isWood);
    }
}
