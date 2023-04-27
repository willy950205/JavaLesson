package generics.fruits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Box<T extends Fruit> {

    List<T> box = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();

    void add(T t) {
        this.box.add(t);
        System.out.println(t.name() + "가 박스에 담겼습니다.");
        System.out.println("************");
        t.color();
        t.smell();
        System.out.println("************");
        map.put(t.name(), map.getOrDefault(t.name(), 0) + 1);
    }

    void state() {
        System.out.println("************");
        for (String name : map.keySet()) {
            System.out.println(name + "는 " + map.get(name) + "개");
        }
        System.out.println("들어있습니다.");
        System.out.println("************");
    }

    void printFruitsAmount() {
        System.out.println("************");
        System.out.println("총 " + box.size() + "개 담겨있습니다.");
        System.out.println("************");
    }
}
