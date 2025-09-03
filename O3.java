import java.util.Scanner;

public class O3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn ett heltall over 0: ");
        int heltall = scanner.nextInt();
        
        if (heltall <= 0) {
            System.out.println("Heltall må være over 0, skriv inn nytt tall: ");
            heltall = scanner.nextInt();
        }

        
    }
}
