
package javaapp2potoka;


public class ThreadCounter2 implements Runnable {
    
    private Thread self;

    public ThreadCounter2() {        
        self = new Thread(this);
    }
    
    public void start(){
        self.start();
    }
    
    public void join() throws InterruptedException{
        self.join();
    }

    @Override
    public void run() {
        int i;
        for  (i = 0; i < GlobalData.STEPS; i++) {
            GlobalData.value++;
            GlobalData.aValue.getAndIncrement();//синхронизация с помощью атомарной операции
        }
        System.out.println(Thread.currentThread().getName() + " - " + i);
    }
    
}
