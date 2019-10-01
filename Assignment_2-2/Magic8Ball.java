import java.util.Scanner;
class Magic8Ball {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ask a question that can be answered with a yes or no: ");
        String useless = scanner.nextLine();
        double random01 = Math.random();
        if (random01 < 0.05) {
            System.out.println("As I see it, yes.");
        } else if (random01 < 0.1) {
            System.out.println("Ask again later.");
        } else if (random01 < 0.15) {
            System.out.println("Better not tell you now.");
        } else if (random01 < 0.2) {
            System.out.println("Cannot predict now.");
        } else if (random01 < 0.25) {
            System.out.println("Concentrate and ask again.");
        } else if (random01 < 0.3) {
            System.out.println("Don’t count on it.");
        } else if (random01 < 0.35) {
            System.out.println("It is certain.");
        } else if (random01 < 0.4) {
            System.out.println("It is decidedly so.");
        } else if (random01 < 0.45) {
            System.out.println("Most likely.");
        } else if (random01 < 0.5) {
            System.out.println("My reply is no.");
        } else if (random01 < 0.55) {
            System.out.println("My sources say no.");
        } else if (random01 < 0.6) {
            System.out.println("Outlook not so good.");
        } else if (random01 < 0.65) {
            System.out.println("Outlook good.");
        } else if (random01 < 0.7) {
            System.out.println("Reply hazy, try again.");
        } else if (random01 < 0.75) {
            System.out.println("Signs point to yes.");
        } else if (random01 < 0.8) {
            System.out.println("Very doubtful.");
        } else if (random01 < 0.85) {
            System.out.println("Without a doubt.");
        } else if (random01 < 0.9) {
            System.out.println("Yes.");
        } else if (random01 < 0.95) {
            System.out.println("Yes – definitely.");
        } else {
            System.out.println("You may rely on it.");
        }
    }
}