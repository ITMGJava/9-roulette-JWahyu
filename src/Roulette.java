public class Roulette extends RouletteOnderdelen {

    public static void main(String[] args) {
        // Initiatie class RouletteOnderdelen
        RouletteOnderdelen nieuw = new RouletteOnderdelen();
        int inzetBeginNieuw = nieuw.getInzetBegin();

        //  Initiatie spel: Amerikaanse Roulette.
        System.out.print("\n―――――――――――――――――――――――――――――――――――――――――――\n");
        System.out.print("♤♥♣♦ Welkom bij het spel Amerikaanse Roulette in ons casino! ♦♣♥♤");
        System.out.print("\n―――――――――――――――――――――――――――――――――――――――――――\n");

        // Invoer: nieuw spel of stop programma.
        while (!nieuw.isSpelGestopt) {
            System.out.print("""

                    Wil je een nieuw potje Amerikaanse Roulette starten?
                    
                    Druk 'J/j' for ja of 'N/n' for nee om te stoppen en bevestig vervolgens je antwoord met 'ENTER'-toets:\s""");
            nieuw.invoerExitGame = nieuw.invoerTekst();

            // Optie Nieuw Spel: invoer 'J/j' nieuw / herhaal programma.
            if (nieuw.invoerExitGame.equalsIgnoreCase("j")) {
//                resetSpel();

                System.out.print("\n――――――――――――――\n");
                System.out.print("♤♥♣♦  NIEUW POTJE ♦♣♥♤");
                System.out.print("\n――――――――――――――\n");
                nieuw.invoerEnter();

                while (!nieuw.isNaamCorrect) {
                    nieuw.isNaamCorrect = false;
                    nieuw.speler1Naam = null;
                    System.out.print("\nGraag jouw naam invullen en bevestig vervolgens je keuze met 'ENTER'-toets: ");
                    nieuw.speler1Naam = nieuw.invoerTekst();

                    System.out.print("\n" + nieuw.speler1Naam + " <- Weet je zeker dat dit klopt?\n" +
                            "Druk 'J/j' for ja of 'N/n' for nee om te stoppen en bevestig vervolgens je antwoord met 'ENTER'-toets: ");
                    nieuw.keuzeJaOfNee = nieuw.invoerTekst();
                    if (nieuw.keuzeJaOfNee.equalsIgnoreCase("j")) {
                        nieuw.isNaamCorrect = true;
                    }
                    else if (nieuw.keuzeJaOfNee.equalsIgnoreCase("n")) {
                        nieuw.isNaamCorrect = false;
                    }
                    else {
                        nieuw.geenGeldigeInvoer();
                    }

                }

                System.out.print("\n――――――――――――――――――――――――――――\n");
                System.out.print("Aangenaam kennis met je te maken " + nieuw.speler1Naam + "!");
                System.out.print("\n――――――――――――――――――――――――――――\n");
                nieuw.invoerEnter();


                System.out.print("\nHoeveel geld wil je als inzet-saldo invoeren, " + nieuw.speler1Naam + "?\n");
                System.out.print("Graag een bedrag met een meervoud van € 5,- invoeren en bevestig vervolgens je keuze met 'ENTER'-toets: ");

                while (!nieuw.isInzetCorrect) {
                    nieuw.isInzetCorrect = false;
                    try {
                        nieuw.setInzetBegin(Integer.parseInt(nieuw.invoerNummer()));
                        inzetBeginNieuw = nieuw.getInzetBegin();

                        if ((inzetBeginNieuw % 5) == 0) {
                            nieuw.isInzetCorrect = true;
                        }
                        else {
                            nieuw.geenGeldigeInvoer();
                            System.out.print("""

                                    Hoeveel geld wil je als inzet-saldo invoeren?
                                    Graag een bedrag met een meervoud van € 5,- invoeren en bevestig vervolgens je keuze met 'ENTER'-toets:\s""");
                            nieuw.isInzetCorrect = false;
                        }
                    }
                    catch (NumberFormatException e) {
                        nieuw.geenGeldigeInvoer();
                        System.out.print("""

                                Hoeveel geld wil je als inzet-saldo invoeren?
                                Graag een bedrag met een meervoud van € 5,- invoeren en bevestig vervolgens je keuze met 'ENTER'-toets:\s""");
                        nieuw.isInzetCorrect = false;
                    }
                }
                nieuw.inzetSaldo = inzetBeginNieuw;
                nieuw.isInzetCorrect = false;

                System.out.print("\n―――――――――――――――――――――――――――――――――――――――――――\n");
                System.out.print("Je hebt het volgende bedrag als inzet-saldo opgewaardeerd: € " + inzetBeginNieuw + ",-");
                System.out.print("\n―――――――――――――――――――――――――――――――――――――――――――\n");
                nieuw.invoerEnter();


                System.out.print("" +
                        "\nWelkom " + nieuw.speler1Naam + "! Je speelt straks 10 rondes roulette met een begin inzet-saldo van: € " + inzetBeginNieuw + ",-\n\n" +

                        "Je kan per ronde op twee manier wedden:\n" +
                        "○ Veilig: wedden op EVEN of ONEVEN. Als je een ronde wint dan ontvang je het DUBBELE van jouw ronde-inzet.\n" +
                        "○ Gewaagd: wedden op een NUMMER. Als je een ronde wint dan ontvang je VIER MAAL jouw ronde-inzet!\n\n" +
                        "Heb je de ronde verloren of bij uitkomst 0 dan wint de bank en verlies je jouw ronde-inzet!\n" +
                        "Als jouw inzet-saldo op is dan kan je dit opwaarderen of stoppen met spelen.\n\n" +
                        "We gaan beginnen! Succes!\n");

                // Invoer: Druk op 'ENTER'-toets om door te gaan.
                nieuw.invoerEnter();



                // 10 Rondes Roulette.
                while (!nieuw.rondeStoppen) {
                    nieuw.rondeStoppen = false;

                    nieuw.resetRonde();

                    System.out.print("\n―――――――――――\n");
                    System.out.print("♤♥♣♦ RONDE " + (nieuw.rondeNummer + 1) + " ♦♣♥♤");
                    System.out.print("\n―――――――――――\n");
                    nieuw.invoerEnter();

                    while (!nieuw.isRondeKlaar) {
                        System.out.print("\nWat voor soort wed wil je wedden, " + nieuw.speler1Naam + "?\n");
                        System.out.print("""
                                            
                    ○ Veilig: wedden op EVEN of ONEVEN. Druk op 'E/e' om voor een even getal te wedden of 'O/o' voor oneven.
                    ○ Gewaagd: wedden op een NUMMER. Voer een getal in van 1 t/m 36.
                    ○ Druk op 'S/s' om je inzet-saldo te checken.
                    ○ Druk op 'Q/q' om met het spel te stoppen.
                    """);
                        System.out.print("\nMaak a.u.b. keuze uit één van de bovenstaande mogelijkheden en bevestig vervolgens je keuze met 'ENTER'-toets: ");
                        nieuw.invoerSpeler1 = nieuw.invoerTekst();

                        if (nieuw.invoerSpeler1.equalsIgnoreCase("e")) { // Optie: Keuze EVEN.
                            nieuw.isInzetCorrect = false;
                            System.out.print("\n―――――――――――――――\n");
                            System.out.print("Je hebt gewed op EVEN.");
                            System.out.print("\n―――――――――――――――\n");
                            nieuw.invoerEnter();

                            while (!nieuw.isInzetCorrect) { // Invoer Ronde-Inzet.
                                nieuw.rondeWedKeuze();
                                nieuw.invoerWedSpeler1 = nieuw.invoerTekst();

                                if (nieuw.invoerWedSpeler1.equalsIgnoreCase("q")) { // Optie Stoppen: terug naar ronde-menu.
                                    nieuw.wedAnnuleren();
                                } // Optie Stoppen: terug naar ronde-menu.

                                else {
                                    try {
                                        nieuw.inzetRondeSpeler1 = Integer.parseInt(nieuw.invoerWedSpeler1);

                                        if (nieuw.inzetRondeSpeler1 <= nieuw.inzetSaldo && (nieuw.inzetRondeSpeler1 % 5) == 0) {
                                            System.out.print("\nJe hebt € " + nieuw.inzetRondeSpeler1 + ",- voor deze ronde ingezet.\n");

                                            nieuw.schijfDraait();
                                            nieuw.uitkomstDraai();

                                            if (nieuw.uitkomstDraai == 0) {
                                                nieuw.uitkomstDraai0();
                                            } else if (nieuw.uitkomstDraai != 0 && (nieuw.uitkomstDraai % 2) == 0) {
                                                System.out.print("\n○ Het balletje is op het EVEN getal " + nieuw.uitkomstDraai + " gevallen. ○\n" +
                                                        "\nJe had op EVEN gewed.\n");
                                                nieuw.rondeGewonnen();
                                            } else if (nieuw.uitkomstDraai != 0 && (nieuw.uitkomstDraai % 2) != 0) {
                                                System.out.print("\n○ Het balletje is op het ONEVEN getal " + nieuw.uitkomstDraai + " gevallen. ○\n" +
                                                        "\nJe had op EVEN gewed.\n");
                                                nieuw.rondeVerloren();
                                            }
                                        } // Einde if ((inzet % 5) == 0)
                                        else if (nieuw.inzetRondeSpeler1 > nieuw.inzetSaldo) {
                                            nieuw.teHogeInzet();
                                        } else {
                                            nieuw.geenGeldigeInvoer();
                                            nieuw.isInzetCorrect = false;
                                        }
                                    } // Einde try
                                    catch (NumberFormatException e) {
                                        nieuw.geenGeldigeInvoer();
                                        nieuw.isInzetCorrect = false;
                                    } // Einde catch
                                } // Einde else
                            } // Einde while (geldigeInzet) { // Invoer Ronde-Inzet.
                        } // Einde if (nieuw.invoerSpeler1.equalsIgnoreCase("e")) // Optie: Keuze EVEN.


                        else if (nieuw.invoerSpeler1.equalsIgnoreCase("o")) { // Optie: Keuze ONEVEN.
                            nieuw.isInzetCorrect = false;

                            System.out.print("\n―――――――――――――――\n");
                            System.out.print("Je hebt gewed op ONEVEN.");
                            System.out.print("\n―――――――――――――――\n");
                            nieuw.invoerEnter();

                            while (!nieuw.isInzetCorrect) { // Invoer Ronde-Inzet.
                                nieuw.rondeWedKeuze();
                                nieuw.invoerWedSpeler1 = nieuw.invoerTekst();

                                if (nieuw.invoerWedSpeler1.equalsIgnoreCase("q")) { // Optie Stoppen: terug naar ronde-menu.
                                    nieuw.wedAnnuleren();
                                } // Optie Stoppen: terug naar ronde-menu.

                                else {

                                    try {
                                        nieuw.inzetRondeSpeler1 = Integer.parseInt(nieuw.invoerWedSpeler1);

                                        if (nieuw.inzetRondeSpeler1 <= nieuw.inzetSaldo && (nieuw.inzetRondeSpeler1 % 5) == 0) {
                                            System.out.print("\nJe hebt € " + nieuw.inzetRondeSpeler1 + ",- voor deze ronde ingezet.\n");

                                            nieuw.schijfDraait();
                                            nieuw.uitkomstDraai();
                                            if (nieuw.uitkomstDraai == 0) {
                                                nieuw.uitkomstDraai0();
                                            } else if (nieuw.uitkomstDraai != 0 && (nieuw.uitkomstDraai % 2) == 0) {
                                                System.out.print("\n○ Het balletje is op het EVEN getal " + nieuw.uitkomstDraai + " gevallen. ○\n" +
                                                        "\nJe had op ONEVEN gewed.\n");
                                                nieuw.rondeVerloren();
                                            } else if (nieuw.uitkomstDraai != 0 && (nieuw.uitkomstDraai % 2) != 0) {
                                                System.out.print("\n○ Het balletje is op het ONEVEN getal " + nieuw.uitkomstDraai + " gevallen. ○\n" +
                                                        "\nJe had op EVEN gewed.\n");
                                                nieuw.rondeGewonnen();
                                            }

                                        } // Einde if ((inzet % 5) == 0)
                                        else if (nieuw.inzetRondeSpeler1 > nieuw.inzetSaldo) {
                                            nieuw.teHogeInzet();
                                        } else {
                                            nieuw.geenGeldigeInvoer();
                                            nieuw.isInzetCorrect = false;
                                        }

                                    } // Einde try
                                    catch (NumberFormatException e) {
                                        nieuw.geenGeldigeInvoer();
                                        nieuw.isInzetCorrect = false;
                                    } // Einde catch
                                } // Einde else
                            } // Einde while (geldigeInzet) { // Invoer Ronde-Inzet.
                        } // Einde else if (nieuw.invoerSpeler1.equalsIgnoreCase("o")) // Optie: Keuze ONEVEN.


                        else if (nieuw.invoerSpeler1.equalsIgnoreCase("s")) {// Optie Saldo: inzet-saldo checken.

                            System.out.print("\n―――――――――――――――――――――――――――――――\n");
                            System.out.print("Jouw inzet-saldo bedraagt op dit moment: € " + nieuw.inzetSaldo + ",-");
                            System.out.print("\n―――――――――――――――――――――――――――――――\n");
                            nieuw.invoerEnter();
                            nieuw.isRondeKlaar = false;

                        } // Einde Optie Saldo: inzet-saldo checken.


                        else if (nieuw.invoerSpeler1.equalsIgnoreCase("q")) { // Optie Stoppen: einde programma.
                            nieuw.spelStoppen();
                            nieuw.isRondeKlaar = true;
                            nieuw.rondeStoppen = true;
                        } // Optie Stoppen: einde programma.


                        else { // Optie Nummer Wedden.
                            nieuw.isInzetCorrect = false;
                            try {
                                nieuw.wedNummer = Integer.parseInt(nieuw.invoerSpeler1);

                                if (nieuw.wedNummer >= 1 && nieuw.wedNummer <= 36) { // Optie: Wedden op NUMMER.
                                    nieuw.invoerSpeler1 = null;
                                    System.out.print("\n―――――――――――――――――\n");
                                    System.out.print("Je hebt gewed op NUMMER: " + nieuw.wedNummer);
                                    System.out.print("\n―――――――――――――――――\n");
                                    nieuw.invoerEnter();

                                    while (!nieuw.isInzetCorrect) { // Invoer Ronde-Inzet.
                                        nieuw.rondeWedKeuze();
                                        nieuw.invoerWedSpeler1 = nieuw.invoerTekst();

                                        if (nieuw.invoerWedSpeler1.equalsIgnoreCase("q")) { // Optie Stoppen: terug naar ronde-menu.
                                            nieuw.wedAnnuleren();
                                        } // Optie Stoppen: terug naar ronde-menu.

                                        else {
                                            try {
                                                nieuw.inzetRondeSpeler1 = Integer.parseInt(nieuw.invoerWedSpeler1);

                                                if (nieuw.inzetRondeSpeler1 <= nieuw.inzetSaldo && (nieuw.inzetRondeSpeler1 % 5) == 0) {
                                                    System.out.print("\nJe hebt € " + nieuw.inzetRondeSpeler1 + ",- voor deze ronde ingezet.\n");

                                                    nieuw.schijfDraait();
                                                    nieuw.uitkomstDraai();

                                                    if (nieuw.uitkomstDraai == 0) {
                                                        nieuw.uitkomstDraai0();
                                                    } else if (nieuw.wedNummer == nieuw.uitkomstDraai) {
                                                        nieuw.rondeGewonnenNummer();
                                                    } else if (nieuw.wedNummer != nieuw.uitkomstDraai) {
                                                        System.out.print("\n○ Het balletje is op het getal " + nieuw.uitkomstDraai + " gevallen. ○\n" +
                                                                "\nJe had op nummer " + nieuw.wedNummer + " gewed.\n");
                                                        nieuw.rondeVerloren();
                                                    }

                                                } else if (nieuw.inzetRondeSpeler1 > nieuw.inzetSaldo) {
                                                    nieuw.teHogeInzet();
                                                } else {
                                                    nieuw.geenGeldigeInvoer();
                                                    nieuw.isInzetCorrect = false;
                                                }
                                            } // Einde try
                                            catch (NumberFormatException e) {
                                                nieuw.geenGeldigeInvoer();
                                                nieuw.isInzetCorrect = false;
                                            } // Einde catch
                                        } // Einde else
                                    } // Einde while (!geldigeInzet) { // Invoer Ronde-Inzet.


                                } // Einde if (nieuw.wedNummer >= 1 && nieuw.wedNummer <= 36) // Optie: Wedden op NUMMER.
                                else {
                                    nieuw.ongeldigeWedNummer();
                                }
                            } // Einde try
                            catch (NumberFormatException e) {
                                nieuw.geenGeldigeInvoer();
                            } // Einde catch
                        } // Einde Optie: Wedden op NUMMER.
                    }
                    nieuw.isInzetCorrect = false;

                    if (nieuw.rondeNummer >= 10) {
                        nieuw.rondeStoppen = true;
                    }
                    else if (nieuw.inzetSaldo <= 0) {
                        nieuw.inzetSaldoOp();
                    }
                } // Einde 10 Rondes Roulette.



                System.out.print("\n――――――――――――――\n");
                System.out.print("♤♥♣♦ EINDSTAND ♦♣♥♤");
                System.out.print("\n――――――――――――――\n");
                nieuw.invoerEnter();

                System.out.print("\nSpeler: " + nieuw.speler1Naam + "\n");
                nieuw.invoerEnter();

                System.out.print("\nAantal gespeelde rondes: " + nieuw.rondeNummer + "\n");
                System.out.print("\nAantal gewonnen rondes: " + nieuw.rondeGewonnen + "\n");
                System.out.print("\nAantal verloren rondes: " + nieuw.rondeVerloren + "\n");
                nieuw.invoerEnter();

                System.out.print("\nBegin inzet-saldo: € " + inzetBeginNieuw + ",-\n");
                System.out.print("\nEind inzet-saldo: € " + nieuw.inzetSaldo + ",-\n");
                System.out.print("\nAantal keer inzet-saldo opgewaardeerd: " + nieuw.aantalKeerOpgeladen + "\n");
                System.out.print("\nTotaal opgewaardeerd bedrag: € " + nieuw.inzetOpgewaardeerdTotaal + ",-\n");
                nieuw.invoerEnter();

                System.out.print("\nTotaal gewonnen bedrag: € " + nieuw.inzetSpeler1GewonnenTotaal + ",-\n");
                System.out.print("\nTotaal verloren bedrag: € " + nieuw.inzetSpeler1VerlorenTotaal + ",-\n");
                nieuw.invoerEnter();

                System.out.print("\n――――――――――――――\n");
                System.out.print("♤♥♣♦  EINDE POTJE ♦♣♥♤");
                System.out.print("\n――――――――――――――\n");
                nieuw.invoerEnter();

                nieuw.resetSpel();
                nieuw.isSpelGestopt = false;
            } // Einde Optie Nieuwe Spel: invoer 'J/j' nieuw spel.


            else if (nieuw.invoerExitGame.equalsIgnoreCase("n")) { // Optie Nieuwe Spel: invoer 'N/n' einde programma.
                System.out.print("\n――――――――――――――――――――――――――――――――――\n");
                System.out.print("Dat was het dan. Dank voor het spelen en tot ziens! :)");
                System.out.print("\n――――――――――――――――――――――――――――――――――\n");
                nieuw.invoerEnter();
                nieuw.isSpelGestopt = true;

            } // Einde Optie Nieuwe Spel: invoer 'N/n' einde programma.

            else { // Optie Nieuwe Spel: ongeldige invoer.
                nieuw.geenGeldigeInvoer();
                nieuw.isSpelGestopt = false;
            } // Einde Optie Nieuwe Spel: ongeldige invoer.

        } // Einde Nieuwe Spel.
    } // Einde public static void main(String[] args)





} // Einde public class AmerikaanseRoulette extends Roulette

