class Rabbit3 {
    String shape;
    int xPos;
    int yPos;

    Rabbit3() {
        shape = "토끼";
    }

    void setPosition(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;

        }
    }
    public class Code07_10 {
    public static void main(String[] args){
        Rabbit3 rabbit = new Rabbit3();

        System.out.println("토끼 객체의 기본 모양은 [" + rabbit.shape + "] 입니다.");
    }
}
