import java.util.Scanner;

abstract class Shape {
    abstract void printArea();
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Triangle extends Shape {
    int base, height;

    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    void printArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }
}

class Circle extends Shape {
    int radius;

    Circle(int r) {
        radius = r;
    }

    void printArea() {
        double area = 3.14 * radius * radius;
        System.out.printf("Area of Circle = %.2f\n", area);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Shape s;

        switch (choice) {

            case 1:
                System.out.print("Enter Length: ");
                int l = sc.nextInt();
                System.out.print("Enter Breadth: ");
                int b = sc.nextInt();
                s = new Rectangle(l, b);
                s.printArea();
                break;

            case 2:
                System.out.print("Enter Base: ");
                int base = sc.nextInt();
                System.out.print("Enter Height: ");
                int h = sc.nextInt();
                s = new Triangle(base, h);
                s.printArea();
                break;

            case 3:
                System.out.print("Enter Radius: ");
                int r = sc.nextInt();
                s = new Circle(r);
                s.printArea();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
