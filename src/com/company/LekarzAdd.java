package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class LekarzAdd implements narzedzia {

    Queue<Lekarze> listaLekarzyDermatologow = new LinkedList();
    public void ListaLekarzyDermatologow(Queue<Lekarze> listaLekarzyDermatologow) {} //pusty zbiornik na lekarzy dermatologów
    public void dodajLekarzaDermatologa(Lekarze lekarze) { //metoda dodawania dermatologa do powyższej listy

        System.out.print("Podaj imię nowego dermatologa: ");
        lekarzDermatolog.setImie(odczyt.nextLine());

        System.out.print("Podaj jego nazwisko: ");
        lekarzDermatolog.setNazwisko(odczyt.nextLine());
        lekarzDermatolog.setSpecjalizacja(SpecjalizacjeLekarzy.DERMATOLOG);

        System.out.println(pacjent.getImie() + " " + pacjent.getNazwisko() );

        listaLekarzyDermatologow.add(lekarze);
        System.out.println("Dodano nowego Dermatologa");
        MenuGlowne menuGlowne = new MenuGlowne();
        menuGlowne.menuGlowne();
    }


    Queue<Lekarze> listaLekarzyChirurgow = new LinkedList();
    public void ListaLekarzyChirurgow(Queue<Lekarze> listaLekarzyChirurgw) {} //pusty zbiornik na lekarzy Chirurgow
    public void dodajLekarzaChirurga(Lekarze lekarze) {

        System.out.print("Podaj imię nowego hirurga: ");
        lekarzChirurg.setImie(odczyt.nextLine());

        System.out.print("Podaj jego nazwisko: ");
        lekarzChirurg.setNazwisko(odczyt.nextLine());
        lekarzChirurg.setSpecjalizacja(SpecjalizacjeLekarzy.CHIRURG);

        System.out.println(pacjent.getImie() + " " + pacjent.getNazwisko());

        listaLekarzyChirurgow.add(lekarze);
        System.out.println("Dodano nowego Hirurga");
        MenuGlowne menuGlowne = new MenuGlowne();
        menuGlowne.menuGlowne();
    }

    Queue<Lekarze> listaLekarzyRodzinnych = new LinkedList();
    public void ListaLekarzyRodzinnych(Queue<Lekarze> listaLekarzyRodzinnych) {} //pusty zbiornik na lekarzy rodzinnych
    public void dodajLekarzaRodzinnego(Lekarze lekarze) {

        System.out.print("Podaj imię nowego lekarza rodzinnego: ");
        lekarzChirurg.setImie(odczyt.nextLine());

        System.out.print("Podaj jego nazwisko: ");
        lekarzRodzinny.setNazwisko(odczyt.nextLine());
        lekarzRodzinny.setSpecjalizacja(SpecjalizacjeLekarzy.LEKARZ_RODINNY);

        System.out.println(pacjent.getImie() + " " + pacjent.getNazwisko());

        listaLekarzyRodzinnych.add(lekarze);
        System.out.println("Dodano nowego lekarza rodzinnego");
        MenuGlowne menuGlowne = new MenuGlowne();
        menuGlowne.menuGlowne();
    }

   public void wyswietlListeChirurgow(Lekarze lekarze) {
        System.out.println("Liczba zatrudnionych Chirurgów: " + listaLekarzyChirurgow.size());
        System.out.println("Lista chirurgow: " + listaLekarzyChirurgow);
    }

   public void wyswietlListeDermatologow(Lekarze lekarze){
            System.out.println("Liczba zatrudnionych dermatologów: " + listaLekarzyDermatologow.size());
            System.out.println("Lista dermatologow: " + listaLekarzyDermatologow);
        }

   public void wyswietlListeLekarzyRodzinnych(Lekarze lekarze){
        System.out.println("Liczba zatrudnionych lekarzy rodzinnych: " + listaLekarzyRodzinnych.size());
        System.out.println("Lista lekarzy rodzinnych: " + listaLekarzyRodzinnych);
    }







}
