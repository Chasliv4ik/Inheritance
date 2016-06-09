public class Airplane extends Vehicle {
    int wing;
    int Chassis;

    public Airplane(int wheel, int height, int width, int place, int wing, int chassis) {
        super(wheel, height, width, place);
        this.wing = wing;
        Chassis = chassis;
    }
}
