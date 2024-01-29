import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

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
 * De GenBankParser klasse implementeert de FileParser interface
 * en is verantwoordelijk voor het parsen van GenBank Flat File (GBFF) bestanden.
 * Deze klasse leest en verwerkt een GBFF-bestand om informatie te extraheren,
 * zoals de naam van het organisme en auteurs van de publicatie.
 */
public class GenBankParser implements FileParser {

    /**
     * Parseert een GBFF-bestand en extrahereert relevante informatie.
     *
     * @param filePath Het pad naar het GBFF-bestand dat geparseerd moet worden.
     * @return Een OrganismInfo object met geëxtraheerde informatie uit het bestand.
     */
    @Override
    public OrganismInfo parseFile(String filePath) {
        OrganismInfo organismInfo = new OrganismInfo();
        StringBuilder fileContent = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            boolean inDefinition = false; // Vlag om aan te geven dat we in de DEFINITION sectie zijn.
            boolean inAuthors = false;     // Vlag om aan te geven dat we in de AUTHORS sectie zijn.

            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");

                // Extract de DEFINITION sectie. Deze sectie bevat de naam van het organisme.
                if (line.startsWith("DEFINITION")) {
                    inDefinition = true;
                    organismInfo.setName(line.substring(11).trim());
                } else if (inDefinition && line.startsWith(" ")) {
                    organismInfo.setName(organismInfo.getName() + " " + line.trim());
                } else {
                    inDefinition = false;
                }

                // Extract de AUTHORS sectie. Deze sectie bevat de namen van de auteurs.
                if (line.startsWith("  AUTHORS")) {
                    inAuthors = true;
                    organismInfo.setAuthors(line.substring(8).trim());
                } else if (inAuthors && line.startsWith(" ")) {
                    organismInfo.setAuthors(organismInfo.getAuthors() + " " + line.trim());
                } else {
                    inAuthors = false;
                }

            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Bestand niet gevonden: " + e.getMessage());
            return null;
        } catch (IOException e) {
            System.err.println("Fout bij het lezen van het bestand: " + e.getMessage());
            return null;
        }

        // Zet de volledige inhoud van het bestand in het OrganismInfo object.
        organismInfo.setFileContent(fileContent.toString());
        return organismInfo;
    }
}
