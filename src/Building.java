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
        int sum = 0;

        for(Room room : rooms){
            sum += room.getLampCount();
        }
        return sum;
    }

    public int getTotalWatt(){
        int wattSum = 0;

        for(Room room : rooms){
            wattSum += room.getTotalWatt();
        }
        return wattSum;
    }


}
