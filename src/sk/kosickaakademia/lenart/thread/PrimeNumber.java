package sk.kosickaakademia.lenart.thread;

public class PrimeNumber extends Thread{
    private String threadName;
    private int base;
    private Thread t;
    private int prime;

    public PrimeNumber(String threadName, int base) {
        this.threadName = threadName;
        this.base = base;
        System.out.println(threadName + " created");
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        int limit = 1;
        for(int i=base; i < (long)Math.pow(base,2); i++){
            boolean isPrime = true;
            for(int j=2; j < i ; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.print(i + " ");
        }
        System.out.println(threadName + " exiting");
    }

    @Override
    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }else{
            System.out.println("Error : "+threadName+" is already running.");
        }

    }
}
