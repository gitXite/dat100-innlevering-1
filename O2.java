// litt vanskelig å tolke nøyaktig hvordan b) og c) skulle løses
// jeg har gjort en hybrid løsning mellom Scanner input hvis man har en og en score, eller input arguments hvis man har en liste med student scores
// angående c) så har jeg valgt rekursjon hvis man skriver en ugyldig score for å lese av nextInt() igjen, med input arguments i en liste går ikke dette
import java.util.Scanner;

public class MyClass {
    
    public static char konverterScore(int score) {
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
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0; 
        char karakter = ' ';
        
        if (args.length == 0) {
            System.out.print("Skriv inn score: ");
            score = scanner.nextInt();
            
            if (score < 0 || score > 100) {
                System.out.println("Ugyldig score, prøv på ny");
                main(args);
            } else {
                karakter = konverterScore(score);
                
                System.out.println("Din karakter: " + karakter);
            }
        } else {
            for (int i = 0; i < args.length; i++) {
                score = Integer.parseInt(args[i]);
                
                if (score < 0 || score > 100) {
                    System.out.println("Ugyldig score");
                    continue;
                }
                
                karakter = konverterScore(score);
                
                System.out.println("Din karakter: " + karakter);
            }
        }

        scanner.close();
    }
}
