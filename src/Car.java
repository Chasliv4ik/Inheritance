
public class Car extends Vehicle {
    int belt;
    int foglight;

    public Car(int wheel, int height, int width, int place, int belt, int foglight) {
        super(wheel, height, width, place);
        this.belt = belt;
        this.foglight = foglight;
    }
}
