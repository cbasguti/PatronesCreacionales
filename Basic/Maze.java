package Basic;
import java.util.ArrayList;
import java.util.List;

public class Maze {
    private List<Room> rooms;

    public Maze(){
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    public int getRoomN(){
        return this.rooms.size();
    }

    public List<Room> getRooms(){
        return this.rooms;
    }
}
