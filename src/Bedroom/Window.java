package OOP.Bedroom;

public class Window {
    private int numOfWindows;

    public Window(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }

    public void setNumOfWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public String toString(){
        return String.format("Number of Windows: %s", numOfWindows);
    }
}
