class Employee{
    int[] employee_id;
    String[] employee_name;
}

class Salary extends Employee{
    String[] designation;
    double[] monthly_salary;
    
    Salary(int j){
        super.employee_id = new int[j];
        super.employee_name = new String[j];
        this.designation = new String[j];
        this.monthly_salary = new double[j];
    }
    
    void display(int j){
        for(int i = 0; i < j && monthly_salary[i] >= 2000; i++){
            System.out.println(employee_id[i] + " " + employee_name[i] + " " + designation[i] + " " + monthly_salary[i]);
        }
    }
}

class Coordinate{
    double x, y, z;

    Coordinate(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void display(){
        System.out.println("x: " + x + " y: " + y + " z: " + z);
    }

    void add_coordinates(double x, double y, double z){
        this.x += x;
        this.y += y;
        this.z += z;

        if(this.x == this.y && this.y == this.z && this.x == 0){
            System.out.println("Everything is null");
        }
    }

    void main(){
        display();
        add_coordinates(1, 2, 3);
    }
}

class Student {
    int id_no, 
        no_of_subjects_registered, 
        total_credit,
        subject_code[], 
        subject_credits[],
        grade_points[],
        temp[],
        spi;
     String grade_obtained[];

    Student(int id_no, int no_of_subjects_registered) {
        this.id_no = id_no; 
        this.no_of_subjects_registered = no_of_subjects_registered;
    }

    void get_subData(int id, int subject_code, int subject_credits, String grade_obtained){
        this.subject_code[id] = subject_code;
        this.subject_credits[id] = subject_credits; 
        this.grade_obtained[id] = grade_obtained;

        if(grade_obtained == "AA") grade_points[id] = 10;
        if(grade_obtained == "AB") grade_points[id] = 9;
        if(grade_obtained == "BB") grade_points[id] = 8;
        if(grade_obtained == "BC") grade_points[id] = 7;
        if(grade_obtained == "CC") grade_points[id] = 6;
        if(grade_obtained == "CD") grade_points[id] = 5;
        if(grade_obtained == "DD") grade_points[id] = 4;
        if(grade_obtained == "FF") grade_points[id] = 0;

    }

    void calculate_spi(){
        this.spi = 0;
        for(int i = 0; i < no_of_subjects_registered; i++){
            this.temp[i] = subject_credits[i] * grade_points[i];
            this.spi += temp[i];
            total_credit += subject_credits[i];
        }
        this.spi /= total_credit;
    }

}

class Rectangle {
    double cx, cy, height, width;

    Rectangle() {
        cx = 0;
        cy = 0;
        height = 1;
        width = 1;
    }

    Rectangle(double cx, double cy, double height, double width) {
        this.cx = cx;
        this.cy = cy;
        this.height = height;
        this.width = width;
    }

    double getArea() {
        return height * width;
    }

    double getPerimeter() {
        return 2 * (height + width);
    }

    boolean contains(double x, double y) {
        double xLeft, xRight, yTop, yBottom;
        xLeft = cx - (width / 2);
        xRight = cx + (width / 2);
        yTop = cy - (height / 2);
        yBottom = cy + (height / 2);

        if ((xLeft <= x && x <= xRight) && (yTop <= y && y <= yBottom)) {
            return true;
        }
        return false;
    }
}

class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    int speed;
    boolean f_on;
    double radius;
    String colour;

    Fan() {
        speed = SLOW;
        f_on = false;
        radius = 4;
        colour = "blue";
    }

    Fan(int speed, boolean f_on, double radius, String colour) {
        this.speed = speed;
        this.f_on = f_on;
        this.radius = radius;
        this.colour = colour;
    }

    void display() {
        if (f_on) {
            System.out.println("The fan properties are as follows:");
            System.out.println("Speed: " + speed + " colour: " + colour + " radius: " + radius);
        } else {
            System.out.println("Fan is off");
        }
    }
}

