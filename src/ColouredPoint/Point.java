package ColouredPoint;

public class Point {
    private final int x, y, z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point getOrigin() {
        return new Point(0, 0, 0);
    }

    public double findDistanceBetween(Point other) {
        double answer = Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.z - z, 2) + Math.pow(other.z - z, 2) );
        return answer;
    }

    public double getMagnitude() {
        return findDistanceBetween(getOrigin());
    }

    @Override
    public String toString() {
        return ("Point: ( " + x + ", " + y + ", " + z + " )");
    }


}
