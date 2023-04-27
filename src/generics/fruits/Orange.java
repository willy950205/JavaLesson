package generics.fruits;

public class Orange extends Fruit{

    private String name = "오랜지";

    @Override
    String name(){
        return this.name;
    }

    @Override
    void taste() {
        System.out.println("오랜지맛이 납니다!!");
    }

    @Override
    void smell() {
        System.out.println("오랜지향이 아주 좋네요!!");
    }

    @Override
    void color() {
        System.out.println("오랜지는 오랜지 색입니다.");
    }
}
