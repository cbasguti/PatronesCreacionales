package Abstract_II.Doors;

import Basic.Room;
import Basic.Door;

public class EasyDoor extends Door {
    private String material;

    public EasyDoor(Room r1, Room r2){
        super(r1, r2);
        this.material = "Glass";
    }

    public void print(){
        System.out.println("Esta puerta está hecha de: " + material);
    }
}
