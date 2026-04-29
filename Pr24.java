class SequentialThreads {

    public static void main(String[] args) {

        // Thread T1 prints 1 to 100
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
            }
        });

        // Thread T2 prints 101 to 200
        Thread t2 = new Thread(() -> {
            for (int i = 101; i <= 200; i++) {
                System.out.println(i);
            }
        });

        // Thread T3 prints 201 to 300
        Thread t3 = new Thread(() -> {
            for (int i = 201; i <= 300; i++) {
                System.out.println(i);
            }
        });

        try {
            // Start T1 and wait until it finishes
            t1.start();
            t1.join();

            // Start T2 and wait until it finishes
            t2.start();
            t2.join();

            // Start T3 and wait until it finishes
            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
