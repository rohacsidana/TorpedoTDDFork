package teszt;

import modell.Hajo;
import modell.Palya;

public class TorpedoTeszt {

    private Hajo hajo;

    public TorpedoTeszt() {
        hajo = new Hajo(new int[]{2, 3, 4});
        System.out.println("*** Tesztesetek ***");
        tesztLovesTalalt(4);
        tesztLovesNemTalalt(5);
        tesztLovesSullyedt();
        tesztLovesNemSullyedt();
        System.out.println("*** Tesztesetek VÉGE ***");
    }

    public static void main(String[] args) {
        new TorpedoTeszt();
    }

    public void tesztLovesTalalt(int poz) {
        System.out.println("--talált");
        hajo = new Hajo(new int[]{2, 3, 4});
        String t = hajo.talalat(poz);
        assert t.equals("talált") : "nem jó a találat ellenőrzése";
        System.out.println("Találat teszt sikeres");
    }

    public void tesztLovesNemTalalt(int poz) {
        System.out.println("--mellé");
        hajo = new Hajo(new int[]{2, 3, 4});
        String t = hajo.talalat(poz);
        assert t.equals("mellé") : "nem jó a találat ellenőrzése";
        System.out.println("Mellé teszt sikeres");
    }

    public void tesztLovesSullyedt() {
        System.out.println("--süllyedt");
        hajo = new Hajo(new int[]{2, 3, 4});
        hajo.talalat(2);
        hajo.talalat(3);
        hajo.talalat(4);
        boolean s = hajo.isElsullyedt();
        assert s == true : "nem jó a találat ellenőrzése";
        System.out.println("Süllyedt teszt sikeres");
    }

    public void tesztLovesNemSullyedt() {
        System.out.println("--nem süllyedt");
        hajo = new Hajo(new int[]{2, 3, 4});
        hajo.talalat(5);
        hajo.talalat(6);
        hajo.talalat(7);
        boolean s = hajo.isElsullyedt();
        assert s != true : "nem jó a találat ellenőrzése";
        System.out.println("Nem süllyedt teszt sikeres");
    }
}
