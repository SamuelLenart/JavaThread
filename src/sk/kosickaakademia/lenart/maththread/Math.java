package sk.kosickaakademia.lenart.maththread;

public class Math {
    boolean flag = false;
    int value = 1;

    public synchronized void Plus(){
        if(flag == true){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        value = value + 3;
        System.out.println(value);
        flag=true;
        notify();
    }
    public synchronized void Multiply(){
        while (value<1000){
            if(flag != true){
                try {
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            value = value * 2;
            System.out.println(value);
            flag=false;
            notify();
        }
    }
}
