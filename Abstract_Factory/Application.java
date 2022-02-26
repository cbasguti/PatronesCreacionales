package Abstract_Factory;

import Abstract_Factory.Doors.Door;
import Abstract_Factory.MazeFactory.Maze;
import Abstract_Factory.Walls.Wall;

public class Application {
    private Door door;
    private Wall wall;

    public Application(Maze factory) {
        door = factory.createDoor();
        wall = factory.createWall();
    }

    public void print() {
        door.setMaterial();
        wall.setMaterial();
    }
}
