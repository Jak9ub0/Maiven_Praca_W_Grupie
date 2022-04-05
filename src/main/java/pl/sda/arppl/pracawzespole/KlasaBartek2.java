package pl.sda.arppl.pracawzespole;

import java.util.Scanner;

public class KlasaBartek2 {

        public static void main(String[] args) {
            System.out.println("Jak masz na imie: ");
            Scanner scanner = new Scanner(System.in);
            String imie = scanner.next();

            System.out.println("Jak masz na nazwisko: ");
            String nazwisko = scanner.next();

            System.out.println("Podaj numer buta: ");
            int numer = scanner.nextInt();

            System.out.println("Oj, " +imie+" " + nazwisko +" ale masz nogę! Twój rozmiar to " +numer+" ");
        }
}