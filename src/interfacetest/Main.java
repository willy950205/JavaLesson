package interfacetest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> list = new ArrayList<>();

        // ---------------
        list.add(new Dog("첫번쩨 개"));
        list.add(new Cat("첫번째 고양이"));
        list.add(new Dog("두번째 개"));
        list.add(new Cat("두번째 고양이"));

        for (Animal animal : list){
            animal.name();
            animal.move();
            animal.bark();
            animal.eat();

            System.out.println("======================");
        }
    }
}