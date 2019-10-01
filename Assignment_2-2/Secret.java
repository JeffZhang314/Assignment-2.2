import java.util.Scanner;
class Secret {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's the password? ");
        String input = scanner.nextLine();
        if ("dragon".equals(input)) {
            System.out.println("Correct! My secret is: I am Batman.");
        } else {
            System.out.println("Incorrect Password! My secret is still safe ...");
        }
    }
}