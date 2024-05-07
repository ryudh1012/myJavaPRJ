class Rabbit4 {
    private String shape;
    private int xPos;
    private int yPos;

    void setPosition(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
}
public class Code07_12 {
    public static void main(String[] args){
        Rabbit4 rabbit = new Rabbit4();

        rabbit.xPos = 100;
        rabbit.setPosition(100, 200);
    }
}
