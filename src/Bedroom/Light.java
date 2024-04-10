package OOP.Bedroom;

public class Light {
    private boolean hasLamp;
    private boolean attachedFan;
    private int numOfLights;

    public Light(boolean hasLamp, boolean attachedFan, int numOfLights) {
        this.hasLamp = hasLamp;
        this.attachedFan = attachedFan;
        this.numOfLights = numOfLights;
    }

    public boolean isHasLamp() {
        return hasLamp;
    }

    public void setHasLamp(boolean hasLamp) {
        this.hasLamp = hasLamp;
    }

    public boolean isAttachedFan() {
        return attachedFan;
    }

    public void setAttachedFan(boolean attachedFan) {
        this.attachedFan = attachedFan;
    }

    public int getNumOfLights() {
        return numOfLights;
    }

    public void setNumOfLights(int numOfLights) {
        this.numOfLights = numOfLights;
    }

    public String toString(){
        String result = "";
        if(hasLamp){
            result = "One (or more) of the lights is a lamp.";
        }
        else result = "One (or more) of the lights is not a lamp.";

        if(attachedFan){
            result = "There is a ceiling fan w/ the light.";
        }
        else result = "There is no ceiling fan w/ the light.";
        return String.format("Is there a lamp?: %s\nIs there a ceiling fan?: %s\nNumber of Lights: %s",hasLamp, attachedFan, numOfLights);
    }
}
