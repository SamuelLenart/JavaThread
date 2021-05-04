package sk.kosickaakademia.lenart.thread;

public class ThreadDemo implements Runnable{
    private String threadName;
    private int priority;
    private Thread t;
    @Override
    public void run(){
        System.out.println("Running "+threadName);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread " +threadName+ " value: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread "+threadName+" exiting.");
    }

    public ThreadDemo(String threadName, int priority) {
        this.threadName = threadName;
        this.priority=priority;
        System.out.println("Creating "+threadName);
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
