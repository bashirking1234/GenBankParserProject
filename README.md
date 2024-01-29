# GenBankParserProject

## Overzicht
Dit project bevat een Java-applicatie voor het parsen van GenBank Flat File (GBFF) bestanden. Het stelt gebruikers in staat om specifieke informatie uit deze bestanden te extraheren, zoals de naam van het organisme en auteursinformatie, en om de volledige inhoud van het bestand te bekijken.

## Functies
Extraheren van organisme naam en auteursinformatie uit GBFF-bestanden.

Weergave van de volledige inhoud van GBFF-bestanden.

Gebruikersvriendelijk keuzemenu voor interactie.

## Bestanden in het Project
FileParser.java: Interface die de structuur definieert voor bestandsparsers.

GenBankParser.java: Implementeert de FileParser interface voor het parsen van GBFF-bestanden.

OrganismInfo.java: Klasse die informatie over organismen opslaat, zoals verkregen uit GBFF-bestanden.

Main.java: Bevat de main methode en de gebruikersinterface voor interactie met het systeem.

## Hoe te Gebruiken
Zorg ervoor dat Java is geïnstalleerd op uw systeem.

Compileer de Java-bestanden. Dit kan gedaan worden door een commando zoals javac Main.java uit te voeren in de directory met de broncode.
Voer het programma uit met java Main.

Volg de instructies in het keuzemenu. U zult gevraagd worden om het pad naar het GBFF-bestand in te voeren en een keuze te maken uit de beschikbare opties.

## Uitbereiding van project
Voor het interface kan een GUI gebouw worden inplaats van een bruikbare command tool. 

Een database kan gebouwd worden met verschillende .gbff bestanden,vanuit de database zou het mogelijk gemaakt kunnen worden om per organisme te kijken hoe vaak deze onderzocht is (hoe vaak komt deze voor in gbff bestanden).

De mogelijkheid om per organisme te kijken hoe vaak deze onderzocht is (hoe vaak komt deze voor in gbff bestanden).

De mogelijkheid om gbff bestanden weer te geven in de GUI nadat je een persoon hebt geselecteerd en alle bijbehorende gbff files worden ook weergegeven. 


## Vereisten
Java JDK 8 of hoger.

## Licentie
IntelliJ IDEA 2023.3.2 (Ultimate Edition).

GenBank Loader is auteursrechtelijk beschermd in (2024) door de HAN University of Applied Sciences. Alle rechten voorbehouden.

GenBank Loader valt onder de voorwaarden van de GNU General Public License (GPL) versie 3.

## Auteur
Bashir Hussein

HAN University of Applied Sciences (2024)
