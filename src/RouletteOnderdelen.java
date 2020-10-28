import java.util.Random;
import java.util.Scanner;

public class RouletteOnderdelen {
    protected Scanner invoer = new Scanner(System.in);

    protected String invoerExitGame = null;
    protected String keuzeJaOfNee = null;
    protected String speler1Naam = null;
    protected String invoerSpeler1 = null;
    protected String invoerWedSpeler1 = null;

    private int inzetBegin = 100;
    protected int inzetSaldo = 0;
    protected int inzetOpgewaardeerd = 0;
    protected int inzetOpgewaardeerdTotaal = 0;
    protected int aantalKeerOpgeladen = 0;
    protected int inzetRondeSpeler1 = 5;
    protected int inzetSpeler1GewonnenTotaal = 0;
    protected int inzetSpeler1VerlorenTotaal = 0;
    protected int wedNummer = 0;
    protected int uitkomstDraai = 0;
    protected int rondeNummer = 0;
    protected int rondeGewonnen = 0;
    protected int rondeVerloren = 0;

    protected boolean isNaamCorrect = false;
    protected boolean isSaldoOpgeladen = false;
    protected boolean isInzetCorrect = false;
    protected boolean isInzetSaldoCorrect = false;
    protected boolean isSpelGestopt = false;
    protected boolean isRondeKlaar = false;
    protected boolean rondeStoppen = false;


    // Get-Set alle methodes

    // Get-Set methodes int
    public int getInzetBegin() {
        return inzetBegin;
    }

    public void setInzetBegin(int inzetBegin) {
        this.inzetBegin = inzetBegin;
    }


    public int getInzetSaldo() {
        return inzetSaldo;
    }

    public void setInzetSaldo(int inzetSaldo) {
        this.inzetSaldo = inzetSaldo;
    }


    public int getInzetOpgewaardeerd() {
        return inzetOpgewaardeerd;
    }

    public void setInzetOpgewaardeerd(int inzetOpgewaardeerd) {
        this.inzetOpgewaardeerd = inzetOpgewaardeerd;
    }


    public int getInzetOpgewaardeerdTotaal() {
        return inzetOpgewaardeerdTotaal;
    }

    public void setInzetOpgewaardeerdTotaal(int inzetOpgewaardeerdTotaal) {
        this.inzetOpgewaardeerdTotaal = inzetOpgewaardeerdTotaal;
    }


    public int getAantalKeerOpgeladen() {
        return aantalKeerOpgeladen;
    }

    public void setAantalKeerOpgeladen(int aantalKeerOpgeladen) {
        this.aantalKeerOpgeladen = aantalKeerOpgeladen;
    }


    public int getInzetRondeSpeler1() {
        return inzetRondeSpeler1;
    }

    public void setInzetRondeSpeler1(int inzetRondeSpeler1) {
        this.inzetRondeSpeler1 = inzetRondeSpeler1;
    }


    public int getInzetSpeler1GewonnenTotaal() {
        return inzetSpeler1GewonnenTotaal;
    }

    public void setInzetSpeler1GewonnenTotaal(int inzetSpeler1GewonnenTotaal) {
        this.inzetSpeler1GewonnenTotaal = inzetSpeler1GewonnenTotaal;
    }


    public int getInzetSpeler1VerlorenTotaal() {
        return inzetSpeler1VerlorenTotaal;
    }

    public void setInzetSpeler1VerlorenTotaal(int inzetSpeler1VerlorenTotaal) {
        this.inzetSpeler1VerlorenTotaal = inzetSpeler1VerlorenTotaal;
    }


    public int getWedNummer() {
        return wedNummer;
    }

    public void setWedNummer(int wedNummer) {
        this.wedNummer = wedNummer;
    }


    public int getUitkomstDraai() {
        return uitkomstDraai;
    }

    public void setUitkomstDraai(int uitkomstDraai) {
        this.uitkomstDraai = uitkomstDraai;
    }


    public int getRondeNummer() {
        return rondeNummer;
    }

    public void setRondeNummer(int rondeNummer) {
        this.rondeNummer = rondeNummer;
    }


    public int getRondeGewonnen() {
        return rondeGewonnen;
    }

    public void setRondeGewonnen(int rondeGewonnen) {
        this.rondeGewonnen = rondeGewonnen;
    }


    public int getRondeVerloren() {
        return rondeVerloren;
    }

    public void setRondeVerloren(int rondeVerloren) {
        this.rondeVerloren = rondeVerloren;
    }
    // Einde Get-Set methodes int



    // Get-Set methodes boolean
    public String getInvoerExitGame() {
        return invoerExitGame;
    }

    public void setInvoerExitGame(String invoerExitGame) {
        this.invoerExitGame = invoerExitGame;
    }

