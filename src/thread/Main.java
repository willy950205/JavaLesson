package thread;

public class Main {
    public static void main(String[] args) {

        System.out.println("1");

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName() + " : "+i);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName() + " : "+i);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        System.out.println("2");

    }
}
