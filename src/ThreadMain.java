public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("[" + Thread.currentThread().getName() + "] " + "i: " + i);
            }
        };

        threadOperator(new Thread(runnable), 100L);
        threadOperator(new Thread(runnable));
    }

    static void threadOperator(Thread thread) {
        thread.start();
    }

    static void threadOperator(Thread thread, long time) throws InterruptedException {
        Thread.sleep(time);
        thread.start();
    }
}
