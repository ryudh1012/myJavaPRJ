abstract class Rabbit10 {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }

    abstract void sleep();
}
class HouseRabbit5 extends Rabbit10{
    void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit5 extends Rabbit10 {
    void sleep(){
        System.out.println("산토끼가 굴 속에서 잠자고 있습니다.");
    }
}
public class Code08_08 {
    public static void main(String[] args){
        HouseRabbit5 hRabbit = new HouseRabbit5();
        MountainRabbit5 mRabbit = new MountainRabbit5();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}
