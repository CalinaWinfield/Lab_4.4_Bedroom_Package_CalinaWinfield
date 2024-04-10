package Bedroom;

public class Door {
    private boolean isWood;
    private String color;

    public Door(boolean isWood, String color) {
        this.isWood = isWood;
        this.color = color;
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
            result = "The door is wooden.";
        }
        else result = "The door is not wooden.";
        return String.format("Is it made of wood?: %s\nColor: %s\n",isWood, color);
    }
}
