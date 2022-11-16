import cool.SOP;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.io.PrintStream;

class UserThread extends Thread {
    public void run() {
        new SOP(getName());
        for (int i = 1; i <= 4; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            // new SOP(getPriority() + " " + getName() + " " + getId() + " " + getState() + " " + getClass() + " " + isAlive()
            // + " " + isDaemon());

            new SOP(activeCount());
        }
    }
}

public class exam2 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            Thread t1 = new UserThread();
            Thread t2 = new UserThread();
    
            t1.setPriority(1);
            t2.setPriority(2);
    
            t1.setName("" + i);
            t2.setName("" + i * 10);
    
            try {
    
                // t1.join();
                // t2.join();
            } catch (Exception e) {
                new SOP(e);
            }
    
            t2.start();
            t1.start();
        }

    }
}
