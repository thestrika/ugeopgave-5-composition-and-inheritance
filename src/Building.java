import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> rooms;

    public Building(String name){
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public int getTotalLampCount(){
        
    }


}
