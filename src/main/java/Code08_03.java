
class Rabbit7{
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos = x;
        this.yPos = y;

        System.out.println("xPos : " + xPos + " | yPos : " + yPos);
    }
}

class HouseRabbit2 extends Rabbit7 {
    String owner;
    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }
    @Override
    void move(int x, int y) {
        System.out.println("나는 덮어쓰기한 이동 함수입니다.");
    }
}

class MountainRabbit2 extends Rabbit7 {
    String mountain;
    void eatWildgrass(){
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Code08_03 {
    public static void main(String[] args){
        HouseRabbit2 hRabbit = new HouseRabbit2();
        MountainRabbit2 mRabbit = new MountainRabbit2();

        hRabbit.shape = "삼각형";
        hRabbit.owner = "난생이";
        hRabbit.move(100, 100);
        hRabbit.eatFeed();

        mRabbit.shape = "네모";
        mRabbit.mountain = "설악산";
        mRabbit.move(200, 200);
        mRabbit.eatWildgrass();
    }
}
