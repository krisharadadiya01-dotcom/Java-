class TablePrinter {

    // Synchronized method ensures one thread prints completely before another starts
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(400); // Small delay for visibility
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // Space between tables
    }
}

// Thread class
class MyThread extends Thread {
    TablePrinter printer;
    int number;

    MyThread(TablePrinter printer, int number) {
        this.printer = printer;
        this.number = number;
    }

    public void run() {
        printer.printTable(number);
    }
}

public class SyncTableExample {
    public static void main(String[] args) {

        TablePrinter printer = new TablePrinter();

        // Two threads for different tables
        MyThread t1 = new MyThread(printer, 5);
        MyThread t2 = new MyThread(printer, 7);

        // Start both threads
        t1.start();
        t2.start();
    }
}
