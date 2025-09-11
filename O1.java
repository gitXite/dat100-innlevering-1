import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Hva er din brutto inntekt: ");
        
        int bruttoInntekt = scanner.nextInt();
        int trinn = sjekkTrinn(bruttoInntekt);
        
        double skatteBelop = 0.0;

        // velger "unaturlig" bruk av switch, pga fall-through
        switch (trinn) {
            case 5: 
                skatteBelop += (bruttoInntekt - 1410750) * 0.177;
                bruttoInntekt = 1410750;
            case 4: 
                skatteBelop += (bruttoInntekt - 942400) * 0.167;
                bruttoInntekt = 942400;
            case 3:
                skatteBelop += (bruttoInntekt - 697150) * 0.137;
                bruttoInntekt = 697150;
            case 2:
                skatteBelop += (bruttoInntekt - 306050) * 0.040;
                bruttoInntekt = 306050;
            case 1:
                skatteBelop += (bruttoInntekt - 217400) * 0.017;
                break;
            case 0:
                return;
        }
        
        System.out.println("Skatt å betale: " + skatteBelop);

        scanner.close();
    }

    // hjelpefunksjon for å gjøre implementere switch
    private static int sjekkTrinn(int inntekt) {
        if (inntekt > 1410750) {
            return 5;
        } else if (inntekt > 942400) {
            return 4;
        } else if (inntekt > 697150) {
            return 3;
        } else if (inntekt > 306050) {
            return 2;
        } else if (inntekt > 217400) {
            return 1;
        } else {
            return 0;
        }
    }
}
