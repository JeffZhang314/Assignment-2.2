import java.util.Scanner;
class GradeBot {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What was your test out of? ");
        double perfectScore = scanner.nextDouble();
        System.out.print("What did you get? ");
        double score = scanner.nextDouble();
        if (perfectScore <= 0 || score < 0) {
            System.out.print("Silly human, that's not possible. Quit joking around.");
        } else {
            double percentage = 100 * score/perfectScore;
            String passOrFail, letterGrade, message = "";
            if (percentage < 49.5) {
                passOrFail = "fail";
                letterGrade = " F";
            } else {
                passOrFail = "pass";
                if (percentage < 59.5) {
                    letterGrade = " C-";
                } else if (percentage < 66.5) {
                    letterGrade = " C";
                } else if (percentage < 72.5) {
                    letterGrade = " C+";
                } else if (percentage < 85.5) {
                    letterGrade = " B";
                } else {
                    letterGrade = "n A";
                    message = "keep up the good work.";
                }
            }
            if (message == "") {
                message = "you " + passOrFail + "ed, but you can do better!";
            }
            String output = "You got " + stringRelativeScore(percentage) + "%! That's a" + letterGrade + " ... " + message;
            System.out.println(output);
        }
    }
    
    public static String stringRelativeScore(double input) {
        if (input % 1 == 0.0) {
            int intRelativeScore = (int) input;
            return Integer.toString(intRelativeScore);
        } else {
            return Double.toString(input);
        }
    }
}