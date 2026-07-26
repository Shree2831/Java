import java.util.ArrayList;
import java.util.Scanner;

public class TravelManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initial List
        ArrayList<String> city = new ArrayList<>();
        city.add("Chennai");
        city.add("Madurai");
        city.add("Trichy");

        // TEST CASE 1 - APPEND OPERATION
        System.out.println("TEST CASE 1 - APPEND OPERATION");
        System.out.println("Input");
        System.out.println("Initial List: " + city);
        System.out.print("City to Add: ");
        String appendCity = sc.next();

        ArrayList<String> list1 = new ArrayList<>(city);
        list1.add(appendCity);

        System.out.println("Output");
        System.out.println("Updated List: " + list1);

        // TEST CASE 2 - INSERT AT INDEX
        System.out.println("\nTEST CASE 2 - INSERT AT INDEX");
        System.out.println("Input");
        System.out.println("Initial List: " + city);

        System.out.print("Index: ");
        int index = sc.nextInt();

        System.out.print("City to Add: ");
        String insertCity = sc.next();

        ArrayList<String> list2 = new ArrayList<>(city);
        list2.add(index, insertCity);

        System.out.println("Output");
        System.out.println("Updated List: " + list2);

        // TEST CASE 3 - SEARCH OPERATION
        System.out.println("\nTEST CASE 3 - SEARCH OPERATION");
        System.out.println("Input");
        System.out.println("Initial List: " + list1);

        System.out.print("City to Search: ");
        String searchCity = sc.next();

        int pos = list1.indexOf(searchCity);

        System.out.println("Output");
        if (pos != -1) {
            System.out.println("City Found at Index: " + pos);
        } else {
            System.out.println("City Not Found");
        }

        // TEST CASE 4 - DISPLAY CITIES STARTING WITH GIVEN LETTER
        System.out.println("\nTEST CASE 4 - DISPLAY CITIES STARTING WITH GIVEN LETTER");

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Chennai");
        list4.add("Coimbatore");
        list4.add("Madurai");
        list4.add("Cuddalore");

        System.out.println("Input");
        System.out.println("Initial List: " + list4);

        System.out.print("Starting Letter: ");
        char ch = sc.next().charAt(0);

        ArrayList<String> result = new ArrayList<>();

        for (String s : list4) {
            if (s.startsWith(String.valueOf(ch))) {
                result.add(s);
            }
        }

        System.out.println("Output");
        System.out.println("Cities Starting with '" + ch + "': " + result);

        sc.close();
    }
}
