package pl.sda.arppl;

import java.util.Scanner;

public class Trening_1 {
    public static void main(String[] args) {
        System.out.println("Jak masz na imię: ");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.next();

        System.out.println("Jak ma na imie Twoja dziewczyna: ");
        String imie2 = scanner.next();

        System.out.println("Mam na imię "+imie+" a Moja Najlepsza Kobieta Na World ma na imie "+imie2);

        System.out.println("Podaj swój wiek "+imie+":");
        double wiek = scanner.nextDouble();

        System.out.println("Podaj wiek swojej Dziewczyny: ");
        double wiek2 = scanner.nextDouble();

        double suma = wiek + wiek2;
        double roznica = wiek - wiek2;
        double dzielenie = wiek / wiek2;

        System.out.println("Razem macie "+suma+" lat, a roznica miedzy wami wynosi "+roznica+" lat ");
        System.out.println("Plus wynik dzielenia waszych lat wynosi: "+dzielenie);

    }
}
