package sk.kosickaakademia.lenart.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thread started");
        ThreadDemo threadDemo = new ThreadDemo("Start thread", 2);
        threadDemo.start();


        PrimeNumber pn = new PrimeNumber("primeThread",116);
        pn.start();
        System.out.println("Thread finished");
    }
}
