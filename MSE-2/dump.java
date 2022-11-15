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

