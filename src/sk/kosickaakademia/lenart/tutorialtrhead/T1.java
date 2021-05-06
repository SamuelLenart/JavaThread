package sk.kosickaakademia.lenart.tutorialtrhead;

public class T1 implements Runnable{
    private Chat chat;
    private Thread t;
    private String[] s1 = {"Hi","What's up?","How u doing?","Bye"};

    public T1(Chat chat){
        this.chat = chat;
        t = new Thread(this, "Question");
        t.start();
    }

    @Override
    public void run() {
        for(String q:s1){
            chat.question(q);
        }
    }
}
