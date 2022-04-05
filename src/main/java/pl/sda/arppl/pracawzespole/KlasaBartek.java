package pl.sda.arppl.pracawzespole;

import java.util.Scanner;

public class KlasaBartek {

    public static void main(String[] args) {
        System.out.println("Hej! Podaj swoje imię");
        Scanner scanner = new Scanner(System.in);
        String imie  = scanner.next();

        System.out.println("Podaj swoje nazwisko");
        String nazwisko = scanner.next();

        System.out.println("Podaj dowolną liczbę zmiennoprzecinkową");
        double liczba1 = scanner.nextDouble();

        System.out.println("Podaj kolejną liczbę zmiennoprzecinkową");
        double liczba2 = scanner.nextDouble();

        double suma = liczba1 + liczba2;
        double roznica = liczba1 - liczba2;

        System.out.println("Hej " + imie + " " + nazwisko + "! Czy wiesz, że suma podanych liczb to " + suma + ", a różnica to " + roznica );

    }
}

