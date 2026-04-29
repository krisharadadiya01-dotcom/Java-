class ThreadExample {

    public static void main(String[] args) {

        // First thread: prints 1 to 10 every 1 second
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(1000); // 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Second thread: prints 11 to 20 every 500 ms
        Thread t2 = new Thread(() -> {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(500); // 500 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();
    }
}
