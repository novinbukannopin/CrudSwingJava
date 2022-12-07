package trycatch.d;

/**
 * @author Novin on 30/11/2022
 * @project KelasSwingCrud
 */
public class percobaan5 {
    public static void main(String[] args) throws Salah {
        Salah s = new Salah("Salah disengaja");
        int i = 0;
        if (i == 0) throw s;
    }
}

class Salah extends Exception {
    public Salah() {
    }

    public Salah(String pesan) {
        super(pesan);
    }
}
