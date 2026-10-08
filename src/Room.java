import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    public Room(String name){
        this.name = name;
        this.lamps = new ArrayList<>();
        this.windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp){
        lamps.add(lamp);
    }

    public void addWindow(Window window){
        windows.add(window);
    }

    public int getLampCount(){
        return lamps.size();
    }

    public int getTotalWatt(){
        int sum = 0;

        for(Lamp lamp : lamps){
            sum += lamp.getWatt();
        }
        return sum;
    }

    public int getTotalWindowArea(){
        int areaSum = 0;

        for(Window window : windows){
            areaSum += window.getAreaCm2();
        }

        return areaSum;
    }

    public void printRoom(){
        System.out.println("Lamp count: " + getLampCount() + " | Total watt: " + getTotalWatt() + " | Total area: " + getTotalWindowArea());
    }


}
