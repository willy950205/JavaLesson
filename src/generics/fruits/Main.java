package generics.fruits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Box<Fruit> box = new Box<>();
        Scanner sc = new Scanner(System.in);

        int appleCnt = 10;
        int orangeCnt = 10;
        boolean check = true;

        System.out.println("오랜지 10개");
        System.out.println("사과 10개가 있습니다.");
        System.out.println("다음 중 어떤 행동을 하시겠습니까?");

        while (check) {
            System.out.println("============================");
            System.out.print("|");
            System.out.print("1 : 사과를 박스에 담습니다.");
            System.out.print("   |");
            System.out.print("|");
            System.out.print("2 : 오랜지를 박스에 담습니다.");
            System.out.print("   |");
            System.out.print("|");
            System.out.print("3 : 박스 현황을 체크합니다.");
            System.out.print("   |");
            System.out.print("|");
            System.out.print("4 : 프로그램 종료.");
            System.out.print("   |");
            System.out.print("|");
            System.out.print("5 : 박스에 담긴 과일 개수 프린트.");
            System.out.print("   |");
            System.out.print("|");
            System.out.println();
            String input = sc.next();
            switch (input) {
                case "1":
                    if (appleCnt <= 0) {
                        System.out.println("더 이상 남은 사과가 없습니다.");
                        continue;
                    }
                    appleCnt--;
                    box.add(new Apple());
                    break;
                case "2":
                    if (orangeCnt <= 0) {
                        System.out.println("더 이상 남은 오랜지가 없습니다.");
                        continue;
                    }
                    orangeCnt--;
                    box.add(new Orange());
                    break;
                case "3":
                    box.state();
                    break;
                case "4":
                    System.out.println("프로그램을 종료합니다.");
                    check = false;
                    System.out.println("사과 "+(10-appleCnt)+"개를 훔쳤습니다!!");
                    System.out.println("오랜지 "+(10-orangeCnt)+"개를 훔쳤습니다!!");
                    break;
                case "5":
                    box.printFruitsAmount();
                    break;
                default:
                    System.out.println("잘못된 선택지입니다.");
            }
            System.out.println();
            System.out.println();
            System.out.println("현재 남은 사과의 개수는 "+appleCnt+"개입니다.");
            System.out.println("현재 남은 오랜지의 개수는 "+orangeCnt+"개입니다.");
        }
    }
}
