package Abstract_II.Rooms;

import Abstract_II.Walls.EasyWall;
import Basic.Direction;
import Basic.Room;

public class EasyRoom extends Room {
    private String material;

    public EasyRoom(int roomID){
        super(roomID);
        this.material = "Glass";
        this.SetSide(Direction.North, new EasyWall());
        this.SetSide(Direction.East,  new EasyWall());
        this.SetSide(Direction.South, new EasyWall());
        this.SetSide(Direction.West,  new EasyWall());
    }

    public void print(){
        System.out.println("Esta habitación está hecha de: " + material);
    }
}
