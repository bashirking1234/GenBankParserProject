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
 * Interface voor het parsen van bestanden, ondersteunt uitbreiding naar verschillende bestandstypen.
 */
public interface FileParser {
    OrganismInfo parseFile(String filePath);
}

