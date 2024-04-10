package OOP.Bedroom;

public class Bedroom {


    String name;
    Wall w1;
    Wall w2;
    Wall w3;
    Wall w4;

    Floor floor;
    Ceiling ceiling;
    Window window;
    Door door;

    Ventilation airVent;
    Light light;
    Outlet outlet;
    Bed bed;
    Desk desk;
    Dresser dresser;
    Rug rug;

    public static int numberOfBedroom;


    public Bedroom(Wall w1, Wall w2, Wall w3, Wall w4, Floor floor, Ceiling ceiling, Window window, Door door, Ventilation airVent, Light light, Outlet outlet, Bed bed, Desk desk, Dresser dresser, Rug rug){
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
        this.w4 = w4;
        this.floor = floor;
        this.ceiling = ceiling;
        this.window = window;
        this.door = door;
        this.airVent = airVent;
        this.light = light;
        this.outlet = outlet;
        this.bed = bed;
        this.desk = desk;
        this.dresser = dresser;
        this.rug = rug;

        numberOfBedroom++; //numberOfBedroom = numberOfBedroom + 1

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wall getW1() {
        return w1;
    }

    public void setW1(Wall w1) {
        this.w1 = w1;
    }

    public Wall getW2() {
        return w2;
    }

    public void setW2(Wall w2) {
        this.w2 = w2;
    }

    public Wall getW3() {
        return w3;
    }

    public void setW3(Wall w3) {
        this.w3 = w3;
    }

    public Wall getW4() {
        return w4;
    }

    public void setW4(Wall w4) {
        this.w4 = w4;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Ventilation getAirVent() {
        return airVent;
    }

    public void setAirVent(Ventilation airVent) {
        this.airVent = airVent;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public Outlet getOutlet() {
        return outlet;
    }

    public void setOutlet(Outlet outlet) {
        this.outlet = outlet;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    public Dresser getDresser() {
        return dresser;
    }

    public void setDresser(Dresser dresser) {
        this.dresser = dresser;
    }

    public Rug getRug() {
        return rug;
    }

    public void setRug(Rug rug) {
        this.rug = rug;
    }

    public void makeBed(){
        System.out.println("From Bedroom class: Making bed.");

        this.make(); //one from Bedroom class
        bed.make(); //one from Bed class
    }

    public void make(){
        straightenedSheet();
    }

    public void straightenedSheet(){
        System.out.println("From Bedroom class: straightened sheets");
    }

}
