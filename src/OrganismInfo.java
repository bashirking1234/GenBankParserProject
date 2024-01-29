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


// Klasse om informatie over organismen op te slaan.
public class OrganismInfo {

    private String name;              // Naam van het organisme
    private String authors;           // Auteurs van de publicatie
    private String fileContent;       // Volledige inhoud van het GBFF-bestand

    // Getters en setters voor de eigenschappen van het organisme
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }
}
