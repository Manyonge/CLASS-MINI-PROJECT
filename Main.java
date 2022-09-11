import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Evaluator evaluator = new Evaluator();

    static Sneakers createSneaker() {
        System.out.println("Enter Sneaker Name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter Sneaker Size: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Sneaker buying price: ");
        int bp = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Sneaker buying date: ");
        String bd = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Enter Sneaker selling price: ");
        int sp = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Sneaker selling date: ");
        String sd = scanner.nextLine();
        scanner.nextLine();
        Sneakers newSneaker = new Sneakers(name, size, bp, bd, sp, sd);

        System.out.println("New Sneaker record created");
        return newSneaker;

    }

    static Jeans createJeans() {
        System.out.println("Enter Jeans Name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter Jeans Size: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Jeans buying price: ");
        int bp = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Jeans buying date: ");
        String bd = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Enter Jeans selling price: ");
        int sp = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Jeans selling date: ");
        String sd = scanner.nextLine();
        scanner.nextLine();
        Jeans newJeans = new Jeans(name, size, bp, bd, sp, sd);

        System.out.println("New Jeans record created");
        return newJeans;
    }

    public static void main(String args[]) {

        System.out.println("___Business Records Management System___");
        System.out.println("");
        System.out.println("Create a new sneaker record");
        Sneakers newSneaker = createSneaker();
        System.out.println("Create a new jeans record");
        Jeans newJeans = createJeans();
        System.out.println();
        System.out.println("");
        System.out.println("");
        System.out.println("___Choose an action to execute___");
        System.out.println("1.Show total cost incurred.");
        System.out.println("2.Show total profit made.");
        System.out.println("3.Show sneaker details.");
        System.out.println("4.Show jeans details.");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                int sneakerBuying = newSneaker.totalCost();
                int jeansBuying = newJeans.totalCost();
                System.out.println("Sneaker buying price was: " + sneakerBuying + " KES and jeans buying price was : "
                        + jeansBuying + "KES.");
                // demonstration of parameter passing and referencing
                int totalBuying = evaluator.totalCost(newSneaker, newJeans);
                System.out.println("Total money spent is " + totalBuying);
                break;

        }

    }
}
