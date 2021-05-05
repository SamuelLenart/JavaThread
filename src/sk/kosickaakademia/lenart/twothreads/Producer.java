package sk.kosickaakademia.lenart.twothreads;

public class Producer extends Thread{
    private Thread t;
    @Override
    public void run() {
        try {
            System.out.println("Hi, im producer nice to meet ya");
            Thread.sleep(1);
            wait();
            System.out.println("Hi, im running again");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public synchronized void start() {
        if(t==null){
            t=new Thread(this, "producer");
            t.start();
        }
    }
}