    public String getKeuzeJaOfNee() {
        return keuzeJaOfNee;
    }

    public void setKeuzeJaOfNee(String keuzeJaOfNee) {
        this.keuzeJaOfNee = keuzeJaOfNee;
    }

    public String getSpeler1Naam() {
        return speler1Naam;
    }

    public void setSpeler1Naam(String speler1Naam) {
        this.speler1Naam = speler1Naam;
    }

    public String getInvoerSpeler1() {
        return invoerSpeler1;
    }

    public void setInvoerSpeler1(String invoerSpeler1) {
        this.invoerSpeler1 = invoerSpeler1;
    }

    public String getInvoerWedSpeler1() {
        return invoerWedSpeler1;
    }

    public void setInvoerWedSpeler1(String invoerWedSpeler1) {
        this.invoerWedSpeler1 = invoerWedSpeler1;
    }

    public boolean getRondeStoppen() {
        return rondeStoppen;
    }

    public void setRondeStoppen(boolean rondeStoppen) {
        this.rondeStoppen = rondeStoppen;
    }
    // Einde Get-Set methodes boolean

    // Einde Get-Set alle methodes



     // Constructor
    public RouletteOnderdelen() {
        this.invoerExitGame = invoerExitGame;
        this.keuzeJaOfNee = keuzeJaOfNee;
        this.speler1Naam = speler1Naam;
        this.invoerSpeler1 = invoerSpeler1;
        this.invoerWedSpeler1 = invoerWedSpeler1;

        this.inzetBegin = inzetBegin;
        this.inzetSaldo = inzetSaldo;
        this.inzetOpgewaardeerd = inzetOpgewaardeerd;
        this.inzetOpgewaardeerdTotaal = inzetOpgewaardeerdTotaal;
        this.aantalKeerOpgeladen = aantalKeerOpgeladen;
        this.inzetRondeSpeler1 = inzetRondeSpeler1;
        this.inzetSpeler1GewonnenTotaal = inzetSpeler1GewonnenTotaal;
        this.inzetSpeler1VerlorenTotaal = inzetSpeler1VerlorenTotaal;
        this.wedNummer = wedNummer;
        this.uitkomstDraai = uitkomstDraai;
        this.rondeNummer = rondeNummer;
        this.rondeGewonnen = rondeGewonnen;
        this.rondeVerloren = rondeVerloren;

        this.isNaamCorrect = isNaamCorrect;
        this.isSaldoOpgeladen = isSaldoOpgeladen;
        this.isInzetCorrect = isInzetCorrect;
        this.isInzetSaldoCorrect = isInzetSaldoCorrect;
        this.isSpelGestopt = isSpelGestopt;
        this.isRondeKlaar = isRondeKlaar;
        this.rondeStoppen = rondeStoppen;
    }


