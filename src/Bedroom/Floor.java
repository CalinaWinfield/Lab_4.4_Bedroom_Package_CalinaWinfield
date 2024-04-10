package OOP.Bedroom;

public class Floor {
    private boolean hasCarpet;
    Size size;

    public Floor(boolean hasCarpet, Size size) {
        this.hasCarpet = hasCarpet;
        this.size = size;
    }

    public boolean isHasCarpet() {
        return hasCarpet;
    }

    public void setHasCarpet(boolean hasCarpet) {
        this.hasCarpet = hasCarpet;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String toString(){
        String result = "";
        if(hasCarpet){
            result = "The floor is carpet.";
        }
        else result = "The floor is not carpet.";
        return String.format("Is it carpet?: %s\nArea of floor: %s\n",hasCarpet, size);
    }
}
