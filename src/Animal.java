public abstract class Animal {
    private String name;
    private int energy;

    public Animal(String name, int energy){
        this.name = name;
        this.energy = energy;
    }

    public String getName(){
        return name;
    }

    public int getEnergy(){
        return energy;
    }

    public boolean isActive(){
        return energy > 0;
    }

    public abstract int attack();

    public String toString(){
        return name + " | energy: " + energy;
    }


}
