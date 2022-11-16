
package javaapp2potoka;


public class JavaApp2potoka {

  
    public static void main(String[] args) throws InterruptedException {
        
        ThreadCounter2 th1 = new ThreadCounter2();
        ThreadCounter2 th2 = new ThreadCounter2();
        
        th1.start();
        th2.start();
        
        th1.join();
        th2.join();
        
        System.out.println("value = " + GlobalData.value);
        System.out.println("aValue = " + GlobalData.aValue.get());
    }
    
}
