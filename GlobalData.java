
package javaapp2potoka;

import java.util.concurrent.atomic.AtomicInteger;


public class GlobalData {
    
    public static final int STEPS = 1000;
    public static int value;
    public static AtomicInteger aValue = new AtomicInteger();
}
