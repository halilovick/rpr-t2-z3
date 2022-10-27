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
        double mean = SrednjaVrijednost(l);
        double suma = 0;
        for (int i = 0; i < l.size(); i++)
            suma = suma + (l.get(i) - mean) * (l.get(i) - mean);
        return Math.sqrt(suma/l.size());
    }
}
