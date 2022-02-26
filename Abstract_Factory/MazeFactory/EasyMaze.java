package Abstract_Factory.MazeFactory;

import Abstract_Factory.Doors.*;
import Abstract_Factory.Walls.*;

public class EasyMaze implements Maze{
    @Override
    public Door createDoor() {
        return new CrystalDoor();
    }
    @Override
    public Wall createWall() {
        return new CrystalWall();
    }
}
