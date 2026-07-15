import java.util.Scanner;

class Eb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int units;
        String type;
        double amount = 0;

        System.out.print("Enter connection type: ");
        type = sc.nextLine();

        System.out.print("Enter units consumed: ");
        units = sc.nextInt();

        if (type.equalsIgnoreCase("Domestic")) {

            if (units <= 100) {
                amount = 0;
            }
            else if (units <= 200) {
                amount = (units - 100) * 2;
            }
            else if (units <= 500) {
                amount = (100 * 2) + (units - 200) * 4;
            }
            else {
                amount = (100 * 2) + (300 * 4) + (units - 500) * 6;
            }

        }
        else if (type.equalsIgnoreCase("Commercial")) {

            if (units <= 100) {
                amount = units * 2;
            }
            else if (units <= 200) {
                amount = (100 * 2) + (units - 100) * 4;
            }
            else if (units <= 500) {
                amount = (100 * 2) + (100 * 4) + (units - 200) * 6;
            }
            else {
                amount = (100 * 2) + (100 * 4) + (300 * 6) + (units - 500) * 7;
            }

        }

        System.out.println("Amount to be paid : Rs. " + (int) amount);

        sc.close();
    }
}
