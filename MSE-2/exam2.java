import cool.SOP;

interface A{
    int a = 10;
}

interface C extends A{
    int b = 20;
}

interface B extends A{
    int c = 30;
}

class D implements C, B{
    D(){
        new SOP(a + b + c);
    }
}

public class exam2 {
    public static void main(String args[]) {
        new D();
    }
}
