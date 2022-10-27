package ba.unsa.etf.rpr;

import java.util.List;

public class Funkcije {
    public static Double SrednjaVrijednost(List<Integer> l) {
        double suma = 0;
        for (int i = 0; i < l.size(); i++)
            suma += l.get(i);
        return suma / l.size();
    }
    public static Double StandardnaDevijacija(List<Integer> l) {
        int N = l.size();
        double mean = SrednjaVrijednost(l);
        double suma = 0;
        for (int i = 0; i < N; i++)
            suma = suma + (l.get(i) - mean) * (l.get(i) - mean);
        double rez = suma/N;
        return Math.sqrt(rez);
    }
}
