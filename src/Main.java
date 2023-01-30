import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        List<Automobile> automobiles = List.of(
//                new Automobile(true, 1998),
//                new Automobile(true, 2003)
//        );
//        Transmission transmission = new Transmission();
////        ReleaseYear releaseYear = new ReleaseYear();
//
//
//
//        inputTransmission(input, transmission);
//        automobiles = transmission.filter(automobiles);
//        System.out.println(automobiles);
        menu(input);
    }

    public static void menu(Scanner scanner) {
        boolean isOpen = true;
        while (isOpen) {
            System.out.println("Choose an option by the number below:");
            System.out.println("1. Buy a car");
            System.out.println("2. Publish new car");
            System.out.println("3. Exit");
            switch (scanner.nextInt()) {
                case 1 -> buyCar();
                case 2 -> publishCar();
                case 3 -> isOpen = false;
                default -> System.out.println("Pick a number between 1 and 3");
            }
        }
    }

    private static void buyCar() {
    }

    private static void publishCar() {
    }

    private static void inputReleaseYearRange(Scanner scanner, ReleaseYearFilter filter) {
        System.out.println("Enter the range of release.");
        System.out.print("From year: ");
        filter.setFromYear(scanner.nextInt());
        System.out.print("To year: ");
        filter.setToYear(scanner.nextInt());
    }

    public static void inputTransmission(Scanner scanner, TransmissionBoxFilter filter) {
        System.out.println("Choose the transmission:\n0-mechanic\n1-automatic");
        filter.setAutomatic(scanner.nextBoolean());
    }

    public static void inputCondition(Scanner scanner, ConditionFilter filter) {
        System.out.println("Choose the condition of the car:\n0-used\n1-new");
        filter.setCondition(scanner.nextBoolean());
    }
}

//топливо(электрокар инклудед) как отдельный класс, и буу\нью тоже как этаж