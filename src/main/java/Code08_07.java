abstract class Rabbit9 {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }
}

class HouseRabbit4 extends Rabbit9 {
}
class MountainRabbit4 extends Rabbit9{

}
public class Code08_07 {
    public static void main(String[] args) {
        HouseRabbit4 hRabbit = new HouseRabbit4();
        System.out.println("집토끼 객체 생성 --");
        MountainRabbit4 mRabbit = new MountainRabbit4();
        System.out.println("산토끼 객체 생성 --");
    }

}
