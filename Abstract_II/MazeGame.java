package Abstract_II;

import Basic.Maze;
import Basic.Room;
import Basic.Direction;
import Basic.Door;
import Abstract_II.Factories.MazeFactory;

public class MazeGame {
    private Maze aMaze;

    public Maze CreateMaze(MazeFactory factory){
        Room r1, r2;
        Door theDoor;
        r1 = factory.createRoom(1);
        r2 = factory.createRoom(2);
        theDoor = factory.createDoor(r1, r2);
        aMaze = factory.makeMaze();

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.SetSide(Direction.East, theDoor);
        r2.SetSide(Direction.West, theDoor);

        return aMaze;
    }

    public void setMaze(Maze aMaze){
        this.aMaze = aMaze;
    }

    public void print(){
        System.out.println("Se consiguio crear!");
    }
}
