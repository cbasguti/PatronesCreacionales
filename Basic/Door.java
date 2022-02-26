package Basic;
public class Door extends MapSite{
    private Room room1;
    private Room room2;
    private boolean isOpen;

    public Door(Room room1, Room room2){
        this.room1 = room1;
        this.room2 = room2;
        this.isOpen = false;
    }

    public Room OtherSideRoom(Room actualRoom){
        if (actualRoom == this.room1){
            return this.room2;
        } else {
            return this.room1;
        }
    }

    public void Enter(){
        this.isOpen = true;
        // TO DO
    };
}
