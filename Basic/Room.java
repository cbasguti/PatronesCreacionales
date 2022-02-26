package Basic;
import java.util.ArrayList;
import java.util.List;

public class Room extends MapSite {
    private int roomID;
    private List<Direction> sides;
    private List<MapSite> element;

    public Room(int roomID){
        this.roomID = roomID;
        sides = new ArrayList<>();
        element = new ArrayList<>();
    }

    public void SetSide(Direction direction, MapSite mapSite){
       this.sides.add(direction);
       this.element.add(mapSite);
    }

    public List<Direction> GetDirections(){
        return this.sides;
    }

    public List<MapSite> GetElements(){
        return this.element;
    }

    public void Enter(){
        // TO DO
    };
}
