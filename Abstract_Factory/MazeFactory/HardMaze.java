package Abstract_Factory.MazeFactory;

import Abstract_Factory.Doors.*;
import Abstract_Factory.Walls.*;

public class HardMaze implements Maze{
    @Override
    public Door createDoor() {
        return new MetalDoor();
    }
    @Override
    public Wall createWall() {
        return new MetalWall();
    }
}
