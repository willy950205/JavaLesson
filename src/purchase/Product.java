package purchase;

public class Product {
    int price;             // 제품가격
    int bonusPoint;   // 제품 구매시, 제공되는 보너스점수

    public Product() {}
    public Product(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);    // 보너스점수는 제품 가격의 10%
    }
}
