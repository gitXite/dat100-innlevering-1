import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0; 
        char karakter = ' ';
        
        if (args.length == 0) {
            System.out.print("Skriv inn score: ");
            score = scanner.nextInt();
        }
        
        if (score < 0 || score > 100) {
            System.out.println("Ugyldig score, prøv på ny");
            main(args);
        } else {
            if (score >= 90) {
                karakter = 'A';
            } else if (score >= 80) {
                karakter = 'B';
            } else if (score >= 60) {
                karakter = 'C';
            } else if (score >= 50) {
                karakter = 'D';
            } else if (score >= 40) {
                karakter = 'E';
            } else {
                karakter = 'F';
            }
            
            System.out.println("Din karakter: " + karakter);
        }
    }
}
