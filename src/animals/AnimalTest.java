package animals;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        // AnimalTest test = new AnimalTest();
//        test.moveAnimal(new Human());
//        test.moveAnimal(new Tiger());
//        test.moveAnimal(new Eagle());
//        test.moveAnimal(new Bear());

        moveAnimal(new Human());
        System.out.println("==============================");
        moveAnimal(new Tiger());
        System.out.println("==============================");
        moveAnimal(new Eagle());
        System.out.println("==============================");
        moveAnimal(new Bear());
        System.out.println("==============================");

        Animal[] animalList = new Animal[4];
        animalList[0] = new Human();

        ArrayList<Animal> animals = new ArrayList<Animal>();

        // 실행결과를 적어보자
    }

    public static void moveAnimal(Animal animal)  {// 공통 기능인 moveAnimal
        animal.move();
        // 이렇게만 적어주어도 human, tiger, eagle, bear에 대한 move를 출력할 수 있으므로
        // 이 코드 한 줄이 다형성을 나타낸다고 할 수 있다.

        // if문을 통해 다운캐스팅된 animal의 메서드가 Human일 경우 human의 readBook() 메서드를 수행하도록 지정.
        if (animal instanceof Human) {// instanceof 를 통해 다운캐스팅을 해준다.
            Human human = (Human) animal;
            human.readBook();
        } else if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            tiger.Hunting();
        } else if (animal instanceof Eagle) {
            Eagle eagle = (Eagle) animal;
            eagle.flying();
        } else if (animal instanceof Bear) {
            Bear bear = (Bear) animal;
            bear.biting();
        } else {
            System.out.println("지원되지 않는 기능입니다."); // 예외 지정
        }
    }
}
