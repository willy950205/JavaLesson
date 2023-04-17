package exceptions;

public class Main {
    public static void main(String[] args) {

        Test test = new Test();
        try {
            test.executeTest();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("익셉션을 처리한다.");
        }

        test.workTest();
    }


}
