package exceptions;

public class ExceptionMaker {
    public void execute() throws ArithmeticException {
        int value = 0/0;
        System.out.println(value);
    }

    public void work() {
        System.out.println("익셉션 만들기");
        throw new NullPointerException();
    }
}
