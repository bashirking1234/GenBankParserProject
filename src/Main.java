import java.util.Scanner;

/*
 * Auteursrecht 2024 HAN University of Applied Sciences, 
 Academie Toegepaste Biowetenschappen & Chemie. Alle rechten voorbehouden.
 *
 * Geschreven door Bashir Hussein <bashirking12@gmail.com>
 *
 * Dit bestand maakt deel uit van GenBankParserProject.
 *
 * GenBankParserProject is vrije software: u kunt het herverdelen en/of aanpassen
 * onder de voorwaarden van de GNU General Public License zoals gepubliceerd door
 * de Free Software Foundation, versie 3 van de Licentie, of
 * (naar uw keuze) enige latere versie.
 *
 */


/**
 * De Main klasse biedt een gebruikersinterface voor het interactief werken met GBFF-bestanden.
 * Gebruikers kunnen kiezen om organisme-informatie of de volledige inhoud van een GBFF-bestand te tonen.
 */
public class Main {

    /**
     * De hoofdmethode die een loop bevat voor de gebruikersinterface.
     * Gebruikers kunnen kiezen tussen verschillende opties in een menu.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileParser parser = new GenBankParser();

        while (true) {
            System.out.println("");
            System.out.println("Kies een optie:");
            System.out.println("1. Toon organisme informatie");
            System.out.println("2. Toon volledige bestandsinhoud");
            System.out.println("3. Afsluiten");
            System.out.print("Voer uw keuze in: ");
            int keuze = scanner.nextInt();

            // Verwerk de gebruikerskeuze
            if (keuze == 1 || keuze == 2) {
                System.out.print("Voer het pad naar het GBFF-bestand in: ");
                String gbffFilePath = scanner.next();
                OrganismInfo organismInfo = parser.parseFile(gbffFilePath);

                // Controleer of het parsen succesvol was
                if (organismInfo != null) {
                    if (keuze == 1) {
                        // Toon organisme informatie
                        System.out.println("Organisme Naam: " + organismInfo.getName());
                        System.out.println("Auteurs: " + organismInfo.getAuthors());
                    } else {
                        // Toon volledige bestandsinhoud
                        System.out.println("Bestandsinhoud:\n" + organismInfo.getFileContent());
                    }
                }

            } else if (keuze == 3) {
                // Sluit het programma af
                System.out.println("Programma afgesloten.");
                break;
            } else {
                // Verwerk ongeldige invoer
                System.out.println("Ongeldige keuze, probeer opnieuw.");
            }
        }
        scanner.close();
    }
}
