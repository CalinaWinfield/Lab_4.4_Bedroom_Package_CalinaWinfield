package OOP.Bedroom;

public class Rug {
    private Size size;
    private String color;
    private boolean hasPattern;

    public Rug(Size size, String color, boolean hasPattern) {
        this.size = size;
        this.color = color;
        this.hasPattern = hasPattern;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasPattern() {
        return hasPattern;
    }

    public void setHasPattern(boolean hasPattern) {
        this.hasPattern = hasPattern;
    }

    public String toString(){
        String result = "";
        if(hasPattern){
            result = "The rug has a pattern.";
        }
        else result = "The rug doesn't have a pattern.";
        return String.format("Size of Rug: %s\nColor: %s\nDoes it have a pattern?: %s\n",size, color, hasPattern);
    }
}
