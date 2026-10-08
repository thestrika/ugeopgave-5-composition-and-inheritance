import java.util.ArrayList;

public class Main {

    public static void main(String[] args){


        //Opgave 1
        Building building = new Building("Building");

        Room room1 = new Room("Room 1");
        Room room2 = new Room("Room 2");
        Room room3 = new Room("Room 3");

        room1.addLamp(new Lamp(10));
        room1.addLamp(new Lamp(12));
        room1.addWindow(new Window(30, 40));

        room2.addLamp(new Lamp(8));
        room2.addLamp(new Lamp(14));
        room2.addLamp(new Lamp(7));
        room2.addWindow(new Window(50, 30));

        room3.addLamp(new Lamp(6));
        room3.addLamp(new Lamp(16));
        room3.addWindow(new Window(60, 60));

        building.addRoom(room1);
        building.addRoom(room2);
        building.addRoom(room3);


        System.out.println("building:");
        System.out.println("Total watt: " + building.getTotalWatt());
        System.out.println("Lamps amount: " + building.getTotalLampCount());








        //Opgave 2
        Lion lion = new Lion("Lion", 60);
        Wolf wolf = new Wolf("Wolf", 40);
        Rabbit rabbit = new Rabbit("Rabbit", 120);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(wolf);
        animals.add(rabbit);

        Contest game1 = new Contest(wolf, rabbit);
        game1.playRound();
        game1.playRound();
        game1.playRound();
        game1.playRound();
        game1.playRound();
        game1.playRound();
        game1.playRound();
        game1.playRound();
        game1.playRound();
        game1.playRound();
        game1.playRound();
        game1.playRound();
        game1.playRound();
        game1.playRound();
        game1.playRound();
        game1.playRound();




    }

}
