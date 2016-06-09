
public class BTR extends Vehicle {
    int guns;
    float armor;

    public BTR(int wheel, int height, int width, int place, int guns, float armor) {
        super(wheel, height, width, place);
        this.guns = guns;
        this.armor = armor;
    }
}
