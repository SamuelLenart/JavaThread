package sk.kosickaakademia.lenart.twothreads;

public class Consumer extends Thread{
    private Thread t;
    @Override
    public synchronized void start() {
        if(t==null){
            t=new Thread(this, "consumer");
            t.start();
        }
    }

    @Override
    public void run() {
        try {
            System.out.println("Hi, i am consumer and nice to meet ya buddy");
            Thread.sleep(3000);
            System.out.println("Hey, wake up");
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
