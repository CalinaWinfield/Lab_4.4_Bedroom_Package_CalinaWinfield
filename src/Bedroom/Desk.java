package OOP.Bedroom;

public class Desk {

    private Size size;
    private boolean isWood;
    private String color;

    public Desk(Size size, boolean isWood, String color) {
        this.size = size;
        this.isWood = isWood;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isWood() {
        return isWood;
    }

    public void setWood(boolean wood) {
        isWood = wood;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        String result = "";
        if(isWood){
            result = "The desk is made of wood.";
        }
        else result = "The desk is not made of wood.";
        return String.format("Size of Desk: %s\nIs it made of wood?: %s\nColor: %s\n",size, isWood, color);
    }
}
