
/**
 * Interface voor het parsen van bestanden, ondersteunt uitbreiding naar verschillende bestandstypen.
 */
public interface FileParser {
    OrganismInfo parseFile(String filePath);
}

