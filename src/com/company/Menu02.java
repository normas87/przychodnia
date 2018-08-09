package com.company;

import java.util.Scanner;

public class Menu02 implements narzedzia {

    public void wyborSpecjalizacji() {

        System.out.println("Jakiego lekarza chcesz dodać? ");
        System.out.println("1 = Dermatolog");
        System.out.println("2 = Hirurg");
        System.out.println("3 = Lekarz Rodzinny");
        System.out.println("0 = Powrót do menu głównego");

        Scanner odczyt = new Scanner(System.in);
        for (int i = 1; i <= 3; i++)
            System.out.print("");
        boolean exit = false;
        int wyborMenu;
        do {
            System.out.print("Wpisz z klawiatury co robimy i zatwierdź enterem: ");
            wyborMenu = odczyt.nextInt();
            switch (wyborMenu) {
                case 1:
                    System.out.println("Wybrano 1   Dodajemy nowego Dermatologa");
                    LekarzAdd dodajemyDermatologa = new LekarzAdd();
                    dodajemyDermatologa.dodajLekarzaDermatologa(lekarzDermatolog);

                    break;
                case 2:
                    System.out.println("Wybrano 2   Dodajemy nowego Hirurga");
                    LekarzAdd dodajemyHirurga = new LekarzAdd();
                    dodajemyHirurga.dodajLekarzaChirurga(lekarzChirurg);

                    break;

                case 3:
                    System.out.println("Wybrano 3   Dodajemy nowego Lekarza Rodzinnego");
                    LekarzAdd dodajemyLekarzaRodzinnego = new LekarzAdd();
                    dodajemyLekarzaRodzinnego.dodajLekarzaRodzinnego(narzedzia.lekarzRodzinny);
                    break;

                case 4:
                    System.out.println("Wybrano 4   Wyświetlam liste wszystkich zatrudnionych lekarzy");
                    LekarzAdd listaZatrudnionychLekarzy = new LekarzAdd();
                    listaZatrudnionychLekarzy.wyswietlListeChirurgow(lekarzChirurg);
                    break;
                case 0:

                    exit = true;
                    break;

                default:
                    System.out.println("Wprowadzono złe dane");
                    System.out.println("Error - wybież cyfre z dostępnych w menu, czyli od 0 do 4");
            }
        } while (!exit);
        System.out.println(" ");
    }
}


