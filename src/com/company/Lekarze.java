package com.company;

public class Lekarze {

    private String imie;
    private String nazwisko;
    private SpecjalizacjeLekarzy specjalizacja;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public SpecjalizacjeLekarzy getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(SpecjalizacjeLekarzy specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public Lekarze(String imie, String nazwisko, SpecjalizacjeLekarzy specjalizacja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.specjalizacja = specjalizacja;
    }

    @Override
    public String toString() {
        return "Lekarze{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", specjalizacja=" + specjalizacja +
                '}';
    }
}
