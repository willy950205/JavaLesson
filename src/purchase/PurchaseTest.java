package purchase;

public class PurchaseTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        // Television t = new Television(); 대신 일회성으로 생성
        b.buy(new Television());
        b.buy(new Computer());
        b.cart();
        b.showInfo();
    }
    
    // 실행결과를 적어보자
    
}
