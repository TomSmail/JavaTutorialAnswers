package ColouredPoint;

public class ColouredPoint extends Point {

    String colour;

    public ColouredPoint(int x, int y, int z, String colour) {
        super(x, y, z);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return super.toString().concat(", Colour: " + colour);
    }
}
