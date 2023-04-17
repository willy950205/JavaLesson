package exceptions;

public class Test {

    public void executeTest(){
        try {
            ExceptionMaker exceptionMaker = new ExceptionMaker();
            exceptionMaker.execute();
        } catch (ArithmeticException e){
            System.out.println("통제하겠다.");
            throw new RuntimeException("나는 런타임 익셉션");
        }

    }

    public void workTest(){
        ExceptionMaker exceptionMaker = new ExceptionMaker();
        exceptionMaker.work();
    }

}
