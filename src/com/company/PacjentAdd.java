package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PacjentAdd implements narzedzia{

    List<Pacjenci> listaPacjentow = new ArrayList<Pacjenci>();  //zbiornik na pacientow
    public void ListaPacjentow(Queue<Pacjenci> listaPacjentow) {
    }

    public void dodajPacjenta(Pacjenci pacjent) {

        System.out.print("Podaj imię nowego pacjenta: ");
        pacjent.setImie(odczyt.nextLine());

        System.out.print("Podaj jego nazwisko: ");
        pacjent.setNazwisko(odczyt.nextLine());

        listaPacjentow.add(pacjent);
        System.out.println(" ");
        System.out.println("++++++++ Dodano pacjenta ++++++++");
        System.out.println("Pacjent: " + pacjent.getImie() + " " + pacjent.getNazwisko() + " " );
        System.out.println(" ");
    }

    void wyswietlListePacjentow(Pacjenci pacjenci) {
        System.out.println("++++++++ Lista Pacientów ++++++++");
        System.out.println("Wielkość kolejki: " + listaPacjentow.size());
        System.out.println(listaPacjentow);
    }
}

