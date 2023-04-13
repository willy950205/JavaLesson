package purchase;

public class Buyer {
    int money = 1000;    // 소유 금액
    int bonusPoint = 0;

    Product[] item = new Product[10];    // 구매한 물건명
    int idx = 0;

    public Buyer() {}

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= p.price;
        bonusPoint = p.bonusPoint;

        item[idx++] = p;
        System.out.println(p + "을(를) 구입하셨습니다.");
    }

    void showInfo() {
        System.out.println("현재 남은 금액은 " + money + "만원 입니다.");
        System.out.println("현재 보너스 점수는 " + bonusPoint + "점 입니다.");
    }

    void cart() {
        int sum = 0;
        String itemList = "";

        for (int i=0; i<item.length; i++) {
            if (item[i] == null) break;

            sum += item[i].price;
            itemList += (i==0) ? item[i] : ", " + item[i];
        }

        System.out.println("총 금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }

}
