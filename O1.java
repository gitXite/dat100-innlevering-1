import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int bruttoInntekt = scanner.nextInt();
        double trinnSkatt = 0.0; // i desimal, ikke prosent
        double skatteBelop;

        final boolean TRINN_1 = (bruttoInntekt <= 306050);
        final boolean TRINN_2 = (bruttoInntekt > 306050 && bruttoInntekt <= 697150);
        final boolean TRINN_3 = (bruttoInntekt > 697150 && bruttoInntekt <= 942400);
        final boolean TRINN_4 = (bruttoInntekt > 942400 && bruttoInntekt <= 1410750);
        final boolean TRINN_5 = (bruttoInntekt > 1410750);
        
        if (bruttoInntekt > 217400) {
            if (TRINN_1) {
                trinnSkatt = 0.017;
            } else if (TRINN_2) {
                trinnSkatt = 0.040;
            } else if (TRINN_3) {
                trinnSkatt = 0.137;
            } else if (TRINN_4) {
                trinnSkatt = 0.167;
            } else {
                trinnSkatt = 0.177;
            }
        } else {
            return;
        }

        skatteBelop = bruttoInntekt * trinnSkatt;
        
        System.out.println("Trinnskatt: " + trinnSkatt * 100 + "%");
        System.out.println("Skatt å betale: " + skatteBelop);

        scanner.close();
    }
}
