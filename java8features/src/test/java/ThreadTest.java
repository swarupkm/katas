import org.junit.Test;

public class ThreadTest {
    private static void printName() {
        System.out.println("sadasdasdd");
    }

    @Test
    public void should_start_athread() {
        Thread t = new Thread(ThreadTest::printName);
        t.run();
    }

    @Test
    public void should_start_a_thread_using_runnable() throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Slow");
        });

        t.start();

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Fast");
        });

        t1.start();


        Thread.sleep(15000);
    }
}
