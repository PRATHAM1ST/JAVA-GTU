abstract class Vegetable {
    String color;

    abstract void display();
}

class Potato extends Vegetable {
    Potato() {
        color = "red";
    }

    void display() {
        new SOP(color);
    }
}

class Brinjal extends Vegetable {
    Brinjal() {
        color = "red";
    }

    void display() {
        new SOP(color);
    }
}

class Tomato extends Vegetable {
    Tomato() {
        color = "red";
    }

    void display() {
        new SOP(color);
    }
}

interface A {
    int a = 10;
}

interface C extends A {
    int b = 20;
}

interface B extends A {
    int c = 30;
}

class D implements C, B {
    D() {
        new SOP(a + b + c);
    }
}

class NegativeException extends Exception {
    NegativeException(String pos) {
        new SOP("Its negative at pos " + pos);
    }
}

int a[] = new int[] { 1, 2, 3, -1, 90 };try
{
    for (int i : a) {
        if (i < 0) {
            throw new NegativeException("" + i);
        }
    }
}
catch(
    NegativeException e){
    new SOP(e);
}


class InvalidStatus extends Exception{
    InvalidStatus(){
        new SOP("Shiv shiv shiv");
    }
}

class ResourcesStatus{
    int FREE = 0, OCCUPIED = 1, INACCESSIBLE = 2;
    int statusRef[][] = new int[3][3];

    ResourcesStatus(int statusArr[][]){
        statusRef = statusArr;
    }

    void processStausCount(){
        int freeCounter = 0, occupiedCounter = 0, inaccessibleCouner = 0;
        for(int i[]: statusRef){
            for(int j: i){
                if(j == FREE){
                    freeCounter++;
                }
                else if(j == OCCUPIED){
                    occupiedCounter++;
                }
                else{
                    inaccessibleCouner++;
                }
            }
        } 
        new SOP("free: " + freeCounter + " occupied: " + occupiedCounter + " inaccessible: " + inaccessibleCouner);
        exceptionChecker(freeCounter, occupiedCounter);
    }

    static void exceptionChecker(int freeCounter, int occupiedCounter){
        try{
            if(freeCounter < occupiedCounter){
                throw new InvalidStatus();
            }
        }
        catch(InvalidStatus i){
            new SOP("I didn't thought of this");
        }
    }

}

int a[][] = new int[3][];
a[0] = new int[]{1, 2, 2};
a[1] = new int[]{1, 2, 1};
a[2] = new int[]{0, 2, 0};
ResourcesStatus r = new ResourcesStatus(a);
r.processStausCount();


class RangeException extends Exception{
    RangeException(){
        new SOP("Given value is not in the range.\nhence is not acceptible");
    }
}


int marks[] = new int[]{10, 2, -1, 30, 4};
try{
    for(int i : marks){
        if(0 <= i && i <= 20){
            new SOP(i);
        }
        else{
            throw new RangeException();
        }
    }
}
catch(RangeException r){
    new SOP(r);        
}