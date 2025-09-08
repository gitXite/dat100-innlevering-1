import java.util.Scanner;

public class MyClass {
    
    private static char konverterScore(int score) {
            if (score >= 90) {
                return 'A';
            } else if (score >= 80) {
                return 'B';
            } else if (score >= 60) {
                return 'C';
            } else if (score >= 50) {
                return 'D';
            } else if (score >= 40) {
                return 'E';
            } else {
                return 'F';
            }
        }

    private static int sjekkScore(Scanner scanner) {
        int score = scanner.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Ugyldig score, skriv inn på ny: ");
            sjekkScore(scanner);
        }
        return score;
    }
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Skriv inn score for student nr " + (i + 1) + ": ");
            int score = sjekkScore(scanner);
            char karakter = konverterScore(score);
            System.out.println("Student nr " + (i + 1) + " sin karakter: " + karakter);
        }
        
        scanner.close();
    }
}
