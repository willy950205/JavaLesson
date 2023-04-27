package lambda;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    public static void main(String[] args) {

        User user1 = new User("몰입맨", 10, 3000);
        User user2 = new User("코딩맨", 20, 4000);
        User user3 = new User("코딩걸", 15, 3500);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        System.out.println("user name 출력");
        userList.stream().map(u -> u.getName()).forEach(u -> System.out.println(u));
        // 몰입맨 코딩맨 코딩걸

        System.out.println("user power 합계 출력");
        System.out.println(userList.stream().mapToInt(u -> u.getPower()).sum());
        // 10500

        System.out.println("user level 15 이상 출력");
        userList.stream().filter(u -> u.getLevel() >= 15).map(u -> u.getName()).sorted()
                .forEach(u -> System.out.println(u));
        // 코딩걸 코딩맨
    }
}
