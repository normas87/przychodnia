package com.company;
import java.util.Scanner;

public interface narzedzia {
    Scanner odczyt = new Scanner(System.in); //pobierania danych z klawiatury
    PacjentAdd pacjentAdd = new PacjentAdd(); //inicjalizacja zawartosci klasy PracownikAdd bo tam jest metoda dodająca usera
    LekarzAdd lekarzAdd =new LekarzAdd();
    Pacjenci pacjent = new Pacjenci("", "");

    Lekarze lekarzDermatolog = new Lekarze("","",SpecjalizacjeLekarzy.DERMATOLOG);
    Lekarze lekarzChirurg =new Lekarze("","",SpecjalizacjeLekarzy.CHIRURG);
    Lekarze lekarzRodzinny =new Lekarze("","",SpecjalizacjeLekarzy.LEKARZ_RODINNY);

}
