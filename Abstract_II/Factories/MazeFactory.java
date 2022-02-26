package Abstract_II.Factories;

import Basic.*;

public interface MazeFactory {
    Room createRoom(int roomID);
    Door createDoor(Room r1, Room r2);
    Wall createWall();
    Maze makeMaze();
}
