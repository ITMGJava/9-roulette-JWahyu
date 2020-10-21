import java.util.Random;
import java.util.Scanner;

public class RoulletteOnderdelen {
    public static Scanner invoer = new Scanner(System.in);
    public static String invoerSpeler1;
    public static int[] getallen = new int[37];
    public static int wedNummer;
    public static int willekeurigNummer;
    public static int uitkomstDraai;
    public static boolean checkNieuwSpel = false;
    public static boolean rondeKlaar = false;
    public static boolean nogGeenInzet = true;

    public static void getallenArray() {
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = i;
        }
    }


    public static int uitkomstDraai() {
        Random willekeurigNummer = new Random();
        uitkomstDraai = willekeurigNummer.nextInt(getallen.length);
        return uitkomstDraai;
    }



    public static void schijfDraait() {
        System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
        System.out.print("De roulette-schijf wordt gedraaid en het balletje rolt!");
        System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
    }


    public static int inzetSpeler = 200;

    public static int inzet;

    public static void inzetSpeler() {
        System.out.printf("%nOp dit moment heb je € " + inzetSpeler + ",- in bezit");
    }

    public static int rondeNummer = 1;


    public static void invoerEnter() { // Invoer: enter.
        boolean checkEnter = false;
        while (!checkEnter) {
            System.out.printf("%n―――――――――――――――――――――――――%n");
            System.out.print("Druk op 'ENTER'-toets om verder te gaan.");
            System.out.printf("%n―――――――――――――――――――――――――%n");


            String toetsEnter = invoer.nextLine();

            if (toetsEnter.isEmpty()) {
                checkEnter = true;
            } else {
                geenGeldigeInvoer();
                checkEnter = false;
            }
        }
    } // Einde Invoer: enter.




    public static void geenGeldigeInvoer() {
        System.out.printf("%n――――――――――――――――――――――――――%n");
        System.out.print("Geen geldige invoer. Probeer het nogmaals.");
        System.out.printf("%n――――――――――――――――――――――――――%n");
    }



    public static void ronde() {
        rondeKlaar = false;
        System.out.printf("%n―――――――――――%n");
        System.out.print("♤♥♣♦ RONDE " + rondeNummer + " ♦♣♥♤");
        System.out.printf("%n―――――――――――%n");
        System.out.printf(
                "Wat voor soort wed wil je wedden?%n%n" +
                "1. Veilig: wedden op EVEN of ONEVEN. Druk 'E/e' om voor een even getal te wedden of 'O/o' voor oneven.%n" +
                "2. Gewaagd: wedden op een NUMMER. Typ een getal in tussen 1-36.%n" +

                "3. Druk 'Q/q' om met het spel te stoppen.%n");

        while (!rondeKlaar) {
            System.out.printf("%nMaak a.u.b. keuze uit één van de bovenstaande mogelijkheden en bevestig vervolgens je keuze met 'ENTER'-toets: ");
            invoerSpeler1 = invoer.nextLine();

            if (invoerSpeler1.equalsIgnoreCase("e")) // Optie: Keuze EVEN.
            {
                invoer.reset();
                System.out.printf("%n――――――――――――――――――――――――――%n");
                System.out.printf("%nJe hebt gewed op EVEN.%n%n");

                while (!nogGeenInzet) { // Invoer Ronde-Inzet.
                System.out.printf("%nHoeveel wens je voor deze ronde in te zetten? Graag een meervoud van € 5,- invoeren: ");
                String invoerInzet = invoer.nextLine();

                    try {
                        inzet = Integer.parseInt(invoerInzet);
                        if ((inzet % 5) == 0) {
                            System.out.printf("%nJe hebt € " + inzet + ",- voor deze ronde ingezet.");

                            schijfDraait();
                            uitkomstDraai();

                            if (uitkomstDraai == 0) {
                                System.out.printf("%nHet balletje is op het getal " + uitkomstDraai + " gevallen. Je hebt jouw ronde-inzet verloren!%n");
                                inzetSpeler -= inzet;
                                inzetSpeler();
                                nogGeenInzet = false;
                                rondeKlaar = true;
                            } else if (uitkomstDraai != 0 && (uitkomstDraai % 2) == 0) {
                                System.out.printf("%nHet balletje is op het getal " + uitkomstDraai + " gevallen.%n" +
                                                uitkomstDraai + " is een even getal. Je hebt jouw ronde-inzet verdubbeld. Gefeliciteerd!%n");
                                inzetSpeler += inzet;
                                inzetSpeler();
                                nogGeenInzet = false;
                                rondeKlaar = true;
                            } else if (uitkomstDraai != 0 && (uitkomstDraai % 2) != 0) {
                                System.out.printf("%nHet balletje is op het getal " + uitkomstDraai + " gevallen.%n" +
                                                uitkomstDraai + " is een oneven getal. Helaas heb je jouw ronde-inzet verloren!%n");
                                inzetSpeler -= inzet;
                                inzetSpeler();
                                nogGeenInzet = false;
                                rondeKlaar = true;
                            }
                        } else {
                            geenGeldigeInvoer();
                            nogGeenInzet = false;
                        }
                    } catch (Exception e) {
                        geenGeldigeInvoer();

                    }
                }
            } // Einde Optie: Keuze Even.



            if (invoerSpeler1.equalsIgnoreCase("o")) // Optie: Keuze EVEN.
            {
                System.out.printf("%n――――――――――――――――――――――――――%n");
                System.out.printf("%nJe hebt gewed op ONEVEN.%n%n");

                while (nogGeenInzet) { // Invoer Ronde-Inzet.
                    System.out.printf("%nHoeveel wens je voor deze ronde in te zetten? Graag een meervoud van € 5,- invoeren: ");
                    String invoerInzet = invoer.nextLine();

                    try {
                        inzet = Integer.parseInt(invoerInzet);
                        if ((inzet % 5) == 0) {
                            System.out.printf("%nJe hebt € " + inzet + ",- voor deze ronde ingezet.");

                            schijfDraait();
                            uitkomstDraai();

                            if (uitkomstDraai == 0) {
                                System.out.printf("%nHet balletje is op het getal " + uitkomstDraai + " gevallen. Je hebt jouw ronde-inzet verloren!%n");
                                inzetSpeler -= inzet;
                                inzetSpeler();
                                nogGeenInzet = false;
                                rondeKlaar = true;
                            } else if (uitkomstDraai != 0 && (uitkomstDraai % 2) == 0) {
                                System.out.printf("%nHet balletje is op het getal " + uitkomstDraai + " gevallen.%n" +
                                        uitkomstDraai + " is een even getal. Helaas heb je jouw ronde-inzet verloren!%n");
                                inzetSpeler -= inzet;
                                inzetSpeler();
                                nogGeenInzet = false;
                                rondeKlaar = true;
                            } else if (uitkomstDraai != 0 && (uitkomstDraai % 2) != 0) {
                                System.out.printf("%nHet balletje is op het getal " + uitkomstDraai + " gevallen.%n" +
                                        uitkomstDraai + " is een oneven getal. Je hebt jouw ronde-inzet verdubbeld. Gefeliciteerd!%n");
                                inzetSpeler += inzet;
                                inzetSpeler();
                                nogGeenInzet = false;
                                rondeKlaar = true;
                            }
                        } else {
                            geenGeldigeInvoer();
                            nogGeenInzet = false;
                        }
                    } catch (Exception e) {
                        geenGeldigeInvoer();

                    }
                }
            } // Einde Optie: Keuze Even.

            else if (invoerSpeler1.equalsIgnoreCase("q")) // Optie Stoppen: einde programma.
            {
                System.out.printf("%n―――――――――――――――――%n");
                System.out.print("Je hebt het potje gestopt.");
                System.out.printf("%n―――――――――――――――――%n");
                rondeKlaar = true;
                checkNieuwSpel = false;
            } // Optie Stoppen: einde programma.

            else { // Optie Nummer Wedden.
                try {
                    int wedNummer = Integer.parseInt(invoerSpeler1);

                    if (wedNummer >= 1 && wedNummer <= 36) // Optie: Wedden op NUMMER.
                    {
                        System.out.printf("%n――――――――――――――――――――――――――%n");

                        while (nogGeenInzet) { // Invoer Ronde-Inzet.
                            System.out.printf("%nHoeveel wens je voor deze ronde in te zetten? Graag een meervoud van € 5,- invoeren: ");
                            String invoerInzet = invoer.nextLine();

                            try {
                                inzet = Integer.parseInt(invoerInzet);
                                if ((inzet % 5) == 0) {
                                    System.out.printf("%nJe hebt € " + inzet + ",- voor deze ronde ingezet.");

                                    schijfDraait();
                                    uitkomstDraai();

                                    if (uitkomstDraai == 0) {
                                        System.out.printf("%nHet balletje is op het getal " + uitkomstDraai + " gevallen. Je hebt jouw ronde-inzet verloren!%n");
                                        inzetSpeler -= (inzet * 4);
                                        inzetSpeler();
                                        nogGeenInzet = false;
                                        rondeKlaar = true;
                                    } else if (wedNummer == uitkomstDraai) {
                                        System.out.printf("%nHet balletje is op het getal " + uitkomstDraai + " gevallen.%n" +
                                                "Dat is precies het nummer waar je op hebt gewed! Je ontvangt vier keer je ronde-inzet. Kaching!!!%n");
                                        inzetSpeler += (inzet * 4);
                                        inzetSpeler();
                                        nogGeenInzet = false;
                                        rondeKlaar = true;
                                    } else if (wedNummer != uitkomstDraai) {
                                        System.out.printf("%nHet balletje is op het getal " + uitkomstDraai + " gevallen. Je hebt jouw ronde-inzet verloren!%n");
                                        inzetSpeler -= (inzet * 4);
                                        inzetSpeler();
                                        nogGeenInzet = false;
                                        rondeKlaar = true;
                                    }

                                } else {
                                    geenGeldigeInvoer();
                                    nogGeenInzet = false;
                                }
                            } catch (Exception e) {
                                geenGeldigeInvoer();

                            }
                        }


                        } // Einde Optie: Wedden op NUMMER.
                } catch (Exception e) {
                    geenGeldigeInvoer();
                }
            } // Einde Optie Nummer Wedden.

        }
    } // Einde Ronde.


    // Reset alle ArrayLists voor een nieuw spel.
    public static void reset() {
        invoer.reset();
        inzetSpeler = 100;
    }
    // Einde public static void reset() reset alle ArrayLists voor een nieuw spel.


    public static void main(String[] args) {
// Het geeft niets als dit leeg is.
    }

}
