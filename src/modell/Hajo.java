package modell;

public class Hajo {

    private int[] poziciok;
    private int sullyedtekSzama;
    private boolean elsullyedt;

    public Hajo(int[] pozicio) {
        this.poziciok = pozicio;
        sullyedtekSzama = 0;
        elsullyedt = false;
    }

    public String talalat(int poz) {
        //eldöntés tétele

        int i = 0;
        while (i < poziciok.length && !(poziciok[i] == poz)) {
            i++;
        }
        if (i < 3) {
            sullyedtekSzama++;
        }
        elsullyedt = sullyedtekSzama == poziciok.length;
        return i < 3 ? "talált" : "mellé";
    }

    public int[] getPozicio() {
        return poziciok;
    }

    
    public boolean isElsullyedt() {
        return elsullyedt;
    }
}
