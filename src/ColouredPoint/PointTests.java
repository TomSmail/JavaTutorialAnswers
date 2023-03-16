package ColouredPoint;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PointTests {

    @Test
    public void checkNormalPoint() {
        Point p1 = new Point(3,3,3 );
        Point p2 = new Point(1, 1, 1);
        assertEquals(p1.findDistanceBetween(p2),3.464101, 0.001);
        assertEquals(p1.getOrigin().toString(), "Point: ( 0, 0, 0 )");
        assertEquals(p1.toString(), "Point: ( 3, 3, 3 )");
    }

    @Test
    public void checkColouredPoint() {
        Point p1 = new ColouredPoint(3,3,3, "Blue" );
        assertEquals(p1.toString(), "Point: ( 3, 3, 3 ), Colour: Blue");
    }
}
