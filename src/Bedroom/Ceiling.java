package OOP.Bedroom;

public class Ceiling {

    private String color;
    private Size size; //length and width
    private boolean isHigh;


    public Ceiling(String color, Size size, boolean isHigh) {
        this.color = color;
        this.size = size;
        this.isHigh = isHigh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isHigh() {
        return isHigh;
    }

    public void setHigh(boolean high) {
        isHigh = high;
    }

    public String toString(){
        String result = "";
        if(isHigh){
            result = "The ceiling is high.";
        }
        else result = "The ceiling is not high.";
        return String.format("Color: %s\nArea of Ceiling: %s\nHeight %s\n",color, size, isHigh);
    }
}
