import java.util.Scanner;

public class O3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn ett heltall over 0: ");
        int heltall = scanner.nextInt();
        
        if (heltall <= 0) {
            System.out.println("Heltall må være over 0");
            main(args);
            return;
        }
        
        int fact = 1;
        
        for (int i = 1; i < heltall; i++) {
            fact = fact * (i + 1);
        }
        
        System.out.println(fact);
    }
}
