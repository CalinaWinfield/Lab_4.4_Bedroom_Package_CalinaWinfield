package OOP.Bedroom;

public class MyBedroom {
    public static void main(String[] args) {
        //public Bedroom (Wall w1, Wall w2, Wall w3, Wall w4, Floor floor, Ceiling ceiling,
        //Window window, Door door, Ventilation airVent, Light light,
        //Outlet outlet, Bed bed, Desk desk, Dresser dresser, Rug rug)

        Bedroom lina = new Bedroom(new Wall(new WallSize(96, 140), "White"), new Wall(new WallSize(96, 140), "White"),
                new Wall(new WallSize(96, 200), "White"), new Wall(new WallSize(96, 200), "Grey"),
                new Floor(true, new Size(20, 20)), new Ceiling("Blue", new Size(20, 20), true),
                new Window(1), new Door(true, "Brown"), new Ventilation(2),
                new Light(true, false, 4), new Outlet(4), new Bed("King", 5, true),
                new Desk(new Size(36,16), true, "Brown"), new Dresser(2, true),
                new Rug(new Size(60,72), "Black", true));



        Wall w1 = new Wall(new WallSize(96, 140), "White");
        Wall w2 = new Wall(new WallSize(96, 140), "White");
        Wall w3 = new Wall(new WallSize(96, 200), "White");
        Wall w4 = new Wall(new WallSize(96, 200), "Grey");
        Size floorSize = new Size(25,25);
        Size ceilingSize = new Size(25,25);

        Floor floor = new Floor(true, floorSize);
        Ceiling ceiling = new Ceiling("Grey", ceilingSize, true);
        Window window = new Window(1);
        Door door = new Door(true, "Brown");
        Ventilation airVent = new Ventilation(2);
        Light light = new Light(true, false, 4);
        Outlet outlet = new Outlet(4);
        Bed bed = new Bed("Queen",4,true);
        Desk desk = new Desk(new Size(36,16), true, "Brown");
        Dresser dresser = new Dresser(2, true);
        Rug rug = new Rug(new Size(60,72), "Black", true);

        Bedroom calina = new Bedroom(w1, w2, w3, w4, floor, ceiling, window, door, airVent, light, outlet, bed, desk, dresser, rug);

        System.out.println("We built " + Bedroom.numberOfBedroom + " bedrooms.");

        calina.make();
        calina.makeBed();
        bed.make();


    }
}
