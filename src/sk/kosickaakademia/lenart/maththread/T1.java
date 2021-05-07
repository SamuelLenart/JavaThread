package sk.kosickaakademia.lenart.maththread;

import sk.kosickaakademia.lenart.tutorialtrhead.Chat;

public class T1 implements Runnable{
    private Chat chat;
    private Thread t;

    public T1(Chat chat){
        this.chat = chat;
        t = new Thread();
        t.start();
    }
    @Override
    public void run() {

    }
}
