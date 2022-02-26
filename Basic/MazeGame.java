package Basic;
import java.util.List;

public class MazeGame {
    public MazeGame(){} 
    
    public Maze createMaze(){
        Maze aMaze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Door theDoor = new Door(r1, r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.SetSide(Direction.North, new Wall());
        r1.SetSide(Direction.East, theDoor);
        r1.SetSide(Direction.South, new Wall());
        r1.SetSide(Direction.West, new Wall());
        
        r2.SetSide(Direction.North, new Wall());
        r2.SetSide(Direction.East, new Wall());
        r2.SetSide(Direction.South, new Wall());
        r2.SetSide(Direction.West, theDoor);

        return aMaze;
    }

    public void print(Maze aMaze){
        List<Room> roomsMaze = aMaze.getRooms();
        int j = 1;
        for (Room room : roomsMaze) {
            System.out.println("Room " + j);
            for (int i = 0; i < room.GetDirections().size(); i++){
                System.out.print(room.GetDirections().get(i));
                System.out.print(room.GetElements().get(i));
                System.out.println();
            }
            System.out.println();
        }
    }
}
