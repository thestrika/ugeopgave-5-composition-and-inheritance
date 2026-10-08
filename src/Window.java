public class Window {

    private int widthCm;
    private int heightCm;

    public Window(int widthCm, int heightCm){
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    public int getAreaCm2(){
        return heightCm * widthCm;
    }

    public String toString(){
        return "Height: " + heightCm + " | Width: " + widthCm;
    }

}
