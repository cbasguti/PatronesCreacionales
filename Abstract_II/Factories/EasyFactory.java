package Abstract_II.Factories;

import Abstract_II.Doors.EasyDoor;
import Abstract_II.Rooms.EasyRoom;
import Abstract_II.Walls.EasyWall;
import Basic.*;

public class EasyFactory implements MazeFactory{
     
    @Override
    public Room createRoom(int roomID){
        EasyRoom a = new EasyRoom(roomID);
        a.print();
        return a;
    }
    @Override
    public Door createDoor(Room r1, Room r2){
        return new EasyDoor(r1, r2);
    }
    @Override
    public Wall createWall(){
        return new EasyWall();
    }
    @Override
    public Maze makeMaze(){
        return new Maze();
    }
    
}
