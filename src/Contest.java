public class Contest {

    private Animal animal1;
    private Animal animal2;
    private static int counter;

    public Contest(Animal animal1, Animal animal2){
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.counter = 0;
    }

    public void playRound(){
        System.out.println("=================");
        if(animal2.getEnergy() > 0){
            if(animal1.isActive()){
                animal2.loseEnergy(animal1.attack());
                System.out.println(animal1.getName() + " attacks " + animal2.getName() + ". " + animal2.getName() + " has " + animal2.getEnergy() + " energy left");
            }
            else{
                System.out.println(animal1.getName() + " is dead and cannot attack opponent");
            }
        }
        else{
            System.out.println("Opponent " + animal2.getName() + " is dead, and cannot be attacked.");
        }
        System.out.println("=================");

        if(animal1.getEnergy() > 0){
            if(animal2.isActive()){
                animal1.loseEnergy(animal2.attack());
                System.out.println(animal2.getName() + " attacks " + animal1.getName() + ". " + animal1.getName() + " has " + animal1.getEnergy() + " energy left");
            }
            else{
                System.out.println(animal2.getName() + " is dead and cannot attack opponent");
            }
        }
        else{
            System.out.println("Opponent " + animal1.getName() + " is dead, and cannot be attacked.");
        }
        System.out.println("=================");

        if(animal1.getEnergy() <= 0 || animal2.getEnergy() <= 0){
            System.out.println("Winner: " + getWinner());
        }

        counter++;
    }

    public Animal getWinner(){
        if(animal1.getEnergy() > animal2.getEnergy()){
            return animal1;
        }
        else if(animal2.getEnergy() > animal1.getEnergy()){
            return animal2;
        }
        else{
            return null;
        }
    }


}
