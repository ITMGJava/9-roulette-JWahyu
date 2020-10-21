public class Roulette extends RoulletteOnderdelen {

    public static void main(String[] args) {

        //  Initiatie spel: Amerikaanse Roulette.
        System.out.printf("%n―――――――――――――――――――――――――――――――――――――――――%n");
        System.out.print("♤♥♣♦ Welkom bij het spel Amerikaanse Roulette in ons casino! ♦♣♥♤");
        System.out.printf("%n―――――――――――――――――――――――――――――――――――――――――%n");

        // Invoer: nieuw spel of stop programma.
        while (!checkNieuwSpel) {
            System.out.printf("%nWil je een nieuw potje starten?%n%nDruk 'J/j' for ja of 'N/n' for nee om te stoppen en bevestig vervolgens je antwoord met 'ENTER'-toets: ");
            var invoerExitGame = invoer.nextLine();

            // Optie Nieuw Spel: invoer 'J/j' nieuw / herhaal programma.
            if (invoerExitGame.equalsIgnoreCase("j")) {

                // Parent class Roulette.
                Roulette roulette = new Roulette(); // Constructor wordt hier gerund.

                System.out.printf("%n――――――――――――――%n");
                System.out.print("♤♥♣♦  NIEUW POTJE ♦♣♥♤");
                System.out.printf("%n――――――――――――――%n");

                System.out.printf("%nGraag je naam invullen en bevestig vervolgens je keuze met 'ENTER'-toets: ");
                String spelerNaam = invoer.nextLine();

                System.out.printf("" +
                        "%nAangenaam " + spelerNaam + "! Je speelt 10 rondes roulette met een begin-inzet van: € " + inzetSpeler + ",-%n" +
                        "Als je een ronde wint dan ontvang je het dubbele van jouw ronde-inzet!%n%n" +

                        "Je kan per ronde op twee manier wedden:%n" +
                        "1. Veilig: wedden op even of oneven.%n" +
                        "2. Gewaagd: wedden op een nummer.%n%n" +
                        "Heb je de ronde verloren of bij uitkomst 0 dan wint de bank en verlies je jouw ronde-inzet!%n%n" +
                        "We gaan beginnen! Succes!%n");

                // Invoer: Druk op 'ENTER'-toets om door te gaan.
                invoerEnter();

                // 10 Rondes Roulette.
                for (rondeNummer = 1; rondeNummer <= 10; rondeNummer++) {
                    ronde();
                    // Invoer: Druk op 'ENTER'-toets om door te gaan.
                    invoerEnter();
                } // Einde 10 Rondes Roulette.

                System.out.printf("%n――――――――――――――%n");
                System.out.print("♤♥♣♦  EINDE POTJE ♦♣♥♤");
                System.out.printf("%n――――――――――――――%n");

                reset();
            } // Einde Optie Nieuwe Spel: invoer 'J/j' nieuw spel.


            else if (invoerExitGame.equalsIgnoreCase("n")) // Optie Nieuwe Spel: invoer 'N/n' einde programma.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print("Dat was het dan. Dank voor het spelen en tot ziens! :)");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                checkNieuwSpel = true;


            } // Einde Optie Nieuwe Spel: invoer 'N/n' einde programma.

            else // Optie Nieuwe Spel: ongeldige invoer.
            {
                geenGeldigeInvoer();
                checkNieuwSpel = false;
            } // Einde Optie Nieuwe Spel: ongeldige invoer.

        } // Einde Nieuwe Spel.
    } // Einde public static void main(String[] args)
} // Einde public class AmerikaanseRoulette extends Roulette
