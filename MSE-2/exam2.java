import cool.SOP;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.io.PrintStream;

class UserThread extends Thread{
    public void run(){
        new SOP(getPriority() + " " + getName() + " " + getId() + " " + getState() + " " + getClass() + " " + isAlive() + " " + isDaemon());
    }
}


public class exam2 {
    public static void main(String[] args){
        Thread t1 = new UserThread();
        Thread t2 = new UserThread();

        t1.setPriority(1);
        t2.setPriority(2);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
