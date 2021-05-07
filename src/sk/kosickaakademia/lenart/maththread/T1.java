package sk.kosickaakademia.lenart.maththread;

public class T1 implements Runnable{
    Number number;
    Thread t;

    public T1(Number number){
        this.number = number;
        t = new Thread(this, "ThreadMultiply");
        t.start();
    }
    @Override
    public void run() {
        number.multiply();
    }
}
