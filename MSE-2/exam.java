import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

class ThreadEvenOdd extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        String threadName = t.getName();
        if (threadName.equals("odd")) {
            for (int i = 1; i <= 20; i = i + 2) {
                System.out.println(i);
            }
        } else {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println(i);
            }
        }
    }
}

class HelloThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello" + getName());
                Thread.sleep(300);
            }
            System.out.println("end" + getName());
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class GoodMorningThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class AfterNoonThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Good Afternoon");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class OddThread extends Thread {
    String name;

    OddThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                try {
                    System.out.println(i);
                    sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class EvenThread extends Thread {
    String name;

    EvenThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                try {

                    System.out.println(i);
                    sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class ThreadMatrixCounter extends Thread {
    int Arr[];

    ThreadMatrixCounter(int Arr[]) {
        this.Arr = Arr;
        // System.out.println("in const");
    }

    public void run() {

        // System.out.println("in run");
        int sum = 0;
        for (int i : Arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}

class AlphabetDisplayThread extends Thread {
    public void run() {
        int i = 97;
        while (i <= 97 + 26) {
            System.out.println((char) i);
            i++;
        }
    }
}

class NumberDisplayThread extends Thread {
    public void run() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}

class ConsumerThread extends Thread {
    int pointer = 0;
    int maxlen = 10;
    int Stack[] = new int[maxlen];

    public void run() {
        while (pointer != -1) {
            try {
                pop();
                sleep(500);
            } catch (Exception e) {
                System.out.println("consumer: " + e);
            }
        }
    }

    public void pop() {
        if (pointer >= 0) {
            pointer--;
            System.out.println("point: " + pointer);
        }
    }

    public void push(int n) {
        if (pointer < maxlen - 1) {
            pointer++;
            Stack[pointer] = n;
            System.out.println("given: " + n);
        }
    }
}

class producerThread extends Thread {
    int Arr[];
    ConsumerThread c;

    producerThread(int arr[], ConsumerThread c) {
        Arr = arr;
        this.c = c;
    }

    public void run() {
        for (int i : Arr) {
            try {
                c.push(i);
                sleep(500);
            } catch (Exception e) {
                System.out.println("Producer: " + e);
            }
        }
    }
}

public class exam extends IOException {
    public static void main(String args[]) throws IOException {

        FileReader fis = new FileReader("./Test.txt");
        BufferedReader bis = new BufferedReader(fis);
        FileWriter fos = new FileWriter("./Test2.txt");
        BufferedWriter bos = new BufferedWriter(fos);
        String x;
        while((x = bis.readLine()) != null){
            for(String i: x.split(" ")){
                if(i == "word1"){
                    bos.write("word2");
                }
                else{
                    bos.write(i);
                }
            }
        }
        fis.close();
        bis.close();
        fos.close();
        bos.close();

        // int x;
        // FileInputStream fis = null;
        // FileOutputStream fos = null;
        // fis = new FileInputStream("./Test.txt");
        // fos = new FileOutputStream("./Test2.txt");
        // BufferedInputStream bis = new BufferedInputStream(fis);
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        // do {
        //     x = bis.read();
        //     if (x != -1)
        //         bos.write((char) x);
        // } while (x != -1);
        // System.out.println("File Successfully Copied!!!");
        // bis.close();
        // bos.close();
        // fis.close();
        // fos.close();

        // FileInputStream f = new FileInputStream("./Test.txt");
        // int i = 0;
        // while ((i = f.read()) != -1) {
        // System.out.print((char) i);
        // }
        // f.close();

        // RandomAccessFile raf = new RandomAccessFile("Test.txt", "rw");
        // long pos = raf.length();
        // for (long i = pos - 1; i >= 0; i--) {
        // raf.seek(i);
        // byte b = raf.readByte();
        // System.out.println((char) b);
        // }

        // FileReader fr = new FileReader("./Test.txt");
        // BufferedReader br = new BufferedReader(fr);

        // FileWriter EvenFw = new FileWriter("./even.txt");
        // PrintWriter EvenPw = new PrintWriter(EvenFw);
        // FileWriter OddFw = new FileWriter("./odd.txt");
        // PrintWriter OddPw = new PrintWriter(OddFw);

        // String st;
        // int n;
        // while((st = br.readLine()) != null){
        // n = Integer.parseInt(st);
        // if(n % 2 == 0){
        // EvenPw.println(n);
        // }
        // else{
        // OddPw.println(n);
        // }
        // }
        // EvenPw.close();
        // OddPw.close();

        // ConsumerThread c = new ConsumerThread();
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // int arr2[] = { 8, 9, 10, 11, 12, 13, 14 };
        // Thread p1 = new producerThread(arr, c);
        // Thread p2 = new producerThread(arr2, c);
        // p1.start();
        // p2.start();
        // c.start();

        // AlphabetDisplayThread a = new AlphabetDisplayThread();
        // NumberDisplayThread n = new NumberDisplayThread();

        // a.start();
        // n.start();

        // File f = new File("./Test.txt");
        // FileReader fr = new FileReader(f);
        // BufferedReader br = new BufferedReader(fr);
        // String st;
        // int Arr[][] = new int[100][];
        // int ArrCounter = 0;
        // while((st = br.readLine()) != null){
        // String found[] = st.split(" ");
        // int Temp[] = new int[found.length];
        // int TempCounter = 0;
        // for(String i: found){
        // // System.out.println(i);
        // Temp[TempCounter] = Integer.parseInt(i);
        // TempCounter++;
        // }
        // Arr[ArrCounter] = Temp;
        // ArrCounter++;
        // }

        // for(int i = 0; i < ArrCounter; i++){
        // Thread tm = new ThreadMatrixCounter(Arr[i]);
        // tm.start();
        // }

        // br.close();

        // Thread t1 = new OddThread("1");
        // Thread t2 = new EvenThread("2");
        // t1.start();
        // t2.start();

        // Thread t1 = new GoodMorningThread();
        // Thread t2 = new AfterNoonThread();
        // t1.start();
        // t2.start();

        // Thread t1 = new HelloThread();
        // Thread t2 = new HelloThread();
        // t1.setName("1");
        // t1.setName("2");
        // t1.start();
        // t2.start();

        // Thread t1 = new ThreadEvenOdd();
        // Thread t2 = new ThreadEvenOdd();
        // t1.setName("odd");
        // t2.setName("even");
        // t1.start();
        // t2.start();
    }
}
