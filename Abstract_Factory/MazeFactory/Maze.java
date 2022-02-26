package Abstract_Factory.MazeFactory;

import Abstract_Factory.Doors.*;
import Abstract_Factory.Walls.*;

// Esta es la Fábrica Abstracta

public interface Maze {
    Door createDoor();
    Wall createWall();
}
