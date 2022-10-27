package ba.unsa.etf.rpr;

import java.util.*;

public class Main {
    private static Integer StringUInt(String x) {
        try {
            return Integer.parseInt(x);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    public static void main(String[] args) {
        System.out.println("Unosite brojeve (stop za kraj): ");
        Scanner ulaz = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();
        int x;
        while (true) {
            String u = ulaz.next();
            if ("stop".equalsIgnoreCase(u)) break;
            if (StringUInt(u) == null) continue;
            x = StringUInt(u);
            lista.add(x);
        }
        if (lista == null || lista.size() == 0) {
            System.out.println("Lista je prazna!");
            return;
        }
        System.out.println("Najmanji element: " + Collections.min(lista) + "\nNajveci element: " + Collections.max(lista));
        System.out.println("Srednja vrijednost: " + Funkcije.SrednjaVrijednost(lista) + "\nStandardna devijacija: " + Funkcije.StandardnaDevijacija(lista));
    }
}