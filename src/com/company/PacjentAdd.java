package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PacjentAdd implements narzedzia{

    Queue<Pacjenci> listaPacjentow = new LinkedList();  //zbiornik na pacientow
    public void ListaPacjentow(Queue<Pacjenci> listaPacjentow) {
    }

    public void dodajPacjenta(Pacjenci pacjenci) {

        System.out.print("Podaj imię nowego pacjenta: ");
        pacjent.setImie(odczyt.nextLine());

        System.out.print("Podaj jego nazwisko: ");
        pacjent.setNazwisko(odczyt.nextLine());

        listaPacjentow.add(pacjenci);
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

