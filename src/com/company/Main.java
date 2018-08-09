package com.company;

import java.util.Scanner;

public class Main implements narzedzia{

    public static void main(String[] args) {

       MenuGlowne menuGlowne = new MenuGlowne();
       menuGlowne.menuGlowne();

            Scanner odczyt = new Scanner(System.in);
            for (int i = 1; i <= 4; i++)
                System.out.print("");
            boolean exit = false;
            int wyborMenu;
            do {
                System.out.print("Wpisz z klawiatury co robimy i zatwierdź enterem: ");
                wyborMenu = odczyt.nextInt();
                switch (wyborMenu) {
                    case 1:
                        System.out.println("Wybrano 1   Dodajemy nowego pacjenta...");
                    pacjentAdd.dodajPacjenta(pacjent);
                        menuGlowne.menuGlowne();
                        break;
                    case 2:
                        System.out.println("Wybrano 2 Dodajemy nowego lekarza...");
                        Menu02 menu02 = new Menu02();
                        menu02.wyborSpecjalizacji();
                        menuGlowne.menuGlowne();
                        break;

                    case 3:
                        System.out.println("Wybrano 3");
                        break;

                    case 4:

                        pacjentAdd.wyswietlListePacjentow(pacjent);

                        break;

                    case 0:
                        exit = true;
                        break;

                    default:
                        System.out.println("Wprowadzono złe dane");
                        System.out.println("Error - wybież cyfre z dostępnych w menu, czyli od 0 do 4");

                }

            } while (!exit);
            System.out.println("Wybrano: Exit");
        }
    }