    final void uitkomstDraai() {
        int[] getallen = new int[37];
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = i;
        }
        Random willekeurigNummer = new Random();
        uitkomstDraai = willekeurigNummer.nextInt(getallen.length);
    }




    final void schijfDraait() {
        System.out.print("\n――――――――――――――――――――――――――――――――――\n");
        System.out.print("De roulette-schijf wordt gedraaid en het balletje rolt!");
        System.out.print("\n――――――――――――――――――――――――――――――――――\n");
        invoerEnter();
    }



    public String invoer() {
        return invoer.nextLine();
    }

    public String invoerTekst() {
        invoer.reset();
        return invoer.nextLine();
    }

    public String invoerNummer() {
        invoer.reset();
        return invoer.nextLine();
    }


    final void invoerEnter() { // Invoer: enter.
        boolean checkEnter = false;
        while (!checkEnter) {
            System.out.print("\n―――――――――――――――――――――――――\n");
            System.out.print("Druk op 'ENTER'-toets om verder te gaan.");
            System.out.print("\n―――――――――――――――――――――――――\n");

            String toetsEnter = invoer();

            if (toetsEnter.isEmpty()) {
                checkEnter = true;
            }
            else {
                checkEnter = true;
            }
        }
    } // Einde Invoer: enter.



    final void geenGeldigeInvoer() {
        System.out.print("\n――――――――――――――――――――――――――\n");
        System.out.print("Geen geldige invoer. Probeer het nogmaals.");
        System.out.print("\n――――――――――――――――――――――――――\n");
        invoerEnter();
    }

    final void ongeldigeWedNummer() {
        System.out.print("\n―――――――――――――――――――――――――――――――\n");
        System.out.print("Je kan slechts op een nummer van 1 t/m 36 wedden!");
        System.out.print("\n―――――――――――――――――――――――――――――――\n");
        invoerEnter();
    }


    final void rondeWedKeuze() {
        System.out.print("\nHoeveel wens je voor deze ronde in te zetten, " + speler1Naam + "?\n");
        System.out.print("""

                                    ○ Graag een bedrag met een meervoud van € 5,- invoeren.
                                    ○ Druk op 'Q/q' om terug te gaan naar het ronde-menu.

                                    Maak a.u.b. keuze uit één van de bovenstaande mogelijkheden en bevestig vervolgens je keuze met 'ENTER'-toets: \s""");
    }

    public void uitkomstDraai0() {
        System.out.print("\n○ Het balletje is op het getal " + uitkomstDraai + " gevallen. ○\n" +
                "\nHelaas heb je jouw ronde-inzet van € " + inzetRondeSpeler1 + ",- verloren, " + speler1Naam + " :(\n");
        rondeNummer++;
        rondeVerloren++;
        inzetSpeler1VerlorenTotaal += inzetRondeSpeler1;
        System.out.print("\nOp dit moment heb je € " + inzetSaldo + ",- - ronde-inzet van € " + inzetRondeSpeler1 + ",- = € " + (inzetSaldo - inzetRondeSpeler1) + ",- in bezit.\n");
        invoerEnter();
        inzetSaldo -= inzetRondeSpeler1;
        isInzetCorrect = true;
        isRondeKlaar = true;
    }

    public void rondeGewonnen() {
        System.out.print("\nJe hebt jouw ronde-inzet van € " + inzetRondeSpeler1 + ",- verdubbeld, je ontvangt dus: € " + (inzetRondeSpeler1 * 2) + ",-. Gefeliciteerd, " + speler1Naam + "! :)\n");
        rondeNummer++;
        rondeGewonnen++;
        inzetSpeler1GewonnenTotaal += inzetRondeSpeler1;
        System.out.print("\nOp dit moment heb je € " + inzetSaldo + ",- - ronde-inzet van € " + inzetRondeSpeler1 + ",- + gewonnen bedrag van twee keer jouw ronde-inzet € " + (inzetRondeSpeler1 * 2) + ",- = € " + (inzetSaldo + inzetRondeSpeler1) + ",- in bezit.\n");
        invoerEnter();
        inzetSaldo += inzetRondeSpeler1;
        isInzetCorrect = true;
        isRondeKlaar = true;
    }

    public void rondeVerloren() {
        System.out.print("\nHelaas heb je jouw ronde-inzet van € " + inzetRondeSpeler1 + ",- verloren, " + speler1Naam + ". :(\n");
        rondeNummer++;
        rondeVerloren++;
        inzetSpeler1VerlorenTotaal += inzetRondeSpeler1;
        System.out.print("\nOp dit moment heb je € " + inzetSaldo + ",- - ronde-inzet van € " + inzetRondeSpeler1 + ",- = € " + (inzetSaldo - inzetRondeSpeler1) + ",- in bezit.\n");
        invoerEnter();
        inzetSaldo -= inzetRondeSpeler1;
        isInzetCorrect = true;
        isRondeKlaar = true;
    }

    public void rondeGewonnenNummer() {
        System.out.print("\n○ Het balletje is op het getal " + uitkomstDraai + " gevallen. ○\n" +
                "\nDat is precies het nummer waar je op hebt gewed!\n" +
                "\nJe ontvangt vier keer je ronde-inzet van € " + inzetRondeSpeler1 + ",-, je ontvangt dus: € " + (inzetRondeSpeler1 * 4) + ",-! Jackpot, " + speler1Naam + "!!! :)\n");
        rondeNummer++;
        rondeGewonnen++;
        inzetSpeler1GewonnenTotaal += (inzetRondeSpeler1 * 3);
        System.out.print("\nOp dit moment heb je € " + inzetSaldo + ",- - ronde-inzet van € " + inzetRondeSpeler1 + ",- + gewonnen bedrag van vier keer jouw inzet € " + (inzetRondeSpeler1 * 4) + ",- = € " + (inzetSaldo + (inzetRondeSpeler1 * 3)) + ",- in bezit.\n");
        invoerEnter();
        inzetSaldo += (inzetRondeSpeler1 * 3);
        isInzetCorrect = true;
        isRondeKlaar = true;
    }



    public void wedAnnuleren() {
        System.out.print("\n――――――――――――――――――――――\n");
        System.out.print("Je gaat terug naar de ronde-menu.");
        System.out.print("\n――――――――――――――――――――――\n");
        invoerEnter();
        invoerWedSpeler1 = null;
        invoerSpeler1 = null;
        isInzetCorrect = true;
        isRondeKlaar = false;
    }


    final void spelStoppen() {
        System.out.print("\n―――――――――――――――――\n");
        System.out.print("Je hebt het potje gestopt.");
        System.out.print("\n―――――――――――――――――\n");
        invoerEnter();
    }

    public void teHogeInzet() {
        System.out.print("\n――――――――――――――――――――――――――――――――――――\n");
        System.out.print("Je kan niet hoger inzetten dan jouw inzet-saldo: € " + inzetSaldo + ",-");
        System.out.print("\n――――――――――――――――――――――――――――――――――――\n");
        invoerEnter();
        isInzetCorrect = false;
    }


    public void inzetSaldoOp() {
        System.out.print("\n―――――――――――――――――――――――――――――――――\n");
        System.out.print("Bankroet! Je bent door jouw inzet-saldo heengegaan!");
        System.out.print("\n―――――――――――――――――――――――――――――――――\n");
        invoerEnter();

        while (!isSaldoOpgeladen) {
            System.out.print("\nWat wil je nu doen, " + speler1Naam + "?\n");
            System.out.print("""

                ○ Voer een bedrag in om dit aan jouw inzet-saldo toe te voegen en om vervolgens door te spelen.
                   Graag dan wel een bedrag met een meervoud van € 5,- invoeren.
                ○ Druk op 'Q/q' om met het spel te stoppen.
                """);
            System.out.print("\nMaak a.u.b. keuze uit één van de bovenstaande mogelijkheden en bevestig vervolgens je keuze met 'ENTER'-toets: ");
            invoerSpeler1 = invoerTekst();


            if (invoerSpeler1.equalsIgnoreCase("q")) { // Optie Stoppen: einde programma.
                spelStoppen();
                isSaldoOpgeladen = true;
                rondeStoppen = true;
            } // Optie Stoppen: einde programma.


            else { // Optie inzet-saldo opwaarderen.
                try {
                    inzetOpgewaardeerd = Integer.parseInt(invoerSpeler1);
                    inzetOpgewaardeerdTotaal += (inzetBegin + inzetOpgewaardeerd);
                    inzetSaldo += inzetOpgewaardeerd;

                    if ((inzetRondeSpeler1 % 5) == 0) {
                        System.out.print("\n――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――\n");
                        System.out.print("Je hebt jouw inzet-saldo opgewaardeerd met het volgende bedrag: € " + inzetSaldo + ",-. We gaan doorspelen, " + speler1Naam + "! :)");
                        System.out.print("\n――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――\n");
                        invoerEnter();
                        aantalKeerOpgeladen++;
                        isInzetSaldoCorrect = true;
                        isSaldoOpgeladen = true;
                    }
                    else {
                        geenGeldigeInvoer();
                        isInzetSaldoCorrect = false;
                    }

                }// Einde try
                catch (NumberFormatException e) {
                    geenGeldigeInvoer();
                } // Einde catch (NumberFormatException e)
            } // Einde else { // Optie inzet-saldo opwaarderen.
        } // Einde while (!isSaldoOpgeladen)

    } // Einde public static void inzetSaldoOp()



    // Reset alle attributen voor een nieuwe ronde.
    public void resetRonde() {
        invoer.reset();

        invoerSpeler1 = null;
        invoerWedSpeler1 = null;

        inzetRondeSpeler1 = 0;
        wedNummer = 0;
        uitkomstDraai = 0;

        isRondeKlaar = false;
        rondeStoppen = false;
        isInzetSaldoCorrect = false;
        isInzetCorrect = false;
        isSaldoOpgeladen = false;
    }
    // Reset alle attributen voor een nieuwe ronde.

    // Reset alle attributen voor een nieuw spel.
    public void resetSpel() {
        invoer.reset();

        invoerExitGame = null;
        keuzeJaOfNee = null;
        speler1Naam = null;
        invoerSpeler1 = null;
        invoerWedSpeler1 = null;

        inzetBegin = 0;
        inzetSaldo = 0;
        inzetOpgewaardeerd = 0;
        inzetOpgewaardeerdTotaal = 0;
        aantalKeerOpgeladen = 0;
        inzetRondeSpeler1 = 0;
        inzetSpeler1GewonnenTotaal = 0;
        inzetSpeler1VerlorenTotaal = 0;
        wedNummer = 0;
        uitkomstDraai = 0;
        rondeNummer = 0;
        rondeGewonnen = 0;
        rondeVerloren = 0;

        isNaamCorrect = false;
        isSaldoOpgeladen = false;
        isInzetSaldoCorrect = false;
        isSpelGestopt = false;
        isRondeKlaar = false;
        rondeStoppen = false;
        isInzetCorrect = false;

    } // Einde Reset alle attributen voor een nieuw spel.



    public static void main(String[] args) {
    // Het geeft niets als dit leeg is.

    }

}
