package sk.kosickaakademia.lenart.tutorialtrhead;

public class T2 implements Runnable{
    private Chat chat;
    private Thread t;
    private String[] s2 = {"Hello","Fine","Nothing serious?","Bye"};

    public T2(Chat chat){
        this.chat = chat;
        t = new Thread(this, "Answer");
        t.start();
    }

    @Override
    public void run() {
        for (String a : s2) {
            chat.answer(a);
        }
    }
}
