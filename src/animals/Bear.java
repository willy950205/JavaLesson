package animals;

public class Bear extends Animal {

    @Override
    public void move() {
        System.out.println("곰이 이동합니다.");
    }

    public void biting() {
        System.out.println("곰이 베어뭅니다.");
    }

}
