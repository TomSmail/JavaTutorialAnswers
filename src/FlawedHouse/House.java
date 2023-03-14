package FlawedHouse;

// Set floor size should set area and not be public as then anyone can edit the floor size of the room,
// when it should only be dependent of the floor size
public class House {

  private final Rectangle floorSize;
  private int floorArea;

  public House(Rectangle floorSize) {
    this.floorSize = floorSize;
    setFloorArea(floorSize);
  }

  public Rectangle getFloorSize() {
    return floorSize;
  }

  private void setFloorArea(Rectangle floorSize) {
    this.floorArea = floorSize.getWidth() * floorSize.getHeight();
  }

  public int getFloorArea() {
    return floorArea;
  }

}
