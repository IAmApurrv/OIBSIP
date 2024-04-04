import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class OnlineReservationSystem {
    private static Map<String, String> users = new HashMap<>();
    private static Map<String, Ticket> tickets = new HashMap<>();
    private static int ticketCount = 0;

    static class Ticket {
        String name;
        String trainNumber;
        String classType;
        String dateOfJourney;
        String from;
        String to;

        Ticket(String name, String trainNumber, String classType, String dateOfJourney, String from, String to) {
            this.name = name;
            this.trainNumber = trainNumber;
            this.classType = classType;
            this.dateOfJourney = dateOfJourney;
            this.from = from;
            this.to = to;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        String username = "";

        users.put("user1", "password1");
        users.put("user2", "password2");
        users.put("apurrv", "apurrv");

        while (!loggedIn) {
            System.out.println("Enter username:");
            username = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();
            if (users.containsKey(username) && users.get(username).equals(password)) {
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Try again.");
            }
        }

        while (true) {
            System.out.println("=================================================");
            System.out.println();
            System.out.println("1. Make Reservation");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    makeReservation(scanner);
                    break;
                case 2:
                    cancelReservation(scanner);
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

    }

    private static void makeReservation(Scanner scanner) {
        System.out.println("=================================================");
        System.out.println();
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter train number:");
        String trainNumber = scanner.nextLine();
        System.out.println("Enter class type:");
        String classType = scanner.nextLine();
        System.out.println("Enter date of journey:");
        String dateOfJourney = scanner.nextLine();
        System.out.println("Enter from (place):");
        String from = scanner.nextLine();
        System.out.println("Enter to (destination):");
        String to = scanner.nextLine();

        Ticket ticket = new Ticket(name, trainNumber, classType, dateOfJourney, from, to);
        tickets.put("PNR" + (++ticketCount), ticket);
        System.out.println("\nReservation successful.\nYour PNR number is PNR" + ticketCount);
    }

    private static void cancelReservation(Scanner scanner) {
        System.out.println("=================================================");
        System.out.println();
        System.out.println("Enter your PNR number:");
        String pnr = scanner.nextLine();
        if (tickets.containsKey(pnr)) {
            Ticket ticket = tickets.get(pnr);
            System.out.println("=================================================");
            System.out.println();
            System.out.println("Ticket Details:");
            System.out.println("Name: " + ticket.name);
            System.out.println("Train Number: " + ticket.trainNumber);
            System.out.println("Class Type: " + ticket.classType);
            System.out.println("Date of Journey: " + ticket.dateOfJourney);
            System.out.println("From: " + ticket.from);
            System.out.println("To: " + ticket.to);
            System.out.println("Press OK to confirm cancellation.");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("OK")) {
                tickets.remove(pnr);
                System.out.println("Ticket with PNR " + pnr + " cancelled successfully.");
            } else {
                System.out.println("Cancellation aborted.");
            }
        } else {
            System.out.println("Invalid PNR number.");
        }
    }
}
