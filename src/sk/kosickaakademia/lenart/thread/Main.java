package sk.kosickaakademia.lenart.thread;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thread started");
        ThreadDemo threadDemo = new ThreadDemo("Start thread", 2);
        threadDemo.start();

        ThreadDemo threadDemo2 = new ThreadDemo("Start thread2", 0);
        threadDemo2.start();
        System.out.println("Thread finished");
    }
}
