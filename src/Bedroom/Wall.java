package OOP.Bedroom;

public class Wall {

    private WallSize size;
    private String color;

    public Wall(WallSize size, String color) {
        this.size = size;
        this.color = color;
    }

    public WallSize getSize() {
        return size;
    }

    public void setSize(WallSize size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return String.format("Area of wall: %s\nColor: %s\n",size, color);
    }
}
