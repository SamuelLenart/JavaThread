package sk.kosickaakademia.lenart.maththread;

public class Math {
    private boolean flag = false;
    private int number = 0;
    private int result;

    public Math(int number){
        this.number = number;
        this.result = number;
    }

    public synchronized void multiplay(){
        while (result < 500) {
            if (flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            result *= 2;
            System.out.println("T1: " + result);
            flag = true;
            notify();
        }
    }

    public synchronized void add(){
        while(result<500){
            if(flag == false){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            result +=3;
            System.out.println("T2: "+result);
            flag = false;
            notify();
        }
    }

}