import java.util.Scanner;

interface Calculator {
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
}

class Arithmetic implements Calculator {

    public void add(int a, int b) {
        System.out.println("Result = " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Result = " + (a - b));
    }

    public void mul(int a, int b) {
        System.out.println("Result = " + (a * b));
    }

    public void div(int a, int b) {
        System.out.println("Result = " + (a / b));
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arithmetic obj = new Arithmetic();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                obj.add(a, b);
                break;
            case 2:
                obj.sub(a, b);
                break;
            case 3:
                obj.mul(a, b);
                break;
            case 4:
                obj.div(a, b);
                break;
            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
