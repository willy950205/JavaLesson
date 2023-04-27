package generics.fruits;

public class Apple extends Fruit{

    private String name = "사과";

    @Override
    String name(){
        return this.name;
    }

    @Override
    void taste() {
        System.out.println("사과맛이 납니다!!");
    }

    @Override
    void smell() {
        System.out.println("사과향이 아주 좋네요!!");
    }

    @Override
    void color() {
        System.out.println("아오리 사과는 밝은 초록색입니다.");
    }
}
