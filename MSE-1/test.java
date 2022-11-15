import java.util.Scanner;

class I2{
    int supVal = 10;
    public String getDescription(){
        return "I2";
    }
}

class J2 extends I2{
    public String getDescription(){
        return "J2 " + super.getDescription();
    }
}

class K2 extends J2{
    public String getDescription(){
        return "K2 " + super.getDescription();
    }
}





class Programs {

}

class test {

    static int d = 0;

    public int sum(int x, int y){
        if (y == 10) return 0; 
        return x + sum(y, y - 10);
    }

    public static void main(String [] args) {
        // Scanner sc = new Scanner(System.in);
        // int a, b;
        // a = Integer.parseInt(args[0]);
        // b = Integer.parseInt(args[1]);

        // test t = new test();
        // System.out.println(t.sum(10, 20));

        // StringBuffer s = new StringBuffer("Cool");
        // s.insert(1, 1);
        // s.append('c');
        // System.out.println(s.indexOf("l"));

        System.out.println(d);
        
    }
}
// I2 i = new I2();
// J2 j = new J2();
// K2 k = new K2();

// System.out.println(i.getDescription());
// System.out.println(j.getDescription());
// System.out.println(k.getDescription());

// final int SLOW = 1, MEDIUM = 2, FAST = 3;
// Scanner sc = new Scanner(System.in);
// String given = sc.nextLine();
// int a, b;
// a = Integer.parseInt(args[0]);
// b = Integer.parseInt(args[1]);
// Programs.fibWithForLoop(a);
// System.out.println(Programs.fibWithForLoop(given));

// Fan f1 = new Fan();
// Fan f2 = new Fan(MEDIUM, true, 6, "brown");
// f1.display();
// f2.display();

// Rectangle r1 = new Rectangle();
// Rectangle r2 = new Rectangle(10, 30, 10, 20);

// System.out.println(r1.getArea());
// System.out.println(r2.getArea());

// System.out.println(r1.getPerimeter());
// System.out.println(r2.getPerimeter());

// System.out.println(r1.contains(0, 0));
// System.out.println(r2.contains(1, 1));

// double a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
// System.out.println(Programs.average(a));

// String str = args[0];
// System.out.println(Programs.revStr(str));


// int num = Integer.parseInt(args[0]);
// Student s[] = new Student[num]; 
// int id_no, no_of_subjects_registered;

// for(int i = 0; i < num; i++){

//         System.out.println("Enter Student Details\n");

//         System.out.println("Student id: ");
//         id_no = sc.nextInt();

//         System.out.println("No. of subjects: ");
//         no_of_subjects_registered = sc.nextInt();

//         s[i] = new Student(id_no, no_of_subjects_registered);

//         for(int j = 0; j < no_of_subjects_registered; j++){
//             System.out.println("No. of subjects: ");
//             int y = j + 1;

//             System.out.println("For Subject" + y + "\n");

//             System.out.println("Subject Code: ");
//             int s_code = sc.nextInt();

//             System.out.println("Subject Credit: ");
//             int s_credit = sc.nextInt();

//             sc.nextLine();

//             System.out.println("Subject Grade: ");
//             String s_grade = sc.next();

//             s[i].get_subData(id_no, s_code, s_credit, s_grade);

//         }

//         s[i].calculate_spi();
//         System.out.println(s[i].spi);

//     }

// Vegetable p = new Potato();
// Vegetable b = new Brinjal();
// Vegetable t = new Tomato();

// System.out.println(p.toString("Yellow"));
// System.out.println(b.toString("Purple"));
// System.out.println(t.toString("Red"));

// P q = new Q();
// q.display();

// Animal a[] = new Animal[4];

// a[0] = new Tiger();
// a[0].show();
// a[1] = new Deer();
// a[1].show();
// a[2] = new Camel();
// a[2].show();
// a[3] = new Donkey();
// a[3].show();

// C c = new C();
// c.show();

// D d = new D();
// d.add();


// Book b = null;
// Book_publication bp = new Book_publication();
// Paper_publication pp = new Paper_publication();
// b = bp;
// b.setName(args[0]);
// b.setTitle(args[1]);
// b.display();
// b = pp;
// b.setName(args[2]);
// b.setTitle(args[3]);
// b.display();

// Salary1 s[] = new Salary1[5];
// int n = 0;
// for(int i = 0; i < 2; i++){
//     s[i] = new Salary1(args[n], args[n + 1], args[n + 2], args[n + 3]);
//     n += 4;
// }
// for(int i = 0; i < 2; i++){
//     s[i].display();
// }