class Programs {
    static boolean checkPrime(double number) {
        if (number == 1) {
            return true;
        }
        for (double i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(i);
                return false;
            }
        }
        return true;
    }

    static int sumNum(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt("" + number.charAt(i));
        }
        return sum;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void fib(int n, int a, int b) {
        if (n == 0) {
            return;
        } else {
            System.out.println(a);
            fib(n - 1, b, a + b);
        }
    }

    static boolean palindrome(String given) {
        int givenLength = given.length();
        for (int i = 0; i < givenLength / 2; i++) {
            if (given.charAt(i) != given.charAt(givenLength - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static void fibWithForLoop(int n) {
        int a = 0, b = 1, temp;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            temp = a;
            a = b;
            b = temp + b;
        }
    }

    static double average(double arr[]){
        double sum = 0;
        for(double i: arr){
            sum += i;
        }
        return (sum / arr.length);
    }

    static String revStr(String str){
        String revString = new String();
        for(int i = str.length() - 1; i >= 0; i--){
            revString += str.charAt(i);
        }

        return revString;
    }
}

abstract class Figure{
    double height, width;
    abstract Double area();
}

class Rect extends Figure{
    Rect(double height, double width){
        super.height = height;
        super.width = width;
    }

    Double area(){
        return height * width;
    }
}

class Triangle extends Figure{
    Triangle(double height, double base){
        super.height = height;
        super.width = base;
    }

    Double area(){
        return 0.5 * height * width;
    }
}

abstract class Vegetable{
    String colour;
    abstract public String toString(String colour);
}

class Potato extends Vegetable{

    public String toString(String colour){
        super.colour = colour;
        return "Potato of " + colour + " colour";
    }

}
class Brinjal extends Vegetable{

    public String toString(String colour){
        super.colour = colour;
        return "Brinjal of " + colour + " colour";
    }

}
class Tomato extends Vegetable{

    public String toString(String colour){
        super.colour = colour;
        return "Tomato of " + colour + " colour";
    }
}

interface P{
    int constant = 10;
    void display();
}

interface P1 extends P{
    int constant1 = 11;
    void display(); 
}

interface P2 extends P{
    int constant2 = 12;
    void display(); 
}

interface P12 extends P1, P2{
    void display();
}

class Q implements P12{
    public void display(){
        System.out.println(constant + " " + constant1 + " " + constant2);
    }
}

interface Transport{
    void deliver();
}

abstract class Animal{
    abstract void show();
}

class Tiger extends Animal{
    void show(){
        System.out.println("I'm Tiger");
    }   
}
class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Delivery Guy");
    }

    void show(){
        System.out.println("I'm Camel");
    }  

    Camel(){
        deliver();
    }
}
class Deer extends Animal{
    void show(){
        System.out.println("I'm Deer");
    }  
}
class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Delivery Guy");
    }

    void show(){
        System.out.println("I'm Donkey");
    }  

    Donkey(){
        deliver();
    }
}

class A{
    int a = 10;
}

interface B{
    int b = 11;
}

class C extends A implements B{
    void show(){
        System.out.println(a);
        System.out.println(b);
    }
}

class D extends C{
    void add(){
        int c = a + b;
        System.out.println(c);
    }
}

class Book{
    private String author_name;

    public void setName(String name){
        this.author_name = name;
    }

    public String getName(){
        return author_name;
    }

    public void setTitle(String title){
        // will override
    }

    public String getTitle(){
        // will override
        return "";
    }

    public void display(){
        //will override
    }

    
}

class Book_publication extends Book{
    private String title;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void display() {
        System.out.println("author: " + getName() + " title: " + getTitle());
    }
}

class Paper_publication extends Book{
    private String title;
    
    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void display() {
        System.out.println("author: " + getName() + " title: " + getTitle());
    }
}

class Employee1{
    int employee_id;
    String employee_name;
}

class Salary1 extends Employee1{
    String designation;
    double monthly_salary;
    
    Salary1(String employee_id, String employee_name, String designation, String monthly_salary){
        super.employee_id = Integer.parseInt(employee_id);
        super.employee_name = employee_name;
        this.designation = designation;
        this.monthly_salary = Double.parseDouble(monthly_salary);
    }
    
    void display(){
        if(monthly_salary >= 20000){
            System.out.println(employee_id + " " + employee_name + " " + designation + " " + monthly_salary);
        }
    }
}
